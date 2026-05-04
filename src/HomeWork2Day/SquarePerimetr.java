package HomeWork2Day;
import java.util.Scanner;

public class SquarePerimetr {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длинну: ");
        double lenght = sc.nextDouble();
        System.out.println("Введите ширину: ");
        double widht = sc.nextDouble();

        double square = lenght * widht;
        double perimetr = lenght * 2 + widht * 2;
        System.out.println("Площадь прямоугольника: " + square);
        System.out.println("Периметр прямоугольника: " + perimetr);
    }
}
