/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author students
 */
public class conn {

    /**
     * @param args the command line arguments
     */
    public static Connection dbconnect() throws SQLException{
      try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //System.out.println("FGESGv");
            String servername="172.20.10.253";
            String portno="1521";
            String sid="cseorc";
            
            String url="jdbc:oracle:thin:@"+servername+":"+portno+":"+sid;
            Connection conn=DriverManager.getConnection(url,"r546","r546");
            return conn;
            
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            System.out.println("fvg");
            return null;
        }  
    }
    
    public static void main(String[] args)throws SQLException{
        
        new Register().setVisible(true);
    }
    
}