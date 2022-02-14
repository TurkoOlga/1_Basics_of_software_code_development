package task4;
/*
Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
дробную и целую части числа и вывести полученное значение числа.
 */


public class Main {
    public static void main(String[] args) {
        double number = 567.945;
        int first = (int) number;
        int second = (int) ((number - first) * 1000);
        number = second + first * 0.001;

        System.out.println(number);
    }
}
