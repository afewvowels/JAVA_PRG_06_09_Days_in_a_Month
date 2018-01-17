/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_06_09_days_in_a_month;

/**
 *
 * @author aeiou
 */
public class MonthDays {
    private int intMonth;
    private int intYear;
    
    public MonthDays(int month, int year) {
        intMonth = month;
        intYear = year;
    }
    
    public MonthDays() {
        intMonth = 1;
        intYear = 0;
    }
    
    public void setMonth(int month) {
        intMonth = month;
    }
    
    public int getMonth() {
        return intMonth;
    }
    
    public void setYear(int year) {
        intYear = year;
    }
    
    public int getYear() {
        return intYear;
    }
    
    public String getNumberOfDays() {
        switch(intMonth) {
            case 1:
                return "31 days";
            case 2:
                if (intYear % 100 == 0 && intYear % 400 == 0) {
                    return "29 days";
                }
                else if (intYear % 100 != 0 && intYear % 4 == 0) {
                    return "29 days";
                }
                else {
                    return "28 days";
                }
            case 3:
                return "31 days";
            case 4:
                return "30 days";
            case 5:
                return "31 days";
            case 6:
                return "30 days";
            case 7:
                return "31 days";
            case 8:
                return "31 days";
            case 9:
                return "30 days";
            case 10:
                return "31 days";
            case 11:
                return "30 days";
            case 12:
                return "31 days";
            default:
                return "ERROR";
        }
    }
}
