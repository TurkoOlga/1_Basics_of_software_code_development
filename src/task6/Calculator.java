package task6;
/*
Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
принадлежит закрашенной области, и false — в противном случае:
 */

public class Calculator {
    public static void main(String[] args) {
        double x = 2;
        double y = 0;

        if ((x >= -2 && x <= 2) && (y >= 0 && y <= 4)) {
            System.out.println(true);
        } else if ((x >= -4 && x <= 4) && (y >= -3 && y <= 4)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
