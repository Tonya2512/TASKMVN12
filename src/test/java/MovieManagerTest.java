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
}