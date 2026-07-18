package WeekTwo.TwoWeekDay1;

public class HWweek2day1 {
    public static void main(String[] args) {

        int[] arr = {0, 5, -1, 8, 4, -2};
        //Сумма чисел массива
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
        // Колличество четных чисел в массиве
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
        // Колличество положительных чисел в массиве
        int positiveCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positiveCount++;
            }
        }
        System.out.println(positiveCount);
        // Поиск минимального числа массива
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
        // Вывод в обратном порядке
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
