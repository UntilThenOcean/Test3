/**
 * This is a Test Program
 *
 * @author Oliver
 * @date 7/16/2022 9:09 PM
 */
package com.company;

import java.util.Random;

class EmployeeThird {
    private static  int nextId;

    private  int id;
    private  String name="Unknown"; // instance field initialization
    private  double salary;

    // static initialization block
    static {
        var generator = new Random();
        nextId = generator.nextInt(10000); // set nextId to a random number between 0 and 9999
    }


    // object initialization block
    {
        id = nextId;
        nextId++;
    }

    // three overloaded constructors
    public EmployeeThird(String n, double s) {
        name = n;
        salary = s;
    }

    public EmployeeThird(double s) {
        this("Employee#" + nextId, s); // calls the EmployeeThird(String, double) constructor
    }

    // the default constructor
    public EmployeeThird(){
        // name initialized to "" above
        // salary not explicitly set --initialized to 0
        // id initialized in initialization block

    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }
}
