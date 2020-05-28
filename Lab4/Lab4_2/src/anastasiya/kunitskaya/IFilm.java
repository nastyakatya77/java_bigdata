package anastasiya.kunitskaya;

public interface IFilm
{
    enum Status
    {
        Playing,
        Stopped,
        Paused
    }

    void play();
    void stop();
    void pause();
    Status getStatus();
}
