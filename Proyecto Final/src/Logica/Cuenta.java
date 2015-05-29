package Logica;

import static Logica.MetodosSQL.st;
import java.math.BigDecimal;
import java.sql.Timestamp;
import javax.swing.JOptionPane;

/**
 *
 * @author Edgar
 */
public class Cuenta {

    private BigDecimal id_cuenta;
    
    private Timestamp fecha_apertura;
    
    private Timestamp fecha_cierre;
    
    private String estado;
    
    private BigDecimal id_cliente;

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
     * @return the fecha_apertura
     */
    public Timestamp getFecha_apertura() {
        return fecha_apertura;
    }

    /**
     * @param fecha_apertura the fecha_apertura to set
     */
    public void setFecha_apertura(Timestamp fecha_apertura) {
        this.fecha_apertura = fecha_apertura;
    }

    /**
     * @return the fecha_cierre
     */
    public Timestamp getFecha_cierre() {
        return fecha_cierre;
    }

    /**
     * @param fecha_cierre the fecha_cierre to set
     */
    public void setFecha_cierre(Timestamp fecha_cierre) {
        this.fecha_cierre = fecha_cierre;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the id_cliente
     */
    public BigDecimal getId_cliente() {
        return id_cliente;
    }

    /**
     * @param id_cliente the id_cliente to set
     */
    public void setId_cliente(BigDecimal id_cliente) {
        this.id_cliente = id_cliente;
    }

    
}
