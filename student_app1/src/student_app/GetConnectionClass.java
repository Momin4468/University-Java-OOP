
package student_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class GetConnectionClass {
   private static Connection connection=null;
   public Connection databaseConnection(){
     try {
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         String ConnectionURL ="jdbc:sqlserver://localhost:1433;databaseName=java_pro;user=;password=12345";
         
         
         connection = DriverManager.getConnection(ConnectionURL);
         JOptionPane.showMessageDialog(null,"Mysql Connection Successful...");
     if(connection!=null){
     return connection;
     }
     else{
      return null;
     }
   }
   catch (ClassNotFoundException|SQLException e){
       JOptionPane.showMessageDialog(null,"Mysql Connection Failed...");  
       return null;
    }
  }
}    