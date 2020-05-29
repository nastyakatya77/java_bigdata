package anastasiya.kunitskaya;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args)
    {
        int[] num = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Double avg = IntStream.of(num)
                .map(x -> x -= 10)
                .average()
                .getAsDouble();
        System.out.println("Sum: " + avg.toString());
    }
}
