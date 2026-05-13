public class Cycles {
    static void main() {

        int n = 10;
//        for (int i = 0; i < n; i++) {
//            System.out.println(i);
//        }
//        int sum = 0;
//        for (int i = 0; i < n; i++) {
//            sum += i;
//        }
//        System.out.println(sum);

//        for (int i = 0; i < n; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }
        int multip = 2;
        for (int i = 0; i < n; i++) {
            int result = multip * i;
            System.out.println(result);
        }
        // Посмотрел в интернете, но пока не было инфы по Math
        long number = 54321; // Исходное число
        long temp = Math.abs(number); // Защита от отрицательных чисел
        int count = 0;

        // Обработка частного случая, если число изначально равно 0
        if (temp == 0) {
            count = 1;
        }

        while (temp > 0) {
            temp = temp / 10; // Отсекаем последнюю цифру
            count++;          // Увеличиваем счетчик
        }

        System.out.println("Количество цифр: " + count);
    }
}


