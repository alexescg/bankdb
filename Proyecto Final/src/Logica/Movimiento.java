
package Logica;

import static Logica.MetodosSQL.cn;
import static Logica.MetodosSQL.rs;
import static Logica.MetodosSQL.st;
import java.math.BigDecimal;
import java.sql.ResultSetMetaData;
import java.sql.Timestamp;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Edgar
 */
public class Movimiento {
    
    private BigDecimal folio;
    
    private BigDecimal id_empleado;
    
    private Timestamp fecha;
    
    private BigDecimal importe;
    
    private String tipo_movimiento;
    
    private BigDecimal id_cuenta;

    public Movimiento() {
    }

    public Movimiento(BigDecimal folio, BigDecimal id_empleado, Timestamp fecha, BigDecimal importe, String tipo_movimiento, BigDecimal id_cuenta) {
        this.folio = folio;
        this.id_empleado = id_empleado;
        this.fecha = fecha;
        this.importe = importe;
        this.tipo_movimiento = tipo_movimiento;
        this.id_cuenta = id_cuenta;
    }
    
    
    
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

    /**
     * @return the folio
     */
    public BigDecimal getFolio() {
        return folio;
    }

    /**
     * @param folio the folio to set
     */
    public void setFolio(BigDecimal folio) {
        this.folio = folio;
    }

    /**
     * @return the id_empleado
     */
    public BigDecimal getId_empleado() {
        return id_empleado;
    }

    /**
     * @param id_empleado the id_empleado to set
     */
    public void setId_empleado(BigDecimal id_empleado) {
        this.id_empleado = id_empleado;
    }

    /**
     * @return the fecha
     */
    public Timestamp getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the importe
     */
    public BigDecimal getImporte() {
        return importe;
    }

    /**
     * @param importe the importe to set
     */
    public void setImporte(BigDecimal importe) {
        this.importe = importe;
    }

    /**
     * @return the tipo_movimiento
     */
    public String getTipo_movimiento() {
        return tipo_movimiento;
    }

    /**
     * @param tipo_movimiento the tipo_movimiento to set
     */
    public void setTipo_movimiento(String tipo_movimiento) {
        this.tipo_movimiento = tipo_movimiento;
    }

    /**
     * @return the id_cuenta
     */
    public BigDecimal getId_cuenta() {
        return id_cuenta;
    }

    /**
     * @param id_cuenta the id_cuenta to set
     */
    public void setId_cuenta(BigDecimal id_cuenta) {
        this.id_cuenta = id_cuenta;
    }
}
