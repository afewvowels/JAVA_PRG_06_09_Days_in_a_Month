/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_06_09_days_in_a_month;

import java.util.Scanner;
/**
 *
 * @author aeiou
 */
public class JAVA_PRG_06_09_Days_in_a_Month {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String strTemp;
        
        Scanner scrKeyboard = new Scanner(System.in);
        
        MonthDays days = new MonthDays();
        
        System.out.println("Please enter a numeric month value: ");
        strTemp = scrKeyboard.nextLine();
        
        days.setMonth(Integer.parseInt(strTemp));
        
        System.out.println("Please enter a numeric year value: ");
        strTemp = scrKeyboard.nextLine();
        
        days.setYear(Integer.parseInt(strTemp));
        
        System.out.println(days.getNumberOfDays());
    }
    
}
