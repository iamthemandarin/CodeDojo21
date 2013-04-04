import java.util.*;

public class SortedListGenerator
{
    public static List<Integer> OurListGenerator(int size)
    {
        List<Integer> ourGeneratedList = new LinkedList<Integer>();
        Random randomGenerator = new Random();

        for(int i = 1; i <= size; i++)
        {
            ourGeneratedList.add(randonGenerator.nextInt());
        }
        
        return ourGeneratedList;
    }
}
