import java.util.Arrays;
import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        int[] array = generateRandomArray(20);
        System.out.println("Оригінальний масив: " + Arrays.toString(array));

        replaceOddIndexedElements(array);
        System.out.println("Оновлений масив: " + Arrays.toString(array));
    }

    // Функція для генерації масиву з випадкових чисел
    private static int[] generateRandomArray(int length) {
        Random random = new Random();
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(10);
        }

        return array;
    }

    // Функція для заміни непарних індексів на нуль
    private static void replaceOddIndexedElements(int[] array) {
        for (int i = 1; i < array.length; i += 2) {
            array[i] = 0;
        }
    }
}