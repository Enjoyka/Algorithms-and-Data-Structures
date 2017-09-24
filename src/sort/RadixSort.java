package sort;

public class RadixSort {

    public static int[] radixSort(int[] array, int size) {

        int[] output = new int[size];
        int[] count = new int[10];
        int exp = 1;

        for (int i = 1; i < size; i++) {
            count[(array[i] / exp) % 10]++;
        }

        for (int i = 1; i < 10; i++) {
            output[count[(array[i] / exp) % 10] - 1] = array[i];
            count[(array[i] / exp) % 10]--;
        }

        for (int i = 0; i < size; i++) {
            array[i] = output[i];
        }

        return array;
    }

    public static int getMax(int[] array, int size) {

        int max = array[0];

        for (int i = 0; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] array = {5, 6, 9, 1, 3, 4, 2, 8, 7, 0};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        radixSort(array, array.length);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
