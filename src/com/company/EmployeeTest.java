/**
 * This is a Test Program
 *
 * @author Oliver
 * @date 7/15/2022 10:50 PM
 */
package com.company;

import java.time.LocalDate;

public class EmployeeTest {

    public static void main(String[] args) {

        //fill the staff array with three Employee objects
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Carl Cracker", 75000,1987,12,15);
        staff[1] = new Employee("Harry Hacker",50000,1989,10,1);
        staff[2] = new Employee("Tony Tester", 40000, 1900,3,15);

        //raise everyone's salary by 5%
        for (Employee e:staff)
            e.raiseSalary(5);

        for (Employee e:staff)
            System.out.println(e.getName() +":"+e.getSalary()+":"+e.getHireBirth());

    }

}
