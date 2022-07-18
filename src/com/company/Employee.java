/**
 * This is a Test Program
 *
 * @author Oliver
 * @date 7/15/2022 11:02 PM
 */
package com.company;

import java.time.*;

class Employee extends Person{

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
}
