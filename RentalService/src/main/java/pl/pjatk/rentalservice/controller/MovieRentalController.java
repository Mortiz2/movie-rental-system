package pl.pjatk.rentalservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.rentalservice.model.Movie;
import pl.pjatk.rentalservice.service.MovieRentalService;

@RestController
@RequestMapping("/rental")
public class MovieRentalController {
    private final MovieRentalService movieRentalService;

    @Autowired
    public MovieRentalController(MovieRentalService movieRentalService) {
        this.movieRentalService = movieRentalService;
    }

    @GetMapping("/movie/{id}")
    public Movie getMovie(@PathVariable Long id) {
        return movieRentalService.getMovie(id);
    }

    @PostMapping("/movie/{id}/return")
    public void returnMovie(@PathVariable Long id) {
        movieRentalService.returnMovie(id);
    }

    @PostMapping("/movie/{id}/rent")
    public void rentMovie(@PathVariable Long id) {
        movieRentalService.rentMovie(id);
    }
}
