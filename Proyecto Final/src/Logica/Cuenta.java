package Logica;

import static Logica.MetodosSQL.st;
import java.math.BigDecimal;
import javax.swing.JOptionPane;

/**
 *
 * @author Edgar
 */
public class Cuenta {

    private BigDecimal id_cuenta;
    
    private BigDecimal saldo;
    
    private BigDecimal id_saldo;
    
    private String tipo;

    public Cuenta(BigDecimal id_cuenta, BigDecimal saldo, BigDecimal id_saldo, String tipo) {
        this.id_cuenta = id_cuenta;
        this.saldo = saldo;
        this.id_saldo = id_saldo;
        this.tipo = tipo;
    }
    
    
    public Cuenta() {
    
    }
        MetodosSQL metodos = new MetodosSQL();
        
        int contRegistros = 0;
     
    public void altaCuenta()
    {
        if(contRegistros >= 0 ){
            
        }
        
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

    /**
     * @return the saldo
     */
    public BigDecimal getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the id_saldo
     */
    public BigDecimal getId_saldo() {
        return id_saldo;
    }

    /**
     * @param id_saldo the id_saldo to set
     */
    public void setId_saldo(BigDecimal id_saldo) {
        this.id_saldo = id_saldo;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
