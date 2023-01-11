import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number: ");
            String input = scanner.nextLine();

            try {
                int number = Integer.parseInt(input);

                if (number > 7) {
                    System.out.println("Hello");
                }
                return;
            } catch (NumberFormatException e) {
                System.out.println("Only numbers are expected. Try again.");
            }
        }
    }
}

