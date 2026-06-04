package HomeWork2Day;
import java.util.Scanner;

public class YourAge {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите Ваш возраст:");
        int age = sc.nextInt();
        AgeInfo info = new AgeInfo();
        info.ageForYears(age);
    }
}

class AgeInfo {
    void ageForYears(int age) {
        System.out.println("Через год, Вам будет: " + ++age + " лет.");
    }
}