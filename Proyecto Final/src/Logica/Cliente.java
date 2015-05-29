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
    
    private String apellidos_cliente;
    
    private String direccion_cliente;
    
    private Timestamp f_nacimiento_cliente;
    
    private BigDecimal telefono;
    
    private String email;
    
    
    private MetodosSQL metodos = new MetodosSQL();

    public Cliente() {
    }

    public Cliente(BigDecimal id_cliente, String nombre_cliente, String apellidos_cliente, String direccion_cliente, Timestamp f_nacimiento_cliente, BigDecimal telefono, String email) {
        this.id_cliente = id_cliente;
        this.nombre_cliente = nombre_cliente;
        this.apellidos_cliente = apellidos_cliente;
        this.direccion_cliente = direccion_cliente;
        this.f_nacimiento_cliente = f_nacimiento_cliente;
        this.telefono = telefono;
        this.email = email;
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
     * @return the apellidos_cliente
     */
    public String getApellidos_cliente() {
        return apellidos_cliente;
    }

    /**
     * @param apellidos_cliente the apellidos_cliente to set
     */
    public void setApellidos_cliente(String apellidos_cliente) {
        this.apellidos_cliente = apellidos_cliente;
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
