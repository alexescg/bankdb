package Logica;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

/**
 *
 * @author Krystel
 */
public class OracleUtils {
    
     private static final String url = "jdbc:oracle:thin:@localhost:1521:XE";
    private static final  String usuario ="labs";
    private static final String contrasena = "abcd1234";
    private static Connection con;
    private static Statement st;
    private static String query = null;
    
    
    
    /**
     * Metodo que conecta a la base de datos con la aplicacion.
     * @return conexion a la base de datos para poder interactuar con ella
     */
    public static Connection getDBConexion(){
        try {
            con= DriverManager.getConnection(url,usuario,contrasena);
        } catch (SQLException ex) {
            con = null;
        }
        return con;
    }
    
     /**
     * Metodo generico que mapea las consultas de tipo select a una lista.
     * Necesita:
     * <ul>
     * <li><b>BigDecimal: </b> Para datos numericos</li>
     * <li><b>String: </b> Para datos de cadena</li>
     * <li><b>Timestamp: </b>Para datos de tipo Date</li>
     * </ul>
     * @param connection
     * @param sql
     * @param clase
     * @return Lista con los elementos que devuelva el select
     */
    public static List<?> select(Connection connection, String sql, Class clase) {
        List objects = new ArrayList<>();
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            try (ResultSet rs = ps.executeQuery()) {

                ResultSetMetaData rsmd = rs.getMetaData();
                Integer columnCount = rsmd.getColumnCount();

                while (rs.next()) {
                    Object object = clase.newInstance();

                    for (int i = 1; i <= columnCount; i++) {

                        String name = rsmd.getColumnName(i).toLowerCase();
                        name = String.format("set%s", capitalize(name));

                        Class[] params = new Class[1];
                        Object obj = rs.getObject(i);
                        params[0] = obj.getClass();

                        Method method = clase.getDeclaredMethod(name, params);
                        method.invoke(object, obj);
                    }
                    objects.add(object);
                }
                ps.close();
                connection.close();
            } catch (Exception e) {
                System.out.println("e = 1: " + e);
                ps.close();
                connection.close();
            }

        } catch (Exception e) {
            System.out.println("e = 2: " + e);
        }
        return objects;
        
    }

    /**
     * Metodo para poder ejecutar querys en la base de datos.
     * @param connection
     * @param sql
     */
    public static void executeQuery(Connection connection, String sql) {
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.execute();
        } catch (SQLException e) {

        }
    }
    
    /**
     * Metodo que llena un combobox con los elementos de una lista, utilizando el getter del val de la clase.
     * @param combo
     * @param elementos
     * @param val
     * @param clase
     * @throws Exception 
     */
    public static void fillCombo(JComboBox combo, List<?> elementos, String val, Class clase) throws Exception{
    combo.removeAllItems();
    
    String methodName = String.format("get%s", capitalize(val));
    Method method = clase.getDeclaredMethod(methodName);
        
        elementos.stream().forEach((elemento) -> {

        try {
            combo.addItem(method.invoke(elemento, new Object[0]));
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            Logger.getLogger(OracleUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
    });
}
    
    /**
     * Metodo para capitalizar cualquier palabra
     * @param line
     * @return 
     */
      public static String capitalize(final String line) {
        return Character.toUpperCase(line.charAt(0)) + line.substring(1);
    }

    public static final String VACIO = "";
    public static final String CURRENT_TIMESTAMP = "CURRENT_TIMESTAMP";
    /**
     * Metodo para checar si algun valor es numerico.
     *
     * @param str
     * @return
     */
    public static Boolean isNumeric(String str) {
        try {
            double d = Double.parseDouble(str.trim());
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    /**
     * Metodo para revisar que una cadena no sea nula ni este vacia.
     *
     * @param str
     * @return
     */
    public static Boolean isValidString(String str) {
        return str != null && !str.isEmpty() && !str.trim().isEmpty();
    }

    /**
     * Método que nos verifica si algún valor es una Fecha.
     * 
     * @param fecha
     * @return 
     */
    public static Boolean isFecha(String fecha) {
        if (fecha == null) {
            return false;
        }

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        if (fecha.trim().length() != dateFormat.toPattern().length()) {
            return false;
        }

        dateFormat.setLenient(false);

        try {
            dateFormat.parse(fecha.trim());
        } catch (ParseException pe) {
            return false;
        }
        return true;
    }
}
