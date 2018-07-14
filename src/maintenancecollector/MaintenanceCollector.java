/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maintenancecollector;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author axayp
 */
public class MaintenanceCollector {

    public MaintenanceCollector() {
        JDBCconn c = new JDBCconn();
        ResultSet rs;
        c.updateDatabase("use MC");
        rs = c.getFromDatabase("select count(*) from Society ");
        int count = 0;
        try {
            while (rs.next()) {
                count = Integer.parseInt(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MaintenanceCollector.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (count != 0) {
            new LoginPage().setVisible(true);
        }
        else{
            new Credentials().setVisible(true);
        }
    }

    public static void main(String[] args) {
        MaintenanceCollector m = new MaintenanceCollector();
    }
}
