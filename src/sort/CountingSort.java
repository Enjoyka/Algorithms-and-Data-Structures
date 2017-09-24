package sort;

public class CountingSort {

    public static char[] countingSort(char[] array) {

        char[] output = new char[array.length];

        int letters[] = new int[256];

        for (int i = 0; i < array.length; i++) {
            ++letters[array[i]];
        }

        for (int i = 1; i <= 255; ++i) {
            letters[i] += letters[i - 1];
        }

        for (int i = 0; i < array.length; ++i) {
            output[letters[array[i]] - 1] = array[i];
            --letters[array[i]];
        }

        for (int i = 0; i < array.length; ++i) {
            array[i] = output[i];
        }

        return  array;
    }

    public static void main(String[] args) {
        char[] array = {'d', 'f', 'b', 'a', 'e', 'j', 'c'};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        countingSort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
