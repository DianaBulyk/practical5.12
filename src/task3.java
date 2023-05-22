import java.util.Arrays;
import java.util.Random;

public class task3 {
    public static void main(String[] args) {
        int[] array1 = generateRandomArray(5);
        int[] array2 = generateRandomArray(5);
        int[] array3 = generateRandomArray(5);

        System.out.println("Масив 1: " + Arrays.toString(array1));
        System.out.println("Масив 2: " + Arrays.toString(array2));
        System.out.println("Масив 3: " + Arrays.toString(array3));

        double average1 = calculateAverage(array1);
        double average2 = calculateAverage(array2);
        double average3 = calculateAverage(array3);

        if (average1 > average2 && average1 > average3) {
            System.out.println("Середнє значення масиву 1 є більшим: " + average1);
        } else if (average2 > average1 && average2 > average3) {
            System.out.println("Середнє значення масиву 2 є більшим: " + average2);
        } else if (average3 > average1 && average3 > average2) {
            System.out.println("Середнє значення масиву 3 є більшим: " + average3);
        } else {
            System.out.println("Середні значення масивів рівні: " + average1);
        }
    }

    // Функція для генерації масиву з випадкових чисел
    private static int[] generateRandomArray(int length) {
        Random random = new Random();
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(6);
        }

        return array;
    }

    // Функція для підрахунку середнього значення масиву
    private static double calculateAverage(int[] array) {
        int sum = 0;

        for (int num : array) {
            sum += num;
        }

        return (double) sum / array.length;
    }
}