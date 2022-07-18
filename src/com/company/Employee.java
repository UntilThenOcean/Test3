/**
 * This is a Test Program
 *
 * @author Oliver
 * @date 7/15/2022 11:02 PM
 */
package com.company;

import java.time.*;

class Employee {

    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String n, double s, int year, int month, int day) {
        this.name = n;
        this.salary = s;
        hireDay = LocalDate.of(year,month,day);
    }

    public String getName() {

        return name;
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
