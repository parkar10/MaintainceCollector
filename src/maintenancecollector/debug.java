/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maintenancecollector;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author axayp
 */
public class debug {

    public String returnCurrentMonth() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        dtf = DateTimeFormatter.ofPattern("MM");
        String month = dtf.format(now);
        switch (Integer.parseInt(month)) {
            case 01:
                month = "January";
                break;
            case 02:
                month = "February";
                break;
            case 03:
                month = "March";
                break;
            case 04:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "Septmber";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
        }
        return month;
    }

    public String returnMonth(String month) {
        switch (Integer.parseInt(month)) {
            case 01:
                month = "January";
                break;
            case 02:
                month = "February";
                break;
            case 03:
                month = "March";
                break;
            case 04:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "Septmber";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
        }
        return month;
        
    }
    
    public String returnCurrentYear() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        dtf = DateTimeFormatter.ofPattern("yyyy");
        String year = dtf.format(now);
        return year;
    }

    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        dtf = DateTimeFormatter.ofPattern("MM");
        String month = dtf.format(now);
        String cTime = dtf.format(now);
        dtf = DateTimeFormatter.ofPattern("yyyy");
        String year = dtf.format(now);

    }
}
