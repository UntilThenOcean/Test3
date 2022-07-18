/**
 * This is a Test Program
 *
 * @author Oliver
 * @date 7/18/2022 5:37 PM
 */
package com.company;

public abstract class Person {

    public abstract String getDescription();
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
