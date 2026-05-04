package HomeWork2Day;
import java.util.Scanner;

public class MinutesInHours {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите колличество минут:");
        int minutes = sc.nextInt();
        int hours = minutes / 60;
        int minutesOst = minutes % 60;
//        System.out.println(hours + " : " + minutesOst);
        System.out.format("%02d:%02d", hours, minutesOst);
    }
}
