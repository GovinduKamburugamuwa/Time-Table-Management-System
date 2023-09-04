
import java.sql.Connection;
import java.sql.DriverManager;


public class dbCon {

    static Connection connection() {
         try
       {
           Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmanagement", "root", "");
           return con;
       }
       catch(Exception e)
       {
           System.out.println(e);
           return null;
       }
    }
    
}
