package Logica;


import static Logica.MetodosSQL.rs;
import static Logica.MetodosSQL.st;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.sql.Timestamp;

/**
 *
 * @author Edgar
 */
public class Empleado extends Persona{

    private BigDecimal id_empleado;
    
    private String nombre_empleado;
    
    private String apellidos_empleado;
    
    private String direccion_empleado;
    
    private Timestamp f_nacimiento_empleado;
    
    private String telefono_empleado;
    
    private String puesto;
    
    private String contrasenia;
    
    private String usuario;
    
    
    public Empleado() {
    
    }

    public Empleado(BigDecimal id_empleado, String nombre_empleado, String apellidos_empleado, String direccion_empleado, Timestamp f_nacimiento_empleado, String telefono_empleado, String puesto, String contrasenia, String usuario) {
        this.id_empleado = id_empleado;
        this.nombre_empleado = nombre_empleado;
        this.apellidos_empleado = apellidos_empleado;
        this.direccion_empleado = direccion_empleado;
        this.f_nacimiento_empleado = f_nacimiento_empleado;
        this.telefono_empleado = telefono_empleado;
        this.puesto = puesto;
        this.contrasenia = contrasenia;
        this.usuario = usuario;
    }
    
    MetodosSQL metodos = new MetodosSQL();
    
    
    //Variable
    
    
    //Operaciones
    public boolean Ingresar(String Usuario, String Contrasenia)
    {
        setUsuario(Usuario);
        setContrasenia(Contrasenia);
        try {
            metodos.conectar();
<<<<<<< HEAD
            String result = "SELECT * FROM EMPLEADOS WHERE usuario like '" + usuario + "' AND contrasenia like '" + contrasenia + "'";
=======
            String result = "SELECT * FROM EMPLEADOS WHERE usuario like '" + getUsuario() + "' AND contrasenia like '" + getContrasenia() + "'";
>>>>>>> origin/master
            System.out.println(result);
            rs = st.executeQuery(result);
            System.out.println("Entro en el catch");
            if(rs.next()){
                metodos.cn.close();
                return true;
            }
            else
            {   
                System.out.println("pito");
                return false;
            }
            
        } catch (SQLException e) {
            System.out.println("MENSAJOTE DE ERROR BASE" +e);
            return false;
        }
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
     * @return the nombre_empleado
     */
    public String getNombre_empleado() {
        return nombre_empleado;
    }

    /**
     * @param nombre_empleado the nombre_empleado to set
     */
    public void setNombre_empleado(String nombre_empleado) {
        this.nombre_empleado = nombre_empleado;
    }

    /**
     * @return the apellidos_empleado
     */
    public String getApellidos_empleado() {
        return apellidos_empleado;
    }

    /**
     * @param apellidos_empleado the apellidos_empleado to set
     */
    public void setApellidos_empleado(String apellidos_empleado) {
        this.apellidos_empleado = apellidos_empleado;
    }

    /**
     * @return the direccion_empleado
     */
    public String getDireccion_empleado() {
        return direccion_empleado;
    }

    /**
     * @param direccion_empleado the direccion_empleado to set
     */
    public void setDireccion_empleado(String direccion_empleado) {
        this.direccion_empleado = direccion_empleado;
    }

    /**
     * @return the f_nacimiento_empleado
     */
    public Timestamp getF_nacimiento_empleado() {
        return f_nacimiento_empleado;
    }

    /**
     * @param f_nacimiento_empleado the f_nacimiento_empleado to set
     */
    public void setF_nacimiento_empleado(Timestamp f_nacimiento_empleado) {
        this.f_nacimiento_empleado = f_nacimiento_empleado;
    }

    /**
     * @return the telefono_empleado
     */
    public String getTelefono_empleado() {
        return telefono_empleado;
    }

    /**
     * @param telefono_empleado the telefono_empleado to set
     */
    public void setTelefono_empleado(String telefono_empleado) {
        this.telefono_empleado = telefono_empleado;
    }

    /**
     * @return the puesto
     */
    public String getPuesto() {
        return puesto;
    }

    /**
     * @param puesto the puesto to set
     */
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    /**
     * @return the contrasenia
     */
    public String getContrasenia() {
        return contrasenia;
    }

    /**
     * @param contrasenia the contrasenia to set
     */
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    
}
