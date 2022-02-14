package task10;
/*
. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
отверстие.

 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размеры кирпича");
        int brickSideX = scanner.nextInt();
        int brickSideY = scanner.nextInt();
        int brickSideZ = scanner.nextInt();

        System.out.println("Введите размеры отверстия");
        int sideA = scanner.nextInt();
        int sideB = scanner.nextInt();

        int sqrHole = sideA * sideB;

        boolean res = (sqrHole == brickSideX * brickSideY) || (sqrHole == brickSideX * brickSideZ)
                || (sqrHole == brickSideY * brickSideZ);

        System.out.println(res ? "Кирпич проходит" : "Кирпич не проходит");
    }
}
