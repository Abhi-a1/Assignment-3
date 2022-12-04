import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;
import java.util.Random;

/** ***************************************************
 *  Name:           Abhi
 *  Class:          CS30S
 * 
 *  Assignment:     A3 
 * 
 *  Description:    Creating employee's and giving the payrolls. Unique id for
 *                  each employee. 
 * 
 *************************************************************/

public class Driver {

    public static void main(String[] args) throws IOException{
        // ***** constants *******

        // ***** variables *****

        String banner = "";             // output banner
        String prompt = "";             // prompt for user input

        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output

        String delim = "[ ]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records

        // a new line character that works on every computer system
        String nl = System.lineSeparator();

        
        Random rand = new Random();
        
        int count = 0;
        
        
        // ***** objects *****
        
        // ***** print banners *****

        ProgramInfo pInfo = new ProgramInfo("Assignment 3");
        System.out.println(pInfo.getBanner());
        
        System.out.println();
        System.out.println(pInfo.getClosingMessage());
        //fout.print(banner);

        // ***** Get Input *****

        // ***** Object  *****
        System.out.format("%1s %10s %10s %15s %15s %10s", "ID", "Hours", "Wage", "OverTimePay", "RegularPay", "GrossPay");
        System.out.println();
            Employee E1 = new Employee();   // id of 1000
            Employee E2 = new Employee(10, 13); // id of 1001
            Employee E3 = new Employee(9, 8);   // id of 1002
            Employee E4 = new Employee(); // id of 1003
            Employee E5 = new Employee(15, 22); // id of 1004
    // *** calculations ***
        E1.setHours(10);
        System.out.println(E1);
        System.out.println(E2);
        E3.setHours(44);
        E3.setWage(12);
        System.out.println(E3);
        System.out.println(E4);
        E4.setWage(13); 
        System.out.println(E4);
        E4.setHours(50);
        System.out.println(E5);
        System.out.println(E2);
        
        
        // extra
        while (count != 5) {
            count++;
        
            E1.setHours(E1.random());
            E1.setWage(E1.randWage());
            System.out.println(E1);
            E2.setHours(E2.random());
            E2.setWage(E2.randWage());
            System.out.println(E2);
            E3.setHours(E3.random());
            E3.setWage(E3.randWage());
            System.out.println(E3);
            E4.setHours(E4.random());
            E4.setWage(E4.randWage());
            System.out.println(E4);
            E5.setHours(E5.random());
            E5.setWage(E5.randWage());
            System.out.println(E5);
    }
    // ***** Print Formatted Output *****
            // ***** Print Formatted Output *****
                // System.out.println(E1 + " " + E2 + E3 + E4 + E5);
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println("end of processing");
        //fout.println("End of Processing");
        
    // **** close io buffers *****
    
        //fin.close();
        //fout.close();
    } // end main 
    
} // end FormatTemplate