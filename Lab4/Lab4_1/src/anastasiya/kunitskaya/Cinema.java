package anastasiya.kunitskaya;

import java.util.Date;

public class Cinema
{
    public enum Company
    {
        KaroFilm,
        CinemaStar,
        CinemaPark
    }
    public enum Rating
    {
        PEGI3,
        PEGI7,
        PEGI12,
        PEGI16,
        PEGI18
    }
    public class CinemaBranch
    {
        public Company name;
        public String address;

        public CinemaBranch(){}
        public CinemaBranch(Company company, String address){
            this.name = company;
            this.address = address;
        }
    }
    public class Film
    {
        public String name;
        public String description;
        public Rating rate;
        public String producer;

        public Film(){}
        public Film(String name, String desc, Rating rate, String prod)
        {
            this.name = name;
            this.description = desc;
            this.rate = rate;
            this.producer = prod;
        }
    }
    public class Session{
        public Date date;
        public Film film;
        public CinemaBranch branch;
        public int cost;

        public Session(){}
        public Session(Date date, Film film, CinemaBranch branch, int cost){
            this.date = date;
            this.film = film;
            this.branch = branch;
            this.cost = cost;
        }
    }
    public Cinema(){}
}
