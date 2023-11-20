package com.workintech.company;

public class SeniorDeveloper extends Employee{
    public SeniorDeveloper(int id, String name) {
        super(id, name);
    }

    public void work() {
        setSalary(55000);
        System.out.println(getName() + " started working as senior developer");
    }
}
