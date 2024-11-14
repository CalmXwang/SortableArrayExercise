import java.util.Arrays;

public class StringSorter {

    public static void sortStrings(String[] array) {
        Arrays.sort(array);
        System.out.println("Sorted String Array: " + Arrays.toString(array));
    }

    public static void main(String[] args) {
        String[] stringArray = {"banana", "apple", "cherry", "date"};
        System.out.println("Original String Array: " + Arrays.toString(stringArray));
        sortStrings(stringArray);
    }
}
