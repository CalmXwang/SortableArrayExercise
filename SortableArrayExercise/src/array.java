import java.util.Arrays;

public class array {

    public static void sortIntegers(int[] array) {
        Arrays.sort(array);
        System.out.println("Sorted Integer Array: " + Arrays.toString(array));
    }

    public static void sortStrings(String[] array) {
        Arrays.sort(array); 
        System.out.println("Sorted String Array: " + Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] intArray = {5, 3, 8, 1, 2};
        System.out.println("Original Integer Array: " + Arrays.toString(intArray));
        sortIntegers(intArray);

        String[] stringArray = {"banana", "apple", "cherry", "date"};
        System.out.println("Original String Array: " + Arrays.toString(stringArray));
        sortStrings(stringArray);
    }
}
