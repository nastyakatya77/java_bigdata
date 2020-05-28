package anastasiya.kunitskaya;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Hello hello = new Hello();

        PrintStream out = System.out;
        Scanner scanner = new Scanner(System.in);

        out.println("Type numbers with enter or space. Type non number to calculate.");

        List<Integer> arr = new ArrayList<>();
        try
        {
            while(true)
            {
                Integer n = scanner.nextInt();
                arr.add(n);
            }
        } catch (InputMismatchException ex) {}

        out.println("Array:");
        printList(arr);

        out.println("Calculating...");

        List<Integer> divided3or9 = new ArrayList<>();
        for(int i = 0; i < arr.size(); i++)
            if(arr.get(i) % 3 == 0)
                divided3or9.add(arr.get(i));

        out.println("Divided by 3 or 9");
        printList(divided3or9);
    }

    public static void printList(List<Integer> list)
    {
        for(int i = 0; i < list.size(); i++)
        {
            System.out.print(list.get(i));
            System.out.print(' ');
        }
        System.out.println();
    }
}
