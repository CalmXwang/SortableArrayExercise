import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class IntSorterTest {

    @Test
    public void testSortIntegers() {
        int[] inputArray = {5, 3, 8, 1, 2};
        int[] expectedArray = {1, 2, 3, 5, 8};
        
        IntSorter.sortIntegers(inputArray);
        
        assertArrayEquals(expectedArray, inputArray, "The integer array should be sorted in ascending order.");
    }
}
