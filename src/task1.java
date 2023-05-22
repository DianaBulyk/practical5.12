public class task1 {
    public static void main(String[] args) {
        int size = (99 - 1) / 2 + 1;
        int[] oddNumbers = new int[size];

        int number = 1;
        for (int i = 0; i < size; i++) {
            oddNumbers[i] = number;
            number += 2;
        }

        for (int i = 0; i < size; i++) {
            System.out.println(oddNumbers[i]);
        }
    }
}