import java.util.Arrays;

/**
 * Created by cuong-phanmanh on 2019/04/24.
 */
public class QuickSort extends ArrayForSort {
    private int[] array;
    public QuickSort(int[] arr) {
        array = Arrays.copyOf(arr, arr.length);
    }

    public int[] getArray(){
        return array;
    }

    public void quickSort(int left, int right) {
        if (left < right) {
            int pivot = partition(left, right);
            if (right - pivot <= pivot - left ) {
                quickSort(left, pivot - 1);
            } else {
                quickSort(pivot + 1, right);
            }
        }
    }

    private int partition(int left, int right) {
        int pi = array[right];
        int i = left - 1;
        int j, median;
        for (j = left; j < right; j++) {
            if (array[j] <= pi) {
                i ++;
                median = array[j];
                array[j] = array[i];
                array[i] = median;
            }
        }
        median = array[i + 1];
        array[i + 1] = array[right];
        array[right] = median;
        return i + 1;
    }
}
