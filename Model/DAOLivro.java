package Model;

import java.sql.*;

public class DAOLivro {

    private Connection con;
  
    
public DAOLivro(){
    
    this.con= new ConnectionFactory().getConnection();
    
}

public void inserir(Livro elemento) throws SQLException{
    
    String sql= "inset into livro "+"(nome,autor,sinopse) "+"values (?,?,?)";
    
    try{
        PreparedStatement stmt = con.prepareStatement(sql);
        
    
    stmt.setString(1,elemento.getNome());
    stmt.setString(2,elemento.getAutor());
    stmt.setString(3,elemento.getSinopse());
    
    stmt.execute();
    stmt.close();
    con.close();
    
    }catch(SQLException e){
        throw new RuntimeException(e);
            
    }
    
    
}
}
