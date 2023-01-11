import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String input = scanner.nextLine();
        if (input.equals("Вячеслав")) {
            System.out.println("Привет " + input);
        } else {
            System.out.println("Нет такого имени");
        }
    }
}

