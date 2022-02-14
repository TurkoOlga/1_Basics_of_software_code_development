package task9;
/*
Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите координаты трех точек");
        Scanner scanner = new Scanner(System.in);
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        double vektorA = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        double vektorB = Math.sqrt(Math.pow((x2 - x3), 2) + Math.pow((y2 - y3), 2));
        double vektorC = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));
        double halfPerimeter = (vektorA + vektorB + vektorC) / 2;

        double triangleSqr = Math.sqrt(
                halfPerimeter * (halfPerimeter - vektorA) * (halfPerimeter - vektorB) * (halfPerimeter - vektorC));

        System.out.println(triangleSqr == 0 ? "Точки лежат на одной прямой" : "Точки не лежат на одной прямой");
    }
}
