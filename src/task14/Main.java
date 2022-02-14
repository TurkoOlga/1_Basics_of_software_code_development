package task14;

/*
Найти сумму квадратов первых ста чисел
 */

public class Main {
    public static void main(String[] args) {
        int summ = 0;

        for (int number = 1; number <= 100; number++) {
            summ += number * number;
        }
        System.out.println("Сумма квадратов первых ста чисел равна " + summ);
    }
}
