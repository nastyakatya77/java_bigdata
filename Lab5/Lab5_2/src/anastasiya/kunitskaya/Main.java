package anastasiya.kunitskaya;

public class Main {

    public static void main(String[] args)
    {
        IFilm comedy = new Comedy();
        try
        {
            System.out.println(comedy.toString());
            System.out.println(comedy.getStatus());
            comedy.play();
            System.out.println(comedy.getStatus());
        } catch(NullPointerException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
