package anastasiya.kunitskaya;

public abstract class HomeFilm implements IFilm
{
    private Status status;

    public HomeFilm()
    {
        status = Status.Stopped;
    }

    @Override
    public void play() { status = Status.Playing; }
    @Override
    public void stop() { status = Status.Stopped; }
    @Override
    public void pause() { status = Status.Paused; }
    @Override
    public Status getStatus() { return status; }

    public String toString() { return status.toString(); }
}
