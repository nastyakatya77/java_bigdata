package anastasiya.kunitskaya;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args)
    {
        Collection<String> collection = Arrays.asList("a", "b", "c", "d");
        var res = collection.stream().collect( Collectors.joining( ":" ) );
        System.out.println(res);
    }
}
