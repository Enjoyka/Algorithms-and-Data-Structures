package sort;

public class HeapSort {

    public static void heapSort(int[] array, int count) {

        heapify(array, count);

        int right = count - 1;

        while (right > 0) {
            swap(array, right, 0);
            siftDown(array, 0, --right);
        }
    }

    public static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public static void heapify(int[] array, int count) {

        int left = count / 2 - 1;

        while (left >= 0) {
            siftDown(array, left, count - 1);
            left--;
        }
    }

    public static void siftDown(int[] array, int left, int right) {

        int foo = left;

        while (foo * 2 + 1 <= right) {
            int bar = foo * 2 + 1;
            int swap = foo;

            if (array[swap] < array[bar]) {
                swap = bar;
            }

            if (bar + 1 <= right && array[swap] < array[bar + 1]) {
                swap = bar + 1;
            }

            if (swap != foo) {
                swap(array, foo, swap);
                foo = swap;
            } else {
                return;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 6, 9, 1, 3, 4, 2, 8, 7, 0};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        heapSort(array, array.length);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
