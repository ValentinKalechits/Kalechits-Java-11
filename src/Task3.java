import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers;

        while (true) {
            System.out.print("Please enter an array of integers, separated by spaces: ");
            String input = scanner.nextLine();

            try {
                String[] inputNumbers = input.split(" ");
                numbers = new int[inputNumbers.length];
                for (int i = 0; i < inputNumbers.length; i++) {
                    numbers[i] = Integer.parseInt(inputNumbers[i]);
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid array of integers, separated by spaces.");
            }
        }

        System.out.print("Numbers divisible by 3: ");
        for (int number : numbers) {
            if (number % 3 == 0) {
                System.out.print(number + " ");
            }
        }
    }
}