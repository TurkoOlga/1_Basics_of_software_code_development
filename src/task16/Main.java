package task16;
/*
Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.

 */

public class Main {
    public static void main(String[] args) {
        char symbol;
        for (int i = 0; i < 1112064 ; i++) {
            symbol = (char) i;
            System.out.println("Символ " + i + " соответствует " + symbol);
        }
    }
}
