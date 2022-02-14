package task13;

public class Main {
    public static void main(String[] args) {
        int a = -8;
        int b = 18;
        int h = 2;
        int y;

        for (int x = a; x <= b; x += h) {
            if (x > 2) {
                y = x;
            } else {
                y = - x;
            }
            System.out.println("При х = " + x + " у = " + y);
        }
    }
}
