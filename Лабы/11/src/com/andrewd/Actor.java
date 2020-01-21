package com.andrewd;

import java.util.*;

public class Actor {
    private final String full_name;

    Actor(String full_name) {
        this.full_name = full_name;
        Database.addActor(this);
    }

    public String getFullName() {
        return full_name;
    }

    public HashSet<Film> films() {
        HashSet<Film> output = new HashSet<Film>();
        Database.getFilms().forEach(film -> {
            if ( film.getActors().contains(this) ) output.add(film);
        });

        return output;
    }

    public Set<Actor> connectedActors() {
        Set<Actor> outputSet = new HashSet<Actor>();
        HashSet<Film> films = films();

        films.forEach(film -> {
            outputSet.addAll( film.getActors() );
        });
        return outputSet;
    }

    public static TreeSet<Actor> withoutFilms() {
        TreeSet<Actor> output = (TreeSet<Actor>) Database.getActors().clone();
        TreeSet<Film> allFilms = Database.getFilms();
        Iterator<Film> filmIterator = allFilms.iterator();

        // typed iterator
        while (filmIterator.hasNext()) {
            output.removeAll( filmIterator.next().getActors() );
        }

        return output;
    }
}
