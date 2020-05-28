package anastasiya.kunitskaya;

public class Bracket
{
    enum BracketType
    {
        None,
        Round,
        Square,
        Brace
    }

    public BracketType type;
    public Bracket(BracketType type) { this.type = type; }
}
