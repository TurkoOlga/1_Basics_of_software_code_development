package task12;
/*
1. Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
все числа от 1 до введенного пользователем числа.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите целое положительное число");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        int result = 0;
        for (int number = 1; number <= x; number++) {
            result = result + number;
        }
        System.out.println("Сумма чисел равна " + result);
    }
}
