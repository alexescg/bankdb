package Logica;

import java.math.BigDecimal;

/**
 *
 * @author Krystel
 */
public class Referencia {
    
    private BigDecimal id_referencia;
    
    private String nombre;
    
    private String apellido;
    
    private BigDecimal telefono;
    
    private String direccion;
    
    private BigDecimal id_cliente;
    
    private String email;

    public Referencia() {
    }

    public Referencia(BigDecimal id_referencia, String nombre, String apellido, BigDecimal telefono, String direccion, BigDecimal id_cliente, String email) {
        this.id_referencia = id_referencia;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.id_cliente = id_cliente;
        this.email = email;
    }
    
    

    /**
     * @return the id_referencia
     */
    public BigDecimal getId_referencia() {
        return id_referencia;
    }

    /**
     * @param id_referencia the id_referencia to set
     */
    public void setId_referencia(BigDecimal id_referencia) {
        this.id_referencia = id_referencia;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the telefono
     */
    public BigDecimal getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(BigDecimal telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
