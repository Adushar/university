package com.andrewd;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Actor actor1 = null;
        Actor actor3 = null;
        Actor actor2 = null;
        Actor actor4 = null;
        try {
            actor1 = new Actor("Emma Watson");
            actor2 = new Actor("Daniel Redcliff");
            actor3 = new Actor("James McAvoy");
            actor4 = new Actor("BattleField Overwatch");
            Actor invalidActor = new Actor(null);
        } catch (Exception e) {
            // log
            System.out.println("Smth went worng on creating film: " + e);
        }

        HashSet<Actor> cast1 = new HashSet<Actor>(List.of(actor1, actor3));
        HashSet<Actor> cast2 = new HashSet<Actor>(List.of(actor2, actor3, actor1));
        HashSet<Actor> cast3 = new HashSet<Actor>(List.of(actor2));

        try {
            Film film1 = new Film("Harry Potter", cast1);
            Film film2 = new Film("Split", cast2);
            Film film3 = new Film("Victor Frankenstein", cast3);
            Film invalidFilm = new Film("", cast1); // IllegalArgumentException demo
        } catch (Exception e) {
            // log
            System.out.println("IllegalArgumentException raised on creating film: " + e);
        }


        HashSet<Film> output1 = Film.getFilmWithLargestCast();
        TreeSet<Actor> output2 = Actor.withoutFilms();
        Set<Actor> output3 = actor1.connectedActors();

        // Records in alphabet order
        TreeMap databaseRecords = Database.allRecords();

        // Should be in alphabetical order
        System.out.println("\nActors:");
        Database.getActors().forEach(actor -> {
            System.out.println(actor.getFullName());
        });

        System.out.println("\nFilms:");
        Database.getFilms().forEach(film -> {
            System.out.println(film.getName());
        });
    }
}
