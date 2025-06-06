package pl.pjatk.movieservice.model;

import jakarta.persistence.*;

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String genre;
    private double duration;

    @Column(nullable = false)
    private boolean isAvailable = false;

    public Movie() {}

    public Movie(Long id, String title, String genre, double duration) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.duration = duration;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String category) {
        this.genre = category;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }
}
