package task18;
/*
Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
m и n вводятся с клавиатуры.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два натуральных числа");
        int first = scanner.nextInt();
        int last = scanner.nextInt();

        if (first > last) {
            printDividersBetween(first, last);
        } else if (first < last) {
            printDividersBetween(last, first);
        } else {
            System.out.println("Введите два отличных друг от друга натуральных числа: ");
        }
    }


    private static void printDividersBetween(int larger, int fewer) {
        for (int i = fewer; i <= larger; i++) {
            System.out.println("Делители натурального числа " + i + " : ");
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    System.out.print(j+ ", ");
                }
            }
            System.out.println();
        }
    }
}
