package task3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Сервис для футбольной команды.
 */
public class FootballTeamService {

    public static List<FootballTeam> getFootballTeams() {
        ArrayList<FootballTeam> footballTeams = new ArrayList<>();
        footballTeams.add(new FootballTeam("Kazan", "Kazan", 4L, 0L));
        footballTeams.add(new FootballTeam("Moscow", "Moscow", 2L, 2L));
        footballTeams.add(new FootballTeam("Humbled tigers", "Chernobyl", 3L, 1L));
        footballTeams.add(new FootballTeam("Gogyder", "Jejydov", 1L, 4L));

        return footballTeams;
    }

    /**
     * Найти команды с количеством побед выше среднего.
     *
     * @param footballTeams футбольные команды.
     * @return List<FootballTeam>.
     */
    public static List<FootballTeam> findFootballTeamWithWinsMoreThanAverage(List<FootballTeam> footballTeams) {
        Double averageWins = 0D;
        for (FootballTeam footballTeam : footballTeams) {
            averageWins += footballTeam.getWins();
        }

        Double finalAverageWins = averageWins;
        return footballTeams.stream()
                .filter(footballTeam -> footballTeam.getWins() >= finalAverageWins / footballTeams.size())
                .collect(Collectors.toList());
    }

    /**
     * Отсортировать список футбольных команд по месту в лиге.
     *
     * @param footballTeams футбольные команды.
     */
    public static void sortFootballTeamsByLeaguePlacement(List<FootballTeam> footballTeams) {
        footballTeams.sort(Comparator.comparing(FootballTeam::getLeaguePlacement));
    }

    /**
     * Найти и обновить футбольную команду по названию и изменить ее город.
     *
     * @param footballTeams футбольные команды.
     * @param name название команды.
     * @param city город.
     * @return FootballTeam.
     */
    public static FootballTeam searchAndUpdateFootballTeamByName(List<FootballTeam> footballTeams, String name, String city) {
        FootballTeam footballTeam = footballTeams.stream()
                .filter(f1 -> name.equals(f1.getName()))
                .findFirst()
                .orElse(null);
        if (footballTeam != null) {
            footballTeam.setCity(city);
        }
        return footballTeam;
    }
}
