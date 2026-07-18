package TwoWeekDay2;

public class SecondMaxFinder {
    public static void main(String[] args) {
        // Поиск второго по величине значения
        int[] votes = {12, 35, 6, 37, 0};

        int max = Integer.MIN_VALUE;
        int secondVax = Integer.MIN_VALUE;

        for (int current : votes) {
            if (current > max) {
                secondVax = max;
                max = current;
            } else if (current > secondVax && current < max) {
                secondVax = current;
            }
        }
        if (secondVax == Integer.MIN_VALUE) {
            System.out.println("Второго по величине значения нет");
        } else {
            System.out.println("Второе по велечине значение: " + secondVax);
            System.out.println("Самый большой элемент: " +  max);
        }
    }
}
