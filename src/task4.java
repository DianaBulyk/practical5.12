import java.util.Arrays;
import java.util.Random;

public class task4 {
    public static void main(String[] args) {
        int[] array1 = generateRandomArray(10);
        int[] array2 = generateRandomArray(10);
        int[] sumArray = new int[10];

        for (int i = 0; i < 10; i++) {
            sumArray[i] = array1[i] + array2[i];
        }

        System.out.println("Масив 1: " + Arrays.toString(array1));
        System.out.println("Масив 2: " + Arrays.toString(array2));
        System.out.println("Сума масивів: " + Arrays.toString(sumArray));
    }

    // Функція для генерації масиву з випадкових чисел
    private static int[] generateRandomArray(int length) {
        Random random = new Random();
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(11);
        }

        return array;
    }
}