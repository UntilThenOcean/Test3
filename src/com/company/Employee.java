/**
 * This is a Test Program
 *
 * @author Oliver
 * @date 7/15/2022 11:02 PM
 */
package com.company;

import java.time.*;
import java.util.Objects;

class Employee extends Person{

    private String name;
    private double salary;
    private LocalDate hireDay;

    /**
     *
     * @param name
     * @param salary
     * @param year
     * @param month
     * @param day
     */

    public Employee(String name, double salary, int year, int month, int day) {

        super(name);
        this.salary = salary;
        hireDay = LocalDate.of(year,month,day);
    }

    @Override
    public String getDescription() {

        return String.format("an employee with a salary of $%.2f", salary);
    }

    public double getSalary() {

        return salary;
    }

    public LocalDate getHireBirth() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = this.salary * byPercent /100;
        this.salary+=raise;
    }

    public boolean equals(Object otherObject) {

        // a quick test to see if the objects are identical
        if (this == otherObject)
            return true;

        // must return false if the explicit parameter is null
        if(otherObject == null)
            return false;

        // if the classes don't match, they can't be equal
        if(getClass() != otherObject.getClass())
            return false;

        // now we know otherObject is non-null Employee
        var other = (Employee) otherObject;

        // test whether the fields have identical values
        return Objects.equals(name, other.name)
                && salary == other.salary && Objects.equals(hireDay, other.hireDay);
    }

    public int hashCore() {
        return Objects.hash(name, salary, hireDay);
    }

    public String toString() {
        return getClass().getName() + "[name=" +name + ", salary= " +salary + ", hireDay=" + hireDay + "]";
    }
}
