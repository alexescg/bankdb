
import Forms.FrmLogin;
import Logica.OracleUtils;

/**
 * Clase que iniciara el sistema y verificara la existencia del usuario de la base de datos que se 
 * utilizara a lo largo de la ejecucion.
 * @author Erik David Zubia Hernandez.
 * @since 16/05/2015
 * @version 1.0
 */
public class InicioSistema {
    
    public static void main(String[] args) {
        if(OracleUtils.verificarUsuario()==true){
            System.out.println("NO entro");
            FrmLogin frmLogin = new FrmLogin(); 
           frmLogin.setVisible(true);
        }else{
            System.out.println("SI entro");
            if((OracleUtils.creacionUsuario() ==true) && (OracleUtils.creacionBase()==true)){
            FrmLogin frmLogin = new FrmLogin();
            frmLogin.setVisible(true);
            }
        }
            }

}
