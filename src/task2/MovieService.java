package task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Сервис для работы с фильмами.
 */
public class MovieService {

    /**
     * Получить список фильмов.
     *
     * @return список фильмов.
     */
    public static List<Movie> getMovies() {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Terminator", 2000L, "USA", "Fantasy", 20000D));
        movies.add(new Movie("Iron man", 2001L, "France", "Comedy", 17600D));
        movies.add(new Movie("Bee movie", 2002L, "Germany", "Romance", 12500D));
        movies.add(new Movie("One Handed Man", 2003L, "South Korea", "Horror", 10000D));
        return movies;
    }

    /**
     * Получить список фильмов с ценой, больше средней.
     *
     * @param movies список фильмов.
     * @return список фильмов с ценой, больше средней.
     */
    public static List<Movie> getMoviesWithCostMoreThanAverage(List<Movie> movies) {
        Double averageCost = 0D;
        for (Movie movie : movies) {
            averageCost += movie.getCost();
        }

        Double finalAverageCost = averageCost;
        return movies.stream()
                .filter(movie -> movie.getCost() >= finalAverageCost / movies.size())
                .collect(Collectors.toList());
    }

    /**
     * Получить фильм с самым ранним годом выпуска.
     *
     * @param movies список фильмов.
     * @return фильм с самым ранним годом выпуска.
     */
    public static Movie getMovieWithEarlierYearOfManufacture(List<Movie> movies) {
        movies.sort(Comparator.comparing(Movie::getYearOfManufacture));
        return movies.get(0);
    }

    /**
     * Найти и обновить фильм по имени.
     *
     * @param movies список фильмов.
     * @param name имя фильма.
     * @param cost стоимость для изменения.
     * @return фильм.
     */
    public static Movie searchAndUpdateMovieByName(List<Movie> movies, String name, Double cost) {
        Movie movie = movies.stream()
                .filter(m1 -> name.equals(m1.getName()))
                .findFirst()
                .orElse(null);
        if (movie != null) {
            movie.setCost(cost);
        }
        return movie;
    }
}
