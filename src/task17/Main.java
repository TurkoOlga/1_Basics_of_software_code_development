package task17;
/*
Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
заданному е. Общий член ряда имеет вид:

 */

public class Main {
    public static void main(String[] args) {
        double eConstant = 0;
        double sum = 0;

        double a;
        for (int n = 0; n < 10; n++) {
            a = 1 / Math.pow(2, n) + 1 / Math.pow(3, n);
            if (Math.abs(a) >= eConstant) {
                sum += a;
            }
        }
        System.out.println(sum);
    }
}
