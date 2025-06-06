package pl.pjatk.rentalservice.model;

public class Movie {
    private Long id;
    private String name;
    private String category;
    private double duration;
    private boolean isAvailable = false;

    public Movie() {}

    public Movie(Long id, String name, String category, double duration, boolean isAvailable) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.duration = duration;
        this.isAvailable = isAvailable;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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
