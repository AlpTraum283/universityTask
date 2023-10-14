package task2;

import java.util.Objects;

/**
 * Модель данных фильма.
 */
public class Movie {

    private String name;

    private Long yearOfManufacture;

    private String country;

    private String genre;

    private Double cost;

    public Movie() {
    }

    public Movie(String name, Long yearOfManufacture, String country, String genre, Double cost) {
        this.name = name;
        this.yearOfManufacture = yearOfManufacture;
        this.country = country;
        this.genre = genre;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(Long yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Objects.equals(name, movie.name) &&
                Objects.equals(yearOfManufacture, movie.yearOfManufacture) &&
                Objects.equals(country, movie.country) &&
                Objects.equals(genre, movie.genre) &&
                Objects.equals(cost, movie.cost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfManufacture, country, genre, cost);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", country='" + country + '\'' +
                ", genre='" + genre + '\'' +
                ", cost=" + cost +
                '}';
    }
}
