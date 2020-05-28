package anastasiya.kunitskaya;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        PrintStream out = System.out;
        Scanner scanner = new Scanner(System.in);

        out.print("Number of lines: ");
        int n = scanner.nextInt();
        out.println("Type your lines");
        scanner.nextLine();

        List<String> strs = new ArrayList<>();
        for(int i = 0; i < n; i++)
            strs.add(scanner.nextLine());

        int min = strs.get(0).length();
        int minInd = 0;
        int max = strs.get(0).length();
        int maxInd = 0;

        for (int i = 1; i < strs.size(); i++)
        {
            int len = strs.get(i).length();
            if(len > max)
            {
                max = len;
                maxInd = i;
            }
            if(len < min)
            {
                min = len;
                minInd = i;
            }
        }

        out.println("Min: (" + Integer.toString(min) + ") " + strs.get(minInd));
        out.println("Max: (" + Integer.toString(max) + ") " + strs.get(maxInd));

        LocalDateTime dateGotEx = LocalDateTime.of(2020, Month.FEBRUARY, 23, 20, 21);
        LocalDateTime datePassEx = LocalDateTime.now();
        out.print("Дата получения задания: ");
        out.println(dateGotEx);
        out.print("Дата сдачи задания: ");
        out.println(datePassEx);
    }
}
