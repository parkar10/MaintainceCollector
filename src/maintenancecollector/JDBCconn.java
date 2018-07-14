/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maintenancecollector;

import java.sql.*;

/**
 *
 * @author axayp
 */
public class JDBCconn {

    String url = "jdbc:sqlserver://localhost:1433;databaseName=MC;integratedSecurity=true";

    // Declare the JDBC objects.  
    Connection con = null;  //USED FOR DOING CONNECTION 
    Statement stmt = null; //USED FOR RUNNING COMMAND 
    ResultSet rs = null;  //USED FOR STORING THE RECORDS WHICH COMES FROM TABLE
    PreparedStatement stat;
    
    public void addToDatabase(String query) {
        try {
            // Establish the connection.  
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(url); 
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            // Iterate through the data in the result set and display it.  
            while (rs.next()) {
                System.out.println(rs.getString(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
            }
        } // Handle any errors that may have occurred.  
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void updateDatabase(String query) {
        try {
            // Establish the connection.  
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(url); 
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            // Iterate through the data in the result set and display it.  
            while (rs.next()) {
                System.out.println(rs.getString(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
            }
        } // Handle any errors that may have occurred.  
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public ResultSet getFromDatabase(String query) {
        try {
            // Establish the connection.  
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(url); 
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
        } // Handle any errors that may have occurred.  
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return this.rs;
    }
    
    public Connection getConnectionObject() {
        return this.con;
    }

    public ResultSet getResultSetObject() {
        return this.rs;
    }
}
