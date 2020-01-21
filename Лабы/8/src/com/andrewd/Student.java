package com.andrewd;

public class Student extends Human {
    public Student(int legs, int hands, int head) {
        super(legs, hands, head, false);
    }

    public void prepareForSession() {
        setEyeBegs(true);
    }

    // Overloading
    public void prepareForSession(boolean heap_of_money) {
        if (heap_of_money) setEyeBegs(false);
        else setEyeBegs(true);
    }

    public boolean prepairedForSession() {
        return getEyeBegs();
    }

    // Students have their own standarts of health
    // Overriding example
    public boolean healthy() {
        return checkHead();
    }
}
