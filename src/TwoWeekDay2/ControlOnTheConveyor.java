package TwoWeekDay2;

public class ControlOnTheConveyor {
    public static void main(String[] args) {
        int[] weights = {75, 45, 120, 0, 80, 95, 30, 100};
        // идеальный вес детали от 50 до 100гр
        int min = 50;
        int max = 100;
        int sumDefectivePart = 0;
        int count = 0;
        boolean hasZeroWeight  = false; // считаем что пустого места нет

        // проходим циклом for по нашему массиву и прописываем условия
        for (int def : weights) {
            if (def < min || def > max) {
                sumDefectivePart += def;
            } else if (def >= min || def <= max) {
                count++;
            }
            if (def == 0) {
                hasZeroWeight = true;
            }
        }

        System.out.println("Сумма бракованных деталей в граммах: " + sumDefectivePart);
        System.out.println("Колличество идеальных деталей: " + count);
        System.out.println("Пустое место на конвейере: " + hasZeroWeight);
    }
}
