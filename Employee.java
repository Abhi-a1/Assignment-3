import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;

/** ***************************************************
 *  Name:           Sveinson
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
    private static int nextID = 1000;
    
    private int id;
    private int hours;
    private int wage;
    
    // ** constructors **
    
    // ** no-arg/default constructor
    public Employee(){
        this.hours = 8; // 8 hours minimum before pay
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
    
    @Override
    public String toString(){
        String st = getHours() + ": " + getID() + ": " + getWage();
        return st;
    }// end toSTring
    
    
    
} // end FormatTemplate