package task3;
/*
 Вычислить значение выражения по формуле (все переменные принимают действительные значения):
(𝑠𝑖𝑛 𝑥 + 𝑐𝑜𝑠 𝑦)/(𝑐𝑜𝑠 𝑥 − 𝑠𝑖𝑛 𝑦) ∗ 𝑡𝑔 𝑥y
 */

public class Main {
    public static void main(String[] args) {
        double x = 15;
        double y = -30;

        double result = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
        System.out.println(result);
    }
}
