/**
 * This is a Test Program
 *
 * @author Oliver
 * @date 7/16/2022 8:56 PM
 */
package com.company;

public class ConstructorTest {

    public static void main(String[] args) {

        // fill the staff array with three Employee objects
        var staff = new EmployeeThird[3];

        staff[0] = new EmployeeThird("Harry",4000);
        staff[1] = new EmployeeThird(6000);
        staff[2] = new EmployeeThird();

        // print out information about all Employee objects
        for (EmployeeThird e:staff)
            System.out.println("Name: "+e.getName() +" ID: " + e.getId()+" Salary: "+e.getSalary());
    }
}
