package com.andrewd;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class Film implements Comparable<Film> {
    private final Database database = Database.getInstance();
    private final String name;
    private final HashSet<Actor> actors;


    Film(String name, HashSet<Actor> actors) throws BusinessRulesException {
        if (name == null || name.length() == 0) throw new IllegalArgumentException("Film name is wrong");
        this.name = name;
        this.actors = actors;
        this.database.addFilm(this);
    }

    public HashSet<Actor> getActors() {
        return actors;
    }
    public String getName() {
        return name;
    }

    // Static

    // To avoid problem of overriding in static methods use AtomicList/AtomicReference
    public static HashSet<Film> getFilmWithLargestCast() {
        AtomicInteger maxCast = new AtomicInteger();
        TreeSet<Film> AllFilms = Database.getFilms();
        AtomicReference<HashSet<Film>> filmWithMaxCast = new AtomicReference(new HashSet<Film>(1));

        AllFilms.forEach((film) -> {
            int castNumber = film.getActors().size();
            if (castNumber > maxCast.get()) {
                maxCast.set(castNumber);
                filmWithMaxCast.set(new HashSet<Film>(List.of(film)));
            }
        });
        return filmWithMaxCast.get();
    }

    @Override
    public int compareTo(Film o) {
        return this.name.compareTo( o.getName() );
    }
}
