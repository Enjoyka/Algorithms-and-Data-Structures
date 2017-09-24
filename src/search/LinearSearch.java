package search;

public class LinearSearch {

    public static int linearSerch(int[] array, int right, int key) {
        for (int i = 0; i < right; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int result = linearSerch(array, array.length, 9);

        if (result == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Element index: " + result);
        }
    }
}
