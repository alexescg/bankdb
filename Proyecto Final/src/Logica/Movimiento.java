
package Logica;

import Forms.FrmMain;
import static Logica.MetodosSQL.cn;
import static Logica.MetodosSQL.rs;
import static Logica.MetodosSQL.st;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Edgar
 */
public class Movimiento {
   
    MetodosSQL metodos = new MetodosSQL();
    Cuenta cuenta = new Cuenta();
    
    public void mostrarTabla(JTable tabla, String Sql)
    {
    try {
            //Para establecer el modelo al JTable
            DefaultTableModel modelo = new DefaultTableModel();
            tabla.setModel(modelo);
            //Para ejecutar la consulta
            st = cn.createStatement();
            //Ejecutamos la consulta y los datos lo almacenamos en un ResultSet
             rs = st.executeQuery(Sql);
            //Obteniendo la informacion de las columnas que estan siendo consultadas
            ResultSetMetaData rsMd = rs.getMetaData();
            //La cantidad de columnas que tiene la consulta
            int cantidadColumnas = rsMd.getColumnCount();
            //Establecer como cabezeras el nombre de las colimnas
            for (int i = 1; i <= cantidadColumnas; i++) {
             modelo.addColumn(rsMd.getColumnLabel(i));
            }
            //Creando las filas para el JTable
            while (rs.next()) {
             Object[] fila = new Object[cantidadColumnas];
             for (int i = 0; i < cantidadColumnas; i++) {
               fila[i]=rs.getObject(i+1);
             }
             modelo.addRow(fila);
            }
            rs.close();
            cn.close();
       } catch (Exception ex) {
        ex.printStackTrace();
       }    
    }
    
    public boolean deposito(int NumCuenta, float Importe) 
    {
        float saldo;
        float total;
        try {
            metodos.conectar();
            String sql = "SELECT saldo FROM Cuentas WHERE id_cuenta = " + NumCuenta;
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            rs.next();
            saldo = rs.getFloat("SALDO");
            total = Importe + saldo;
            cn.commit();
            
            String result = "UPDATE Cuentas set saldo = " + total + 
                    "WHERE id_cuenta = " + NumCuenta;
            st.executeQuery(result);
            
            cn.close();
        } catch (SQLException ex) {
            System.out.println("Error");
        }
        

        return true;
    }
}
