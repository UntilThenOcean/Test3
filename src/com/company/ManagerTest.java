/**
 * This is a Test Program
 *
 * @author Oliver
 * @date 7/17/2022 10:58 PM
 */
package com.company;

public class ManagerTest {

    public static void main(String[] args) {

        var boss = new Manager("Carl Cracker", 80000,1987,12,15);
        boss.setBonus(5000);

        var staff = new Employee[3];

        staff[0] = boss;
        staff[1] = new Employee("Harry", 50000,1989,10,1);
        staff[2] = new Employee("Tommy", 40000,1990,3,25);

        // print out information about all Employee objects
        for (Employee e:staff)
            System.out.println("name=" + e.getName() + " salary=" + e.getSalary());
    }
}
