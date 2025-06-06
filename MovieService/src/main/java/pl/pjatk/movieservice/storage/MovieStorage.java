package pl.pjatk.movieservice.storage;

import org.springframework.stereotype.Component;
import pl.pjatk.movieservice.model.Movie;

import java.util.ArrayList;
import java.util.List;

@Component
public class MovieStorage {
    private final List<Movie> movies = new ArrayList<>();

    public MovieStorage() {
        movies.add(new Movie(1L, "The Room", "Drama", 99));
        movies.add(new Movie(2L, "Airplane!", "Comedy", 88));
        movies.add(new Movie(3L, "The Matrix", "Action", 136));
    }

    public List<Movie> getAllMovies() {
        return movies;
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }
}