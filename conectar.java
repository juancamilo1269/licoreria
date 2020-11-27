package clases;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Angie Jimenez
 */
public class conectar {
   private static Connection conn; 
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String user="root"; 
    private static final String pass="";
    private static final String url="jdbc:mysql://localhost:3306/licoreria";

    public conectar() {
        conn= null;
        try {
            Class.forName(driver);
            conn = (Connection) DriverManager.getConnection(url, user, pass);
            if (conn != null){
                System.out.println("La conexion se establecio bien con el DB");
            }
        } catch (ClassNotFoundException | SQLException e) {
         System.out.println("Error al conectar con la DB"+ e);
    }
    
    
}
    //este metodo nos retorna la conexion
    public Connection getConnection (){
        return conn;
        
    }
    //metodo para desconectar
    public void desconectar (){
        conn= null;
        if (conn== null) {
             System.out.println("Se desconecto del DB");
            
        }
    } 
}