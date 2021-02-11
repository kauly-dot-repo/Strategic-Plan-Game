/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategicplangame;

import java.sql.Connection;
import java.sql.ResultSet;

/**
 *
 * @author Kauly
 */
public class StrategicPlanGame {

    
    public static Connection conn;
    public static GameConn connect = new GameConn();//
    public static ResultSet result, trainerResult;
    
    
    /**
     * @param args the command line arguments
     */
     
    
    public static void main(String[] args) {
        new Welcome().setVisible(true); //start the program here
        //new Goal_KPI().setVisible(true);
        
    }
    
}
