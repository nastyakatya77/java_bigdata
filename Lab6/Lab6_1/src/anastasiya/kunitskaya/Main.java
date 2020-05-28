package anastasiya.kunitskaya;

import java.util.Stack;

public class Main
{

    public static void main(String[] args)
    {
        String strGood = "(dasd{sad sad [ sada r] asd} d [ (asd) d ]dsf) sdf";
        String strBad = "(dasd{sad sad [ sada r] asd} d [ ((asd) d ]dsf) sdf";
        System.out.println(strGood + ". Str is " + Boolean.toString(checkBrackets(strGood)));
        System.out.println(strBad + ". Str is " + Boolean.toString(checkBrackets(strBad)));
    }

    public static boolean checkBrackets(String str)
    {
        Stack<Bracket> brackets = new Stack<>();
        for(Character ch : str.toCharArray())
        {
            Bracket bracket = new Bracket(Bracket.BracketType.None);
            boolean res = getType(bracket, ch);
            if(res)
            {
                brackets.push(bracket);
            } else
            {
                if(bracket.type != Bracket.BracketType.None)
                {
                    if(brackets.lastElement().type == bracket.type)
                        brackets.pop();
                    else
                        return false;
                }
            }
        }
        if(brackets.size() == 0)
            return true;
        else
            return false;
    }

    public static boolean getType(Bracket bracket, Character ch) //true - open
    {
        switch (ch)
        {
            case '(':
                bracket.type = Bracket.BracketType.Round;
                return true;
            case ')':
                bracket.type = Bracket.BracketType.Round;
                return false;
            case '[':
                bracket.type = Bracket.BracketType.Square;
                return true;
            case ']':
                bracket.type = Bracket.BracketType.Square;
                return false;
            case '{':
                bracket.type = Bracket.BracketType.Brace;
                return true;
            case '}':
                bracket.type = Bracket.BracketType.Brace;
                return false;
            default:
                bracket.type = Bracket.BracketType.None;
                return false;
        }
    }
}
