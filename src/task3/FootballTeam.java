package task3;

import java.util.Objects;

/**
 * Модель данных фульбольной команды.
 */
public class FootballTeam {

    /**
     * Название.
     */
    private String name;

    /**
     * Город.
     */
    private String city;

    /**
     * Место в лиге.
     */
    private Long leaguePlacement;

    /**
     * Количество побед.
     */
    private Long wins;

    public FootballTeam() {
    }

    public FootballTeam(String name, String city, Long leaguePlacement, Long wins) {
        this.name = name;
        this.city = city;
        this.leaguePlacement = leaguePlacement;
        this.wins = wins;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Long getLeaguePlacement() {
        return leaguePlacement;
    }

    public void setLeaguePlacement(Long leaguePlacement) {
        this.leaguePlacement = leaguePlacement;
    }

    public Long getWins() {
        return wins;
    }

    public void setWins(Long wins) {
        this.wins = wins;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FootballTeam that = (FootballTeam) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(city, that.city) &&
                Objects.equals(leaguePlacement, that.leaguePlacement) &&
                Objects.equals(wins, that.wins);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, city, leaguePlacement, wins);
    }

    @Override
    public String toString() {
        return "FootballTeam{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", leaguePlacement=" + leaguePlacement +
                ", wins='" + wins + '\'' +
                '}';
    }
}
