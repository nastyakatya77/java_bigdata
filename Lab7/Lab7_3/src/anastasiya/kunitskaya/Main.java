package anastasiya.kunitskaya;

import java.util.HashSet;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //asd e hgh ttr ese tte. fgh asd sdof kwejr. jnodg ttr lkfg [ewpr. tter df tte
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type sentences");
        String input = scanner.nextLine();
        String[] sentences = input.split("\\.");
        HashSet<String> strs = new HashSet<>();
        for(int i = 1; i < sentences.length; i++)
            for (String str: sentences[i].split(" "))
                strs.add(str);

        for(String str: sentences[0].split(" "))
            if(!strs.contains(str))
                System.out.println(str);
    }
}
