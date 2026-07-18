package WeekTwo.TwoWeekDay1.TwoWeekDay2;

public class LineSearch {
    public static void main(String[] args) {
        // Поиск минимального числа
        int[] balances = {0, 1, 6, -1, 9};

        int min = balances[0];
        for (int i = 1; i < balances.length; i++) {
            if (balances[i] < min) {
                min = balances[i];
            }
        }
        System.out.println("Минимальное число: " + min);
    }
}
