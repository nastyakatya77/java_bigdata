package anastasiya.kunitskaya;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args)
    {
        Set<Character> vowels = new HashSet<>(Arrays.asList('а', 'е', 'ё', 'и', 'о', 'у', 'ы', 'э', 'ю', 'я'));
        try
        {
            File file = new File("./src/anastasiya/kunitskaya/text.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = "";
            while (true)
            {
                line = reader.readLine();
                if(line == null)
                    break;
                String[] strs = line.split(" ");
                for(String str : strs)
                    if(str.length() > 0 && vowels.contains(str.charAt(0)))
                        System.out.print(str + " ");
                System.out.println();
            }
        } catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
