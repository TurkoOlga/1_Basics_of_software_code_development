package task8;

/*
Найти max{min(a, b), min(c, d)}.
 */

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int minAorB = Math.min(a, b);
        int minCorD = Math.min(c, d);
        int result = Math.max(minAorB, minCorD);

        System.out.println(result);
    }
}
