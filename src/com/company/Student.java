/**
 * This is a Test Program
 *
 * @author Oliver
 * @date 7/18/2022 5:52 PM
 */
package com.company;

public class Student extends Person {

    private String major;

    /**
     *
     * @param name the student's name
     * @param major the student's major
     */

    public Student(String name, String major) {
        super(name);
        this.major = major;
    }

    @Override
    public String getDescription() {
        return "a student majoring in " + major;
    }
}
