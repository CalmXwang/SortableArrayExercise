import java.util.Arrays;

public class array {

    public static void sortIntegers(int[] array) {
        Arrays.sort(array); 
        System.out.println("Sorted Integer Array: " + Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] intArray = {6,7,2,1,5};
        System.out.println("Original Integer Array: " + Arrays.toString(intArray));
        sortIntegers(intArray); 
    }
}
