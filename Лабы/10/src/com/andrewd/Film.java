package com.andrewd;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class Film {
    private final Database database = Database.getInstance();
    private String name;
    private ArrayList<Actor> actors;


    Film(String name, ArrayList<Actor> actors) {
        if (name.length() == 0) throw new IllegalArgumentException("Film name is incorrect");

        this.name = name;
        this.actors = actors;
        this.database.addFilm(this);
    }

    public ArrayList<Actor> getActors() {
        return actors;
    }

    public String getName() {
        return name;
    }

    // Static

    // To avoid problem of overriding in static methods use AtomicList/AtomicReference
    public static ArrayList<Film> getFilmWithLargestCast() {
        AtomicInteger maxCast = new AtomicInteger();
        ArrayList<Film> AllFilms = Database.getFilms();
        AtomicReference<ArrayList<Film>> filmWithMaxCast = new AtomicReference<>(new ArrayList<Film>(1));

        AllFilms.forEach((film) -> {
            int castNumber = film.getActors().size();
            if (castNumber > maxCast.get()) {
                maxCast.set(castNumber);
                filmWithMaxCast.set(new ArrayList<Film>(List.of(film)));
            }
        });
        return filmWithMaxCast.get();
    }
}
