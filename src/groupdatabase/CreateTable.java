
package groupdatabase;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;



public class CreateTable {

    public static void main(String[] args) {
        Connection con = ConnectDB.getConnection();
       
        Statement stmt = null;
        String createString;
        createString =  "CREATE TABLE if not exists User (\n"
                + "            UserID     INTEGER      PRIMARY KEY,\n"
                + "            UserName  VARCHAR (15),\n"
                + "            UserEmail  VARCHAR (25),\n"
                + "            UserPassword   VARCHAR (11),\n" 
                + "            Joined  VARCHAR(9) ,\n"
                + "            Ratings   INT (2),\n"
                + "            LastOnline  VARCHAR(9) ,\n"
                + "            TotalTime   VARCHAR (11),\n"
                + "            FavouriteLanguage  VARCHAR (25),\n"
                + "            WorstLanguage   VARCHAR (25),\n"
                + "            LanguagesCompleted  INT (2),\n"
                + "            LanguagesLeft   INT (2),\n"
                + "            LevelsCompleted  INT (2)\n"
                +  ") ;";
        
        
        try {
            stmt = con.createStatement();
            stmt.executeUpdate(createString);
            con.setAutoCommit(false);
            con.commit();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    System.err.println("SQLException: " + e.getMessage());
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    System.err.println("SQLException: " + e.getMessage());
                }
            }
        }
    }    
}

