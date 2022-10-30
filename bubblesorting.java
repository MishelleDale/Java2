import java.util.Arrays;
import java.util.logging.*;

public class bubblesorting{
    public static void main(String[] args) {
    var array = new int[]{5, 2, 6, 7, 9, 6, 1, 8, 4};
    System.out.println("Изначальный массив: " + Arrays.toString(array));
    bubbleSort(array);
    System.out.println("Новый массив: " + Arrays.toString(array));

    }

   

    private static void bubbleSort(int[] array) {
        

        var sorted = false;
        while (!sorted) {
            sorted = true;
            for (var i = 1; i < array.length; i++) {
                var previous = array[i - 1];
                var current = array[i];
                logger.info("Элемент итерации равен " + current);
                if (previous > current) {
                    swap(array, i - 1, i);
                    sorted = false;
                }
            }
        }
    }

    private static void swap(int[] array, int index1, int index2) {
        var buffer = array[index1];
        array[index1] = array[index2];
        array[index2] = buffer;
    }

    public static final Logger logger = Logger.getLogger("main");
   
}

