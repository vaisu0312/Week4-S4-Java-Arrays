import java.util.Arrays;

public class ArrayFundamentals {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        System.out.println("New array: " + Arrays.toString(numbers));
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        System.out.println("Initialized array: " + Arrays.toString(numbers));
        System.out.println("First element: " + numbers[0]);
        System.out.print("Using a loop: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        numbers[2] = 99;
        System.out.println("Modified array: " + Arrays.toString(numbers));
        System.out.println("Array length: " + numbers.length);
    }
}
