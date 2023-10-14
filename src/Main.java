import task1.Vehicle;
import task1.VehicleService;
import task2.Movie;
import task2.MovieService;
import task3.FootballTeam;
import task3.FootballTeamService;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Задание 1
        List<Vehicle> vehicles = VehicleService.getVehicles();
        System.out.println(VehicleService.findVehicleWithLowerCost(vehicles));
        VehicleService.sortVehiclesByYearOfManufacture(vehicles);
        vehicles.forEach(System.out::println);
        System.out.println(VehicleService.searchAndUpdateVehicleByRegNumber(vehicles, 800L, 99125515L));

        System.out.println("--------------------");

        // Задание 2
        List<Movie> movies = MovieService.getMovies();
        MovieService.getMoviesWithCostMoreThanAverage(movies).forEach(System.out::println);
        System.out.println(MovieService.getMovieWithEarlierYearOfManufacture(movies));
        System.out.println(MovieService.searchAndUpdateMovieByName(movies, "Iron man", 25125D));

        System.out.println("--------------------");

        // Задание 3
        List<FootballTeam> footballTeams = FootballTeamService.getFootballTeams();
        FootballTeamService.findFootballTeamWithWinsMoreThanAverage(footballTeams).forEach(System.out::println);
        FootballTeamService.sortFootballTeamsByLeaguePlacement(footballTeams);
        footballTeams.forEach(System.out::println);
        System.out.println(FootballTeamService.searchAndUpdateFootballTeamByName(footballTeams,"Moscow","Ryazan"));

    }

}
