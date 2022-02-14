package task5;


/*
5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
данное значение длительности в часах, минутах и секундах в следующей форме:
ННч ММмин SSc.
 */
public class Main {
    public static void main(String[] args) {
        long primaryTimeInSec = 10000;

        long hour = primaryTimeInSec / 3600;
        long min = (primaryTimeInSec % 3600) / 60;
        long sec = primaryTimeInSec % 60;

        System.out.println(hour + " hours " + min + " minutes " + sec + " seconds");
    }
}
