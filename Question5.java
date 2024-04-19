import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);

        int count = in.nextInt();

        // Array to store the integers
        int[] numbers = new int[count];

        // Reading the integers
        for (int i = 0; i < count; i++) {
            numbers[i] = in.nextInt();
        }

        // Variables to store the mode
        int mode = 0;
        int maxCount = 0;

        // Loop to find the mode
        for (int i = 0; i < count; i++) {
            int currentNumber = numbers[i];
            int currentCount = 0;

            // Count occurrences of the current number
            for (int j = 0; j < count; j++) {
                if (numbers[j] == currentNumber) {
                    currentCount++;
                }
            }

            // Update mode if necessary
            if (currentCount > maxCount) {
                mode = currentNumber;
                maxCount = currentCount;
            }
        }

        // Print the mode
        System.out.println(mode);
    }
}
