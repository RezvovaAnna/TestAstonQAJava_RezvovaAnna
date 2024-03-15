import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        System.out.print("Введите первую строку: ");
        Scanner scanner = new Scanner(System.in);
        String first = scanner.next();
        System.out.print("Введите вторую строку: ");
        String second = scanner.next();
        if (first.equals(second)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
        scanner.close();
    }
}
