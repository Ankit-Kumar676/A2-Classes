import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 5, 1, 6, 7, 8};
        Arrays.sort(array);

        int[] tempArray = new int[array.length];
        int j = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                tempArray[j++] = array[i];
            }
        }
        tempArray[j++] = array[array.length - 1];

        int[] uniqueArray = Arrays.copyOf(tempArray, j);

        System.out.println("Array with duplicates removed: " + Arrays.toString(uniqueArray));
    }
}
