package HomeWork6Day;

import java.util.Scanner;

public class NumberInfo {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int n = sc.nextInt();
        InfoNumber info = new InfoNumber();
        info.infoNum(n);

//        info.isEven(n);
//        info.singNum(n);
//        System.out.println(info.getDigitCountsString(n));
//        info.sumNumber(n);
//        info.multipTable(n);
//        System.out.println(info.getFactorial(n));
    }
}

class InfoNumber {

    int n;

    void isEven(int n) {
        if (n % 2 != 0) {
            System.out.println("Число " + n + " не четное");
        } else {
            System.out.println("Число " + n + " четное");
        }
    }

    void singNum(int n) {
        if (n == 0) {
            System.out.println("Число " + n + " " + 0);
        } else if (n < 0) {
            System.out.println("Число " + n + " отрицательное");
        } else {
            System.out.println("Число " + n + " положительное");
        }
    }

    int getDigitCountsString(int n) {
        System.out.println("Колличество цифр введенного числа:");
        return String.valueOf(Math.abs(n)).length();
    }

    void sumNumber(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println("Сумма чисел от 1 до N = " + sum);
    }

    void multipTable(int n) {
        for (int i = 0; i < 11; i++) {
            int sum = n * i;
            System.out.println(n + " x " + i + " = " + sum);
//            System.out.printf("%d x %d = %d%n", n, i, n * i);
        }
    }

    int getFactorial(int n) {
        if (n < 0 || n > 12) {
            throw new IllegalStateException("Число не в диапозоне от 0 до 12");
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println("Факториал числа: ");
        return result;
    }

    void infoNum(int n) {
        isEven(n);
        singNum(n);
        System.out.println(getDigitCountsString(n));

        sumNumber(n);
        System.out.println("Таблица умноженичя числа: ");
        multipTable(n);
        System.out.println();
        System.out.println("Факториал если число в диапозоне от 0 до 12");
        System.out.println(getFactorial(n));
    }
}