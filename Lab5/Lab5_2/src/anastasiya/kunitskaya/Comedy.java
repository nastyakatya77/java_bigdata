package anastasiya.kunitskaya;

public class Comedy extends HomeFilm
{
    public Comedy()
    {
        super();
    }

    @Override
    public String toString()
    {
        throw new NullPointerException("Exception!!!!");
        //return "Comedy " + super.toString();
    }
}
