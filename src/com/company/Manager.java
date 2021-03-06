/**
 * This is a Test Program
 *
 * @author Oliver
 * @date 7/18/2022 3:45 PM
 */
package com.company;

public class Manager extends Employee{

    private  double bonus;

    /**
     *
     * @param name the employee's name
     * @param salary the salary
     * @param year the hire year
     * @param month the hire month
     * @param day the hire day
     */
    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month,day);
        bonus = 0;
    }

    public  double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public boolean equals(Object otherObject) {
        if (!super.equals(otherObject))
            return false;
        var other = (Manager) otherObject;
        return bonus == other.bonus;
    }

    public int hashCore() {
        return java.util.Objects.hash(super.hashCore(), bonus);
    }

    public String toSting() {
        return super.toString() + "[bonus" + bonus + "]";
    }

}
