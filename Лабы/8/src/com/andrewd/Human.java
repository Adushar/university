package com.andrewd;

public class Human {
    protected int legs;
    protected int hands;
    protected int head;
    protected boolean eye_begs;

    public Human() {
        this(2, 2, 1, false);
    }

    // Overloading
    public Human(int legs, int hands, int head, boolean eye_begs) {
        this.legs = legs;
        this.hands = hands;
        this.head = head;
        this.eye_begs = eye_begs;
    }

    public boolean healthy() {
        boolean correct_amount_of_human_parts = (legs == 2 && hands == 2 && head == 1);
        boolean result = correct_amount_of_human_parts && !eye_begs;
        return result;
    }

    public boolean checkHead() {
        return this.head > 0;
    }

    public boolean getEyeBegs() {
        return this.eye_begs;
    }

    public void setEyeBegs(boolean status) {
        this.eye_begs = status;
    }

    public String to_String() {
        if ( healthy() ) return "You are ok";
        else return "Time to visit hospital";
    }

    public boolean equals(Human human) {
        return this.legs == human.legs && this.hands == human.hands && this.hands == human.hands;
        // eye_begs aren't important
    }
}
