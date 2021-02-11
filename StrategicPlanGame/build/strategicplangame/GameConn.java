/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategicplangame;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Kauly
 */
public class GameConn {
    
    //-------Kaulyaalalwa N. N. T Peter	219143765
    //-------Emanuel A. Q. Vuma             219091617
    Connection connection;
    
    public GameConn() {
        
        //Call in every class that you want to use the database
        
        try {
            Class.forName("com.mysql.jdbc.Driver");//adds SQL Driver
            
//establishes connection to database
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/seh", "root", "root");
            
            System.out.println("|--- Database Connected ---|\n");//to check connection
        } catch (Exception e) {
            System.err.println("Connection Error" );
            e.printStackTrace();
        }

    }//END OF CONSTRUCTOR

    public Connection getConnection() {//class to create connection to the database
        return connection;
    }
    
    
}
