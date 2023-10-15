package ru.netology.javaqa.javamvn.manager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {

    @Test

    public void addMovie() {
        MovieManager manager = new MovieManager();
        manager.addMovies("Film I");

        String[] expect = {"Film I"};
        String[] actual = manager.findALL();
        Assertions.assertArrayEquals(expect, actual);

    }

    @Test

    public void addAllMovies() {
        MovieManager manager = new MovieManager();
        manager.addMovies("Film I");
        manager.addMovies("Film II");
        manager.addMovies("Film III");

        String[] expect = {"Film I", "Film II", "Film III"};
        String[] actual = manager.findALL();
        Assertions.assertArrayEquals(expect, actual);

    }

    @Test

    public void addMoviesFromEnd() {
        MovieManager manager = new MovieManager();
        manager.addMovies("Film I");
        manager.addMovies("Film II");
        manager.addMovies("Film III");

        String[] expect = {"Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expect, actual);

    }
    @Test

    public void movieManagerLessThanLimit() {
        MovieManager manager = new MovieManager();
        manager.addMovies("Wanted");
        manager.addMovies("Key");
        manager.addMovies("Cube");
        manager.addMovies("Lost");

        String[] expect = {"Wanted", "Key","Cube","Lost"};
        String[] actual = manager.findALL();
        Assertions.assertArrayEquals(expect, actual);
    }
    @Test

    public void movieManagerMoreThanLimit() {
        MovieManager manager = new MovieManager();
        manager.addMovies("Wanted");
        manager.addMovies("Key");
        manager.addMovies("Cube");
        manager.addMovies("Lost");
        manager.addMovies("Hello");
        manager.addMovies("Begin");


        String[] expect = {"Wanted","Key","Cube","Lost","Hello","Begin"};
        String[] actual = manager.findALL();
        Assertions.assertArrayEquals(expect, actual);
    }
    @Test

    public void movieManagerEqualLimit() {
        MovieManager manager = new MovieManager();
        manager.addMovies("Wanted");
        manager.addMovies("Key");
        manager.addMovies("Cube");
        manager.addMovies("Lost");
        manager.addMovies("Hello");

        String[] expect = {"Wanted","Key","Cube","Lost","Hello"};
        String[] actual = manager.findALL();
        Assertions.assertArrayEquals(expect, actual);
    }
    
    }