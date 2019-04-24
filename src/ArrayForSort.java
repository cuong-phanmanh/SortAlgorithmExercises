import java.util.Random;

/**
 * Created by cuong-phanmanh on 2019/04/24.
 */
public class ArrayForSort {
    private int[] array;

    public int[] getArray(){
        return array;
    }

    public void printArray(int[] array){
        for (int i = 0; i <= array.length-1; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    public void generateRandomArray(){
        Random random = new Random();
        int randomInt = random.nextInt(100);
        array = new int[randomInt];
        for (int i = 0; i < randomInt; i++){
            array[i] = random.nextInt(10000);
        }
    }
}
