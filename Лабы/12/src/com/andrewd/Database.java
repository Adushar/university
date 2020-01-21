package com.andrewd;
import java.util.*;

public class Database {
    private static final Database INSTANCE = new Database();
    private static TreeSet<Film> films = new TreeSet<Film>();
    private static TreeSet<Actor> actors = new TreeSet<Actor>(new ActorComparator());

    public static void addFilm(Film film) {
        films.add(film);
    }
    public static TreeSet<Film> getFilms() {
        return films;
    }

    public static void addActor(Actor actor) {
        actors.add(actor);
    }
    public static TreeSet<Actor> getActors() {
        return actors;
    }

    public static TreeMap allRecords() {
        TreeMap output = new TreeMap<>();
        output.put( "Films", getFilms() );
        output.put( "Actors", getActors() );
        return output;
    }

    private Database() {}
    public static Database getInstance(){
        return INSTANCE;
    }
}