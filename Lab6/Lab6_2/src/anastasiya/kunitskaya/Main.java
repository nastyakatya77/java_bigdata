package anastasiya.kunitskaya;

public class Main
{

    public static void main(String[] args)
    {
        NumberHolder ints = new NumberHolder();
        ints.addNumber(2);
        ints.addNumber(5);
        ints.addNumber(-10);
        ints.addNumber(15);
        try
        {
            System.out.println(ints.getNearest(0).toString());
            System.out.println(ints.getNearest(-5).toString());
            System.out.println(ints.getNearest(9).toString());
            ints.removeNumber(2);
            ints.removeNumber(1);
            System.out.println(ints.getNearest(0).toString());
        }catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
