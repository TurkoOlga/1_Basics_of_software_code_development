package task2;
/*
Вычислить значение выражения по формуле (все переменные принимают действительные значения):
(𝑏 + √𝑏2 + 4𝑎𝑐)/2𝑎 − 𝑎𝑐 + 𝑏−2
 */



public class Main {
    public static void main(String[] args) {
        double a = 5;
        double b = 10;
        double c = -5;

        double result = (b + Math.sqrt(Math.pow(b, 2) + (4 * a * c))) / (2 * a) - Math.pow(a, 3) + Math.pow(c, -2);
        System.out.println(result);
    }
}
