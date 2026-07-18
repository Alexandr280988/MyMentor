package WeekTwo.TwoWeekDay1;

public class Arrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        // Первый вариант вывода массива:
        for (int i : arr) {
            System.out.println(i);
        }
        // Второй вариант вывода массива:
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        // Находим сумму нашего массива:
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);


        // Находим среднее значение чисел массива
        int average = 0;
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            s += arr[i];
            average = s / arr.length;
        }
        System.out.println(average);
        // но тут как то можно думаю в одно действие сделать , пробовал
        // не получилось

        // Выводим MAX и MIN
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
        // Вывод чисел в обратном порядке
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

    }
}
