package com.workintech.company;

public class JuniorDeveloper extends Employee{
    public JuniorDeveloper(int id, String name) {
        super(id, name);
    }

    public void work() {
        setSalary(32000);
        System.out.println(getName() + " has started working as junior developer.");
    }


}
