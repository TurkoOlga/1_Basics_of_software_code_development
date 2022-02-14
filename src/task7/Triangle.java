package task7;
/*
1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
он прямоугольным.
 */

public class Triangle {
    public static void main(String[] args) {
        int first = 30;
        int second = 500;
        int third = 180 - first - second;

        if (third > 0) {
            System.out.println("Треугольник существует");
            if (first == 90 || second == 90 || third == 90) {
                System.out.println("Трегольник является прямоугольным");
            }
        } else {
            System.out.println("Треугольника не существует");
        }
    }
}
