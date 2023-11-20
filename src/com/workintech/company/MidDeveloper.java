package com.workintech.company;

public class MidDeveloper extends Employee{
    public MidDeveloper(int id, String name) {
        super(id, name);
    }

    public void work() {
        setSalary(40000);
        System.out.println(getName() + " started working as mid developer.");
    }
}
