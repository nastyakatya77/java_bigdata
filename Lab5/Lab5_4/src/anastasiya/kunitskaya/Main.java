package anastasiya.kunitskaya;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args)
    {
        try
        {
            String text = new String(Files.readAllBytes(Paths.get("./src/anastasiya/kunitskaya/Class.java")), StandardCharsets.UTF_8);
            text = text.replaceAll("public", "private");
            new File("./src/anastasiya/kunitskaya/newDir").mkdirs();
            PrintWriter out = new PrintWriter("./src/anastasiya/kunitskaya/newDir/NewClass.java");
            out.print(text);
            out.close();
        } catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
