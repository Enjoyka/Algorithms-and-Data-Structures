package sort;

public class QuickSort {

    public static void quickSort(int[] array, int left, int right) {

        if (array == null || array.length == 0) {
            return;
        }

        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;
        int key = array[mid];
        int i = left, j = right;

        while (i <= j) {

            while (array[i] < key) {
                i++;
            }

            while (array[j] > key){
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (left < j) {
            quickSort(array, left, j);
        }
        if (right > i) {
            quickSort(array, i, right);
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 6, 9, 1, 3, 4, 2, 8, 7, 0};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        quickSort(array, 0, array.length - 1);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
