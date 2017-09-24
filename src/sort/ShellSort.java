package sort;

public class ShellSort {

    public static int[] shellSort(int[] array, int elements) {

        for (int d = elements / 2; d >= 1; d /= 2) {
            for (int i = d; i < elements; i++) {
                for (int j = i; j >= d && array[j - d] > array[j]; j -= d) {
                    int  temp = array[j];
                    array[j] = array[j - d];
                    array[j - d] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {5, 6, 9, 1, 3, 4, 2, 8, 7, 0};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        shellSort(array, array.length);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
