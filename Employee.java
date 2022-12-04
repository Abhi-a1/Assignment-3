import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;
import java.util.Random;


/** ***************************************************
 *  Name:           Abhi
 *  Class:          CS30S
 * 
 *  Assignment:     OOp Example 1 Person
 * 
 *  Description:    Simple implementation of a Person class
 * 
 *************************************************************/

public class Employee {
    // ** class variables **
    
    // ** fields ***
    Random rand = new Random();

    private final int max = 40;
    private final double OvertimeRate = 1.5;
    
    private static int nextID = 1000;
    
    private int id;
    private int hours;
    private int wage;
    
    private double calcReg;
    private double calcOt;
    private double remainder;
    
    // Random
    public int random = 0;
    public int randWage = 0;
    private int limit = 61; // for random
    private int limit2 = 25;    // for random
    // ** constructors **
    
    // ** no-arg/default constructor
    public Employee(){
        this.hours = 40; // 8 hours minimum before pay
        this.wage = 12; // 12 dollars per hour basic wage
        id = getNextID();
    }// end default
    
    // full-arg constructor
    public Employee(int hours, int wage) {
        this.hours = hours;
        this.wage = wage;
        id = getNextID();
    }
    
    // ** getters **
    
    // getters allow examination of the current state of the object
    public int getHours(){
        return this.hours;
    }// end get name
    
    public int getWage(){
        return this.wage;
    }// end get age
    
    public int getID() {
        return this.id;
    }   // end get id
    
    // ** setters **
    public void setHours(int hours) {
        this.hours = hours;
    }
    
    public void setWage(int wage) {
        this.wage = wage;
    }
    
    // ** other **
    private int getNextID() {
        return nextID++;
    }// end get ID 
    
    public double otPay() {
        remainder = 0;
        if (hours > max) {
            remainder = hours % max;
        }
        calcOt = remainder * OvertimeRate;
        return calcOt;
    }
    
    public double regPay() {
        
        calcReg = (hours - remainder) * wage;   
        return calcReg;
    }
    
    public double grossPay() {
        return calcReg + calcOt;
    }
    
    public int random() {   // random hours worked
        random = rand.nextInt(limit - 1) + 1;
        return random;
    }
    
    public int randWage() { // random wage
        randWage = rand.nextInt(limit2 - 1) + 1;
        return randWage;
    }
    
    @Override
    public String toString(){
        // String st =  "  ID : " + getID() + ": Hours : " + getHours() +  ": Wage : " + getWage() + ": OT : " + otPay() + ": Regular : " + regPay() + ": Gross : " + grossPay();
        System.out.format("%1s %5s %13s %15s %15s %10s", getID(), getHours(), getWage(), otPay(), regPay(), grossPay());
        return " ";
    }// end toSTring
    
    
    
} // end FormatTemplate