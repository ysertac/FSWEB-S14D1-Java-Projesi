package com.workintech.company;

import java.util.Arrays;

public class HRManager extends Employee{
    private JuniorDeveloper[] juniors;
    private MidDeveloper[] mids;
    private SeniorDeveloper[] seniors;

    public HRManager(int id, String name, JuniorDeveloper[] juniors,
                     MidDeveloper[] mids, SeniorDeveloper[] seniors) {
        super(id, name);
        this.juniors = juniors;
        this.mids = mids;
        this.seniors = seniors;
    }

    public void  work() {
        setSalary(60000);
        System.out.println(getName() + " started to working as HR Manager");
    }

    public void addEmployee(int index, JuniorDeveloper junior) {
        try {
            if (juniors[index] == null) {
                juniors[index] = junior;
            } else {
                System.out.println("index is full");
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
            System.out.println("index not found: " + index);
        }
    }

    public void addEmployee(int index, MidDeveloper mid) {
        try {
            if (mids[index] == null) {
                mids[index] = mid;
            } else {
                System.out.println("index is full");
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
            System.out.println("index not found: " + index);
        }
    }

    public void addEmployee(int index, SeniorDeveloper senior) {
        try {
            if (seniors[index] == null) {
                seniors[index] = senior;
            } else {
                System.out.println("index is full");
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
            System.out.println("index not found: " + index);
        }
    }

    public String toString() {
        return super.toString() + " HR Manager " + "Juniors = " + Arrays.toString(juniors) + " mids = " + Arrays.toString(mids) + " Seniors = " + Arrays.toString(seniors);
    }
}
