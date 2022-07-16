/**
 * This is a Test Program
 *
 * @author Oliver
 * @date 7/16/2022 7:25 PM
 */
package com.company;

public class ParamTest {

    public static void main(String[] args) {

        // test1: Methods can't modify numeric parameters

/*        System.out.println("Testing tripleValue");
        double percent = 10;
        System.out.println("Before: percent=" + percent);
        tripleValue(percent);
        System.out.println("After: percent=" + percent);*/

        // Test2: Methods can change the state of object parameters

/*        System.out.println("\nTesting tripleSalary");
        var harry = new Employee("Harry", 50000,1999,12,1);
        System.out.println("Before: salary = "+ harry.getSalary());
        tripleSalary(harry);
        System.out.println("After: salary=" + harry.getSalary());*/

        // Test3: Methods can't attach new objects to object parameters
        System.out.println("\nTesting swap:");
        var a = new Employee("Alice", 70000, 1999,1,1);
        var b = new Employee("Bob", 60000,1999,2,2);
        System.out.println("Before: a=" + a.getName());
        System.out.println("Before: b=" + b.getName());
        swap(a,b);
        System.out.println("After: a= " + a.getName());
        System.out.println("After: b= " + b.getName());




    }

    private static void swap(Employee x, Employee y) {
        Employee temp = x;
        x = y;
        y = temp;
        System.out.println("End of method: x=" + x.getName());
        System.out.println("End of method: y=" + y.getName());
    }

    // work
    private static void tripleSalary(Employee x) {
        x.raiseSalary(200);
        System.out.println("End of method: salary=" + x.getSalary());

    }

    // doesn't work
    private static void tripleValue(double x) {
        x = 3*x;
        System.out.println("End of Method: x =" + x);
    }
}
