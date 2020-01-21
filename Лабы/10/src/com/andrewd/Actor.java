package com.andrewd;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Actor {
    private String full_name;

    Actor(String full_name) {
        this.full_name = full_name;
        Database.addActor(this);
    }

    public ArrayList<Film> films() {
        ArrayList<Film> output = new ArrayList<Film>();
        Database.getFilms().forEach(film -> {
            if ( film.getActors().contains(this) ) output.add(film);
        });

        return output;
    }

    public Set<Actor> connectedActors() {
        Set<Actor> outputSet = new HashSet<Actor>();
        ArrayList<Film> films = films();

        for (int i = 0; i < films.size(); i++) {
            outputSet.addAll( films.get(i).getActors() );
        }

        return outputSet;
    }

    public static ArrayList<Actor> withoutFilms() {
        ArrayList<Actor> output = (ArrayList<Actor>) Database.getActors().clone();
        ArrayList<Film> allFilms = Database.getFilms();
        Iterator<Film> filmIterator = allFilms.iterator();

        // typed iterator
        while (filmIterator.hasNext()) {
            output.removeAll( filmIterator.next().getActors() );
        }

        return output;
    }
}
