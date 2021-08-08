/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BillingSystem;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;

/**
 *
 * @author samsp
 */
public class dbconnection {
        public Connection conn;
        public ResultSet rs;
        public PreparedStatement pstmt;
        public Statement stmt;
        public String url = "jdbc:mysql://localhost:3306/studio";

    public dbconnection()
    {
        try{
           Class.forName("com.mysql.jdbc.Driver");
           conn = DriverManager.getConnection(url,"root","Satnam@123");
            System.err.println("Sucsess");
            
        }
        catch(Exception e)
        {
            System.err.println("Error");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
        dbconnection db = new dbconnection();
        db.stmt = db.conn.createStatement();
        db.rs = db.stmt.executeQuery("select * from customer");
        }
        catch(Exception e)
        {
            
        }
    }
    
}
