package Logica;

import static Logica.MetodosSQL.st;
import javax.swing.JOptionPane;

/**
 *
 * @author Edgar
 */
public class Cuenta {

    public Cuenta() {
        
    }
    
    private int numCuenta;
    private int saldo;
    
    MetodosSQL metodos = new MetodosSQL();
     
    public void altaCuenta()
    {        
        try
    {
        metodos.conectar();
        
        String result = "INSERT INTO CUENTAS VALUES('";
        st.execute(result);
        metodos.cn.close();
        JOptionPane.showMessageDialog(null, "Registro Guardado");
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null, "Error al llenar datos\n" + e);
    }
}
}
