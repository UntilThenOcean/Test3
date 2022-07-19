/**
 * This is a Test Program
 *
 * @author Oliver
 * @date 7/19/2022 9:48 PM
 */
package com.company;

import java.util.*;

public class ArrayListTest {

    public static void main(String[] args) {

        var staff = new ArrayList<Employee>();

        staff.add(new Employee("Carl", 75000, 1987,2,15));
        staff.add(new Employee("Harry", 50000, 1989,10,1));
        staff.add(new Employee("Tony", 40000,1990,3,15));

        for (Employee e:staff)
            e.raiseSalary(5);

        for (Employee e:staff)
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());


    }

}
