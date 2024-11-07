import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class StringSorterTest {

    @Test
    public void testSortStrings() {
        String[] inputArray = {"banana", "apple", "cherry", "date"};
        String[] expectedArray = {"apple", "banana", "cherry", "date"};
        
        StringSorter.sortStrings(inputArray);
        
        assertArrayEquals(expectedArray, inputArray, "The string array should be sorted in alphabetical order.");
    }
}
