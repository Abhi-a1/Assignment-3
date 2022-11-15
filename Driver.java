import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;

/** ***************************************************
 *  Name:           Abhi
 *  Class:          CS30S
 * 
 *  Assignment:     A3 
 * 
 *  Description:    Place a short description of your program here
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

        // ***** objects *****
        
        
        // ***** print banners *****

        ProgramInfo pInfo = new ProgramInfo("Assignment 3");
        System.out.println(pInfo.getBanner());
        
        System.out.println();
        System.out.println(pInfo.getClosingMessage());
        //fout.print(banner);

        // ***** Get Input *****

        // ***** Object  *****
            Employee E1 = new Employee();
            Employee E2 = new Employee(10, 13);
            Employee E3 = new Employee(9, 8);
            Employee E4 = new Employee(12, 20);
            Employee E5 = new Employee(15, 22);
    // *** calculations ***
        E1.setHours(10);
        System.out.println(E1.getHours());
        System.out.println(E2);
        E3.setHours(14);
        E3.setWage(12);
        System.out.println(E3);
        System.out.println(E4.getWage());
        E4.setWage(13); // change to 13
        System.out.println(E4);
        E4.setHours(8);
        System.out.println(E5.getHours());
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