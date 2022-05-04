
package groupdatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class ConnectDB {
    
      public static Connection getConnection() {

        try {
            Class.forName("org.sqlite.JDBC");
            String url = "jdbc:sqlite:AppDataBase.db";
            Connection con = DriverManager.getConnection(url);
            //JOptionPane.showMessageDialog(null, "Connection Established");
            return con;
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
     
    
}
