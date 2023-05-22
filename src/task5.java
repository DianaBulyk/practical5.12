import java.util.Random;

public class task5 {
    public static void main(String[] args) {
        int[][] array = new int[15][];
        Random random = new Random();

        // Встановлюємо кількості стовбців для кожної стрічки
        for (int i = 0; i < array.length; i++) {
            if (i < 4) {
                array[i] = new int[5];
            } else if (i < 8) {
                array[i] = new int[8];
            } else if (i < 12) {
                array[i] = new int[3];
            } else {
                array[i] = new int[9];
            }
        }

        // Наповнюємо масив випадковими значеннями
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(16);
            }
        }

        // Виводимо масив на екран
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}