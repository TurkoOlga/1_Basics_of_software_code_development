package task11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите значение");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();

        double result;
        if (x <= 3) {
            result = Math.pow(x, 2) - 3 * x + 9;
        } else {
            result = 1 / (Math.pow(x, 3) + 6);
        }
        System.out.println("Значение функции равно " + result);
    }
}
