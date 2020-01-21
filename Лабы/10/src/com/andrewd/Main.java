package com.andrewd;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Daniel Redcliff");
        Actor actor2 = new Actor("Emma Watson");
        Actor actor3 = new Actor("James McAvoy");
        Actor actor4 = new Actor("BattleField Overwatch");

        ArrayList<Actor> cast1 = new ArrayList<Actor>(List.of(actor1, actor3));
        ArrayList<Actor> cast2 = new ArrayList<Actor>(List.of(actor2, actor3, actor1));
        ArrayList<Actor> cast3 = new ArrayList<Actor>(List.of(actor2));

        Film film1 = new Film("Harry Potter", cast1);
        Film film2 = new Film("Split", cast2);
        Film film3 = new Film("Victor Frankenstein", cast3);

        ArrayList<Film> output1 = Film.getFilmWithLargestCast();
        ArrayList<Actor> output2 = Actor.withoutFilms();
        Set<Actor> output3 = actor1.connectedActors();
    }
}
