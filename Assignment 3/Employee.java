import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;
import java.util.Random;


/** ***************************************************
 *  Name:           Abhi
 *  Class:          CS30S
 * 
 *  Assignment:     OOp Employee class
 * 
 *  Description:    Employee class
 * 
 *************************************************************/

public class Employee {
    // ** class variables **
    NumberFormat currency = NumberFormat.getCurrencyInstance();
    
    // ** fields ***
    Random rand = new Random();

    private final int max = 40;
    private final double OvertimeRate = 1.5;
    
    private static int nextID = 1000;
    
    private int id;
    private int hours;
    private double wage;
    // other variables were removed
    // ** constructors **
    
    // ** no-arg/default constructor
    public Employee(){
        this.hours = 8; // 8 hours minimum before pay
        this.wage = 8; // 8 dollars per hour basic wage
        id = getNextID();
    }// end default
    
    // full-arg constructor
    public Employee(int hours, double wage) {
        this.hours = hours;
        this.wage = wage;
        id = getNextID();
    }
    
    // ** getters **
    
    // getters allow examination of the current state of the object
    public int getHours(){
        return this.hours;
    }// end get name
    
    public double getWage(){
        return this.wage;
    }// end get age
    
    public int getID() {
        return this.id;
    }   // end get id
    
    // ** setters **
    public void setHours(int hours) {
        this.hours = hours;
    }
    
    public void setWage(double wage) {
        this.wage = wage;
    }
    
    // ** other **
    private int getNextID() {
        return nextID++;
    }// end get ID 
    
    public double otPay() {
        double calcOt = 0;  // was added
        double remainder = 0;   // was added
        remainder = 0;
        if (hours > max) {
            remainder = hours % max;
        }
        calcOt = wage * OvertimeRate;
        calcOt = calcOt * remainder;
        return calcOt;
    }
    
    public double regPay() {    // reg pay was changed
        double calcReg = 0;
        if (hours > max) {
            calcReg = max * wage;
        } else {
            calcReg = hours * wage;
        }
        return calcReg;
    }

    
    public double grossPay() {
        return regPay() + otPay();
    }
    
    @Override
    public String toString(){
        // String st =  "  ID : " + getID() + ": Hours : " + getHours() +  ": Wage : " + getWage() + ": OT : " + otPay() + ": Regular : " + regPay() + ": Gross : " + grossPay();
        System.out.format("%1s %5s %13s %15s %15s %15s", getID(), getHours(), currency.format(getWage()), currency.format(otPay()), currency.format(regPay()), currency.format(grossPay()));
        return " ";
    }// end toSTring
    
    
    
} // end FormatTemplate