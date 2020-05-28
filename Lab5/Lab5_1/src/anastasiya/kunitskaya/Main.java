package anastasiya.kunitskaya;

import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        Cinema cinema = new Cinema();

        String address = "";
        System.out.println("Input theater address: ");
        try
        {
            address = scanner.nextLine();
        }
        catch (InputMismatchException e)
        {
            System.out.println("Address must be string type");
        }

        String name = "";
        System.out.println("Input film name: ");
        try
        {
            name = scanner.nextLine();
        }
        catch (InputMismatchException e)
        {
            System.out.println("Film name must be string type");
        }

        int cost = 0;
        System.out.println("Input session cost: ");
        try
        {
            cost = scanner.nextInt();
        }
        catch (InputMismatchException e)
        {
            System.out.println("Session cost must be integer type");
        }

        Cinema.CinemaBranch theater = cinema.new CinemaBranch(Cinema.Company.KaroFilm, address);
        Cinema.Film film = cinema.new Film(name, "Awesome film",
                Cinema.Rating.PEGI12, "Christopher Nolan");
        Date date = new Date(1212121212121L);
        Cinema.Session session = cinema.new Session(date, film, theater, 450);

    }
}
