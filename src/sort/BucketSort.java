package sort;

public class BucketSort {

    public static int[] bucketSort(int[] array, int value) {

        int[] arr = new int[value];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }

        for (int i = 0; i < array.length; i++) {
            arr[array[i]]++;
        }

        int key = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                array[key++] = i;
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

        bucketSort(array, array.length - 1);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
