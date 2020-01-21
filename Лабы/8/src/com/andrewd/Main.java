package com.andrewd;

public class Main {

    public static void main(String[] args) {
        Human a = new Human(2, 2, 1, true);
        System.out.println( "Eye begs: " + a.getEyeBegs() );
        System.out.println( a.to_String() ); // eye_bags for common person is bad

        Student b = new Student(2, 2, 1);
        System.out.println( b.to_String() );

        b.prepareForSession();
        System.out.println( "Eye begs: " + b.getEyeBegs() );
        System.out.println( b.to_String() ); // eye_bags for student is ok

        Human not_human = new Human(40, 0, 1, false);
        System.out.println( "Sorokonoshka equals to human: " + (a == not_human) );
    }
}
