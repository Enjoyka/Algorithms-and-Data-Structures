package sort;

public class MergeSort {

    public static void merge(int[] array, int left, int mid, int right) {

        int bar = mid - left + 1;
        int baz = right - mid;

        int low[] = new int[bar];
        int high[] = new int[baz];

        for (int i = 0; i < bar; ++i) {
            low[i] = array[left + i];
        }

        for (int j = 0; j < baz; ++j) {
            high[j] = array[mid + 1 + j];
        }

        int i = 0, j = 0;
        int l = left;

        while (i < bar && j < baz) {
            if (low[i] <= high[j]) {
                array[l] = low[i];
                i++;
            } else {
                array[l] = high[j];
                j++;
            } l++;
        }

        while (i < bar) {
            array[l] = low[i];
            i++;
            l++;
        }

        while (j < baz) {
            array[l] = high[j];
            j++;
            l++;
        }
    }

    public static int[] sort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            sort(array, left, mid);
            sort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {5, 6, 9, 1, 3, 4, 2, 8, 7, 0};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        sort(array, 0, array.length - 1);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
