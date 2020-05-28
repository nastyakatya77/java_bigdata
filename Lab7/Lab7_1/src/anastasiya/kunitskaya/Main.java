package anastasiya.kunitskaya;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type text");
        String line = scanner.nextLine();
        System.out.println("Length");
        int len = scanner.nextInt();
        System.out.println("Substring");
        scanner.nextLine();
        String word = scanner.nextLine();

        StringBuilder stringBuilder = new StringBuilder();
        for(String str : line.split(" "))
        {
            if(str.length() == len)
                stringBuilder.append(word);
            else
                stringBuilder.append(str);
            stringBuilder.append(' ');
        }

        System.out.println(stringBuilder.toString());
    }
}
