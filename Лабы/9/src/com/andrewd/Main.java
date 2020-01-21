package com.andrewd;

public class Main {

    public static void main(String[] args) {
        System.out.println( StringOperations.toOctalNumber(511) );
        System.out.println( StringOperations.countIntWords(
                "The user with the nickname koala757677 this month wrote " +
                        "3 times more comments than the user with the nickname " +
                        "croco181dile920 4 months ago") );
    }
}
