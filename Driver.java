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
 *                  each employee. Calculating wage, overtimepay, regularpay, hours
 *                  and grosspay.
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
        String dash = "\n------------------------------------------------------------------------";
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
        System.out.println("Assignment 3.0 Employee Payroll Main Part" + nl);
        System.out.format("%1s %10s %10s %15s %15s %15s", "ID", "Hours", "Wage", "OverTimePay", "RegularPay", "GrossPay");
        System.out.println();
            Employee E1 = new Employee();   // id of 1000
            Employee E2 = new Employee(10, 13.50); // id of 1001
            Employee E3 = new Employee(9, 8.32);   // id of 1002
            Employee E4 = new Employee(); // id of 1003
            Employee E5 = new Employee(15, 22.20); // id of 1004
    // *** calculations ***
        
        // E1
        System.out.println(dash);
        System.out.println("Employee 1 Original Data: ");
        System.out.println(E1); // print original
        E1.setHours(10);    // set E1 hours to 10
        System.out.println(nl + E1.getHours() + " : Hours for employee 1");
        System.out.println(nl + E1.getWage() + " : Wage for emloyee 1 ");
        System.out.println(nl + E1.grossPay() + " : GrossPay for emloyee 1 " + nl);
        System.out.println("Employee 1 Final Data: ");
        System.out.println(E1); // print new
        System.out.println(dash);
        
        // E2
        System.out.println("Employee 2 Original Data: ");
        System.out.println(E2); // print E2
        System.out.println(nl + E2.getHours() + " : Hours for employee 2");
        System.out.println(nl + E2.getWage() + " : Wage for emloyee 2 ");
        System.out.println(nl + E2.otPay() + " : Overtime pay for emloyee 2 " + nl);
        System.out.println(dash);
        
        // E3
        System.out.println("Employee 3 Original Data: ");
        System.out.println(E3); // original
        E3.setHours(44);    // change hours from 9 to 44
        System.out.println(nl + E3.getHours() + " : Hours for employee 3");
        E3.setWage(12.23); // change wage from 8.32 to 12.23
        System.out.println(nl + E3.getWage() + " : Wage for emloyee 3 ");
        System.out.println(nl + E3.regPay() + " : Regular Pay for emloyee 3 " + nl);
        System.out.println("Employee 3 Final Data: ");
        System.out.println(E3); // new
        System.out.println(dash);
        
        // E4
        System.out.println("Employee 4 Original Data: ");
        System.out.println(E4); // original 
        E4.setHours(50);
        E4.setWage(13); 
        System.out.println(nl + E4.getHours() + " : Hours for employee 4"); // new hours
        System.out.println(nl + E4.getWage() + " : Wage for emloyee 4 ");
        System.out.println(nl + E4.grossPay() + " : GrossPay for emloyee 4 " + nl);
        System.out.println("Employee 4 Final Data: ");
        System.out.println(E4); // new hours
        System.out.println(dash);
        
        // E5
        System.out.println("Employee 5 Original Data: ");
        System.out.println(E5); // original
        E5.setHours(10);
        E5.setWage(8.22);
        System.out.println(nl + E5.getHours() + " : Hours for employee 5"); // new hours
        System.out.println(nl + E5.getWage() + " : Wage for emloyee 5 ");
        System.out.println(nl + E5.otPay() + " : Overtime Pay for emloyee 5 " + nl);
        System.out.println("Employee 5 Final Data: ");
        System.out.println(E5); // new
        System.out.println(dash);
        
        System.out.println("\n\nAssignment 3.0 Employee Payroll Extra Part");
        System.out.println(dash);
        // extra
        while (count != 5) {
            count++;
            // E1
            E1.setHours(E1.random());
            E1.setWage(E1.randWage());
            System.out.println(E1);
            
            // E2
            E2.setHours(E2.random());
            E2.setWage(E2.randWage());
            System.out.println(E2);
            
            // E3
            E3.setHours(E3.random());
            E3.setWage(E3.randWage());
            System.out.println(E3);
            
            // E4
            E4.setHours(E4.random());
            E4.setWage(E4.randWage());
            System.out.println(E4);
            
            // E5
            E5.setHours(E5.random());
            E5.setWage(E5.randWage());
            System.out.println(E5);
    }
    
    // ***** Print Formatted Output *****
            // ***** Print Formatted Output *****
                // System.out.println(E1 + " " + E2 + E3 + E4 + E5);
    // ***** Closing Message *****
    
        System.out.println(dash);
        System.out.println("end of processing");
        //fout.println("End of Processing");
        
    // **** close io buffers *****
    
        //fin.close();
        //fout.close();
    } // end main 
    
} // end FormatTemplate