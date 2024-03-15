import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        System.out.print("Введите любое целое число: ");
        Scanner scanner = new Scanner(System.in);
        int firstNum = 0;
        try {
            firstNum = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Неверный ввод!");

        }
        System.out.print("Введите еще любое целое число: ");
        int secondNum = 0;
        try {
            secondNum = scanner.nextInt();
        }
        catch (Exception e) {
            System.out.println("Неверный ввод!");
        }
        if (firstNum > secondNum) {
            System.out.println(firstNum + " > " + secondNum);
        }
        if (secondNum > firstNum) {
            System.out.println(secondNum + " > " + firstNum);
        } else {
            System.out.println(firstNum + " = " + secondNum);
        }

        System.out.print("Введите оператор (* / + -): ");
        String operator = scanner.next();
        scanner.close();

        if (operator.equals("*")) {
            int res = firstNum * secondNum;
            System.out.println("Результат умножения: " + res);
        }
        if (operator.equals("+")) {
            int res = firstNum + secondNum;
            System.out.println("Результат сложения: " + res);
        }
        if (operator.equals("-")) {
            int res = Math.abs(firstNum - secondNum);
            System.out.println("Результат вычитания: " + res);
        }
        if (operator.equals("/") && firstNum > secondNum) {
            double res = (double) firstNum / secondNum;
            System.out.println("Результат деления: " + res);
        }
        if (operator.equals("/") && firstNum < secondNum) {
            double res = (double) secondNum / firstNum;
            System.out.println("Результат деления: " + res);
        }
        if (!operator.equals("+")&& !operator.equals("-") && !operator.equals("*")&& !operator.equals("/")) {
            System.out.println("Неверный оператор!");
        }

    }
}
