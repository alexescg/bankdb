package Logica;

import static Logica.MetodosSQL.cn;
import static Logica.MetodosSQL.st;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.sql.Timestamp;
import javax.swing.JOptionPane;

/**
 *
 * @author Edgar
 */
public class Cliente extends Persona{
    
    private BigDecimal id_cliente;
    
    private String nombre_cliente;
    
    private String apellido_cliente;
    
    private String direccion_cliente;
    
    private Timestamp f_nacimiento_cliente;
    
    private String telefono;
    
    private BigDecimal pin;
    
    private MetodosSQL metodos = new MetodosSQL();

    public Cliente() {
    }

    public Cliente(BigDecimal id_cliente, String nombre_cliente, String apellido_cliente, String direccion_cliente, Timestamp f_nacimiento_cliente, String telefono, BigDecimal pin) {
        this.id_cliente = id_cliente;
        this.nombre_cliente = nombre_cliente;
        this.apellido_cliente = apellido_cliente;
        this.direccion_cliente = direccion_cliente;
        this.f_nacimiento_cliente = f_nacimiento_cliente;
        this.telefono = telefono;
        this.pin = pin;
    }
    
    
    
    public boolean altaClientes(String Nombre, String Apellidos,
            String Direccion, String FechaNacimiento, String NumeroTelefono)
    {
            nombre = Nombre;
            apellidos = Apellidos;
            direccion = Direccion;
            fechaNacimiento = FechaNacimiento;
            numeroTelefono = NumeroTelefono;

        try
        {
            getMetodos().conectar();
        
        String result = "INSERT INTO CLIENTES VALUES('','" + nombre + "', '" + //Resul es la concatenacion de valores para hacer una consulta a la base de datos.
                apellidos + "', '" + direccion + "', '" + 
                fechaNacimiento + "', '" + numeroTelefono + "')";
        
        st.execute(result); //Se ejecuta la consulta.
        cn.close(); //Cierra la coneccion con base de datos.     
        JOptionPane.showMessageDialog(null, "Registro Guardado");
        }
        catch(SQLException e)
        {
        JOptionPane.showMessageDialog(null, "Error al llenar datos\n" + e);
        return false;
        }
        return true;
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
     * @return the nombre_cliente
     */
    public String getNombre_cliente() {
        return nombre_cliente;
    }

    /**
     * @param nombre_cliente the nombre_cliente to set
     */
    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    /**
     * @return the apellido_cliente
     */
    public String getApellido_cliente() {
        return apellido_cliente;
    }

    /**
     * @param apellido_cliente the apellido_cliente to set
     */
    public void setApellido_cliente(String apellido_cliente) {
        this.apellido_cliente = apellido_cliente;
    }

    /**
     * @return the direccion_cliente
     */
    public String getDireccion_cliente() {
        return direccion_cliente;
    }

    /**
     * @param direccion_cliente the direccion_cliente to set
     */
    public void setDireccion_cliente(String direccion_cliente) {
        this.direccion_cliente = direccion_cliente;
    }

    /**
     * @return the f_nacimiento_cliente
     */
    public Timestamp getF_nacimiento_cliente() {
        return f_nacimiento_cliente;
    }

    /**
     * @param f_nacimiento_cliente the f_nacimiento_cliente to set
     */
    public void setF_nacimiento_cliente(Timestamp f_nacimiento_cliente) {
        this.f_nacimiento_cliente = f_nacimiento_cliente;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the pin
     */
    public BigDecimal getPin() {
        return pin;
    }

    /**
     * @param pin the pin to set
     */
    public void setPin(BigDecimal pin) {
        this.pin = pin;
    }

    /**
     * @return the metodos
     */
    public MetodosSQL getMetodos() {
        return metodos;
    }

    /**
     * @param metodos the metodos to set
     */
    public void setMetodos(MetodosSQL metodos) {
        this.metodos = metodos;
    }
}
