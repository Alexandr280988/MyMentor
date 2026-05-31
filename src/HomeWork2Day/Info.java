package HomeWork2Day;
import java.util.Scanner;

public class Info {
    static void main() {

        generalInfo info = new generalInfo();
        info.printInfo("Tom", 30);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите Ваше имя:");
//        String name = sc.nextLine();
//        System.out.println("Введите Ваш возраст:");
//        int age = sc.nextInt();
//        System.out.println("Вас зовут: " + name + "\n" + "Вам: " + age + " лет.");
    }
}

class generalInfo {
    String name;
    int age;

    void printInfo(String name, int age) {
        System.out.println("Вас зовут: " + name + "\n" + "Вам: " + age + " лет.");
    }
}