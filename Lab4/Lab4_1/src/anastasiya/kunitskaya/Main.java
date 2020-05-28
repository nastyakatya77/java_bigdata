package anastasiya.kunitskaya;

import java.util.Date;

public class Main {

    public static void main(String[] args)
    {
        Cinema cinema = new Cinema();
        Cinema.CinemaBranch theater = cinema.new CinemaBranch(Cinema.Company.KaroFilm, "Moscow, South Butovo");
        Cinema.Film film = cinema.new Film("Interstellar", "Awesome film",
                Cinema.Rating.PEGI12, "Christopher Nolan");
        Date date = new Date(1212121212121L);
        Cinema.Session session = cinema.new Session(date, film, theater, 450);
    }
}
