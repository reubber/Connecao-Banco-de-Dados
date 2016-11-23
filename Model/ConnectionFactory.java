package Model;
import java.sql.*;


/**
 *
 * @author aluno
 */
public class ConnectionFactory {
    
    public Connection getConnection(){
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/biblio","root","");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
