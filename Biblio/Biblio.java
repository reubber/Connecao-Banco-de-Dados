package ufc.rbbr.biblio;
import Model.ConnectionFactory;
import java.sql.*;
import java.time.Clock;

public class Biblio {
    
    public static void main(String[] Args){
    
        ConnectionFactory f = new ConnectionFactory();
        Connection con = f.getConnection();
    
      if (con!=null){
          System.out.println("conexao ok");
        
      }else{
          System.out.println("conexao falhou");
    
    }

    }
    
}
