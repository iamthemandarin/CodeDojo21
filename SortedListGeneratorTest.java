import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

public class SortedListGeneratorTest
{
	@Test
	public void isNonEmptyList()
	{
		assertFalse(SortedListGenerator.OurListGenerator(1).isEmpty());
	}

	@Test
	public void containsTheRequiredSize()
	{
		int anySize = 10;
		assertEquals(anySize, SortedListGenerator.OurListGenerator(anySize).size());
	}

	@Test
	public void sorts()
	{
		final Integer[] ints = SortedListGenerator.OurListGenerator(10000).toArray(new Integer[0]);
		sort(ints);
		System.out.println(ints[0]);

		for (int i = 0; i < ints.length - 1; ++i)
		{
			System.out.println(ints[i + 1]);
			assertTrue(ints[i] <= ints[i + 1]);
		}
	}

	public void sort(Integer[] ints)
	{
		for (int i = 0; i < ints.length; ++i)
		{
			for (int j = 0; j < ints.length - 1 - i; ++j)
			{
				if (ints[j] > ints[j + 1])
				{
					final int temp = ints[j];
					ints[j] = ints[j + 1];    
					ints[j + 1] = temp;
				}
			}
		}
	}
}