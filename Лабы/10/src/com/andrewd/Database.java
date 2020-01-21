package com.andrewd;
import java.util.ArrayList;

public class Database {
    private static final Database INSTANCE = new Database();
    private static ArrayList<Film> films = new ArrayList<Film>();
    private static ArrayList<Actor> actors = new ArrayList<Actor>();

    public static void addFilm(Film film) {
        films.add(film);
    }

    public static ArrayList<Film> getFilms() {
        return films;
    }

    public static void addActor(Actor actor) {
        actors.add(actor);
    }

    public static ArrayList<Actor> getActors() {
        return actors;
    }

    private Database() {}
    public static Database getInstance(){
        return INSTANCE;
    }
}