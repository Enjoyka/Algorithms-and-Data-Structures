package search;

public class BinarySearch {

    public static int binarySearch(int[] array, int left, int right, int key) {

        if (right >= left) {
            int mid = left + (right - left) / 2;

            if (array[mid] == key) {
                return mid;
            }

            if (array[mid] > key) {
                return binarySearch(array, left, mid - 1, key);
            }

            return binarySearch(array, mid - 1, right, key);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int result = binarySearch(array, 0, array.length - 1, 5);

        if (result == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Element index: " + result);
        }
    }
}
