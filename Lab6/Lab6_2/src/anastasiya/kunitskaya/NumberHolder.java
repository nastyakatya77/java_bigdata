package anastasiya.kunitskaya;

import java.util.*;

public class NumberHolder
{
    private Set<Integer> numbers;

    public NumberHolder()
    {
        numbers = new HashSet<>();
    }

    public void addNumber(int number)
    {
        numbers.add(number);
    }

    public boolean removeNumber(int number)
    {
        return numbers.remove(number);
    }

    public Integer getNearest(int number) throws Exception
    {
        if(numbers.size() == 0)
            throw new Exception("No numbers");

        List<Integer> list = new ArrayList<>(numbers);
        int minDiff = Math.abs(list.get(0) - number);
        int minDiffInd = 0;
        for(int i = 1; i < list.size(); i++)
        {
            if(Math.abs(list.get(i) - number) < minDiff)
            {
                minDiff = Math.abs(list.get(i) - number);
                minDiffInd = i;
            }
        }
        return list.get(minDiffInd);
    }
}
