
/**
 * Created by cuong-phanmanh on 2019/04/24.
 */
public class Main {
    public static void main(String[] args) {
        ArrayForSort arrayForSort = new ArrayForSort();
        arrayForSort.generateRandomArray();
        System.out.println("unsorted array: ");
        arrayForSort.printArray(arrayForSort.getArray());

        QuickSort quickSortArray = new QuickSort(arrayForSort.getArray());
        quickSortArray.quickSort(0, quickSortArray.getArray().length-1);
        System.out.println("\nsorted array: ");
        quickSortArray.printArray(quickSortArray.getArray());
    }

//    private static void quickSort(int[] array, int left, int right) {
//        if (left < right) {
//            int pivot = partition(array, left, right);
//            if (right - pivot <= pivot - left ) {
//                quickSort(array, left, pivot - 1);
//            } else {
//                quickSort(array, pivot + 1, right);
//            }
//        }
//    }
//
//    private static int partition(int[] array, int left, int right) {
//        int pi = array[right];
//        int i = left - 1;
//        int j, median;
//        for (j = left; j < right; j++) {
//            if (array[j] <= pi) {
//                i ++;
//                median = array[j];
//                array[j] = array[i];
//                array[i] = median;
//            }
//        }
//        median = array[i + 1];
//        array[i + 1] = array[right];
//        array[right] = median;
//        return i + 1;
//    }
//
//    private static void printArray(int[] array){
//        for (int i = 0; i <= array.length-1; i++) {
//            System.out.print(array[i] + ", ");
//        }
//    }
//
//    private static int[] generateRandomArray(){
//        Random random = new Random();
//        int randomInt = random.nextInt(100);
//        int[] array = new int[randomInt];
//        for (int i = 0; i < randomInt; i++){
//            array[i] = random.nextInt(10000);
//        }
//        return array;
//    }
}
