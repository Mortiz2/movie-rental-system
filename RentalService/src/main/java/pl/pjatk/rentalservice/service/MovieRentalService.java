package pl.pjatk.rentalservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestTemplate;
import pl.pjatk.rentalservice.model.Movie;

import java.net.ConnectException;

@Service
public class MovieRentalService {
    private final RestTemplate restTemplate;

    private static final String MOVIE_SERVICE_URL = "http://localhost:8080/movies";

    @Autowired
    public MovieRentalService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public ResponseEntity<Movie> getMovie(Long id) {
        String url = MOVIE_SERVICE_URL + "/" + id;
        try {
            Movie movie = restTemplate.getForObject(url, Movie.class);
            return ResponseEntity.ok(movie);
        } catch (HttpClientErrorException e) {
            if (e.getStatusCode().value() == 404) {
                return ResponseEntity.status(404).build();
            } else if (e.getStatusCode().value() == 400) {
                return ResponseEntity.status(400).build();
            }
            return ResponseEntity.status(e.getStatusCode()).build();
        } catch (HttpServerErrorException e) {
            if (e.getStatusCode().value() == 500) {
                return ResponseEntity.status(502).build();
            }
            return ResponseEntity.status(e.getStatusCode()).build();
        } catch (ResourceAccessException e) {
            if (e.getCause() instanceof ConnectException) {
                return ResponseEntity.status(504).build();
            }
            return ResponseEntity.status(500).build();
        } catch (Exception e) {
            return ResponseEntity.status(500).build();
        }
    }

    public ResponseEntity<Void> returnMovie(Long id) {
        String url = MOVIE_SERVICE_URL + "/" + id + "/available";
        try {
            restTemplate.exchange(url, HttpMethod.POST, HttpEntity.EMPTY, Void.class);
            return ResponseEntity.ok().build();
        } catch (HttpClientErrorException e) {
            if (e.getStatusCode().value() == 404) {
                return ResponseEntity.status(404).build();
            } else if (e.getStatusCode().value() == 400) {
                return ResponseEntity.status(400).build();
            }
            return ResponseEntity.status(e.getStatusCode()).build();
        } catch (HttpServerErrorException e) {
            if (e.getStatusCode().value() == 500) {
                return ResponseEntity.status(502).build();
            }
            return ResponseEntity.status(e.getStatusCode()).build();
        } catch (ResourceAccessException e) {
            if (e.getCause() instanceof ConnectException) {
                return ResponseEntity.status(504).build();
            }
            return ResponseEntity.status(500).build();
        } catch (Exception e) {
            return ResponseEntity.status(500).build();
        }
    }

    public ResponseEntity<Void> rentMovie(Long id) {
        String url = MOVIE_SERVICE_URL + "/" + id + "/rentMovie";
        try {
            restTemplate.exchange(url, HttpMethod.POST, HttpEntity.EMPTY, Void.class);
            return ResponseEntity.ok().build();
        } catch (HttpClientErrorException e) {
            if (e.getStatusCode().value() == 404) {
                return ResponseEntity.status(404).build();
            } else if (e.getStatusCode().value() == 400) {
                return ResponseEntity.status(400).build();
            }
            return ResponseEntity.status(e.getStatusCode()).build();
        } catch (HttpServerErrorException e) {
            if (e.getStatusCode().value() == 500) {
                return ResponseEntity.status(502).build();
            }
            return ResponseEntity.status(e.getStatusCode()).build();
        } catch (ResourceAccessException e) {
            if (e.getCause() instanceof ConnectException) {
                return ResponseEntity.status(504).build();
            }
            return ResponseEntity.status(500).build();
        } catch (Exception e) {
            return ResponseEntity.status(500).build();
        }
    }
}