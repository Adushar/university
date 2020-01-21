package com.andrewd;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Emma Watson");
        Actor actor2 = new Actor("Daniel Redcliff");
        Actor actor3 = new Actor("James McAvoy");
        Actor actor4 = new Actor("BattleField Overwatch");

        HashSet<Actor> cast1 = new HashSet<Actor>(List.of(actor1, actor3));
        HashSet<Actor> cast2 = new HashSet<Actor>(List.of(actor2, actor3, actor1));
        HashSet<Actor> cast3 = new HashSet<Actor>(List.of(actor2));

        Film film1 = new Film("Harry Potter", cast1);
        Film film2 = new Film("Split", cast2);
        Film film3 = new Film("Victor Frankenstein", cast3);

        HashSet<Film> output1 = Film.getFilmWithLargestCast();
        TreeSet<Actor> output2 = Actor.withoutFilms();
        Set<Actor> output3 = actor1.connectedActors();

        // Records in alphabet order
        TreeMap databaseRecords = Database.allRecords();

        // Should be in alphabetical order
        System.out.println( "\nActors:" );
        Database.getActors().forEach(actor -> {
            System.out.println( actor.getFullName() );
        });

        System.out.println( "\nFilms:" );
        Database.getFilms().forEach(film -> {
            System.out.println( film.getName() );
        });
    }
}
