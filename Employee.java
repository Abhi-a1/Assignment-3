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
    private static int nextID = 1000;
    
    private int id;
    private int hours;
    private int wage;
    private int calcReg;
    private int calcOt;
    private int remainder;
    
    public int random = 0;
    public int randWage = 0;
    private int limit = 61;
    private int limit2 = 25;
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
    
    public int otPay() {
        remainder = 0;
        if (hours > max) {
            remainder = hours % max;
        }
        calcOt = remainder * wage;
        return calcOt;
    }
    
    public int regPay() {
        
        calcReg = (hours - remainder) * wage;   
        return calcReg;
    }
    
    public int grossPay() {
        return calcReg + calcOt;
    }
    
    public int random() {
        random = rand.nextInt(limit - 1) + 1;
        return random;
    }
    
    public int randWage() {
        randWage = rand.nextInt(limit2 - 1) + 1;
        return randWage;
    }
    
    @Override
    public String toString(){
        String st =  "  ID : " + getID() + ": Hours : " + getHours() +  ": Wage : " + getWage() + ": OT : " + otPay() + ": Regular : " + regPay() + ": Gross : " + grossPay();
        return st;
    }// end toSTring
    
    
    
} // end FormatTemplate