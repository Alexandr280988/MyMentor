package WeekTwo.TwoWeekDay1.TwoWeekDay2;

public class TemperatureAnalysis {
    public static void main(String[] args) {
        // Исходный массив температур
        int[] temperatures = {12, -3, 5, 0, -8, 10, -1, 4};

        // 1. Инициализация переменных перед циклом
        double sum = 0;          // Накопитель для суммы (double, чтобы избежать потери точности при делении)
        int coldDaysCount = 0;   // Счетчик морозных дней

        // 2. Один проход по массиву (цикл for-each)
        for (int temp : temperatures) {
            sum += temp;         // Накапливаем сумму всех температур

            if (temp < 0) {
                coldDaysCount++; // Увеличиваем счетчик, если температура ниже нуля
            }
        }

        // 3. Расчет среднего значения после цикла
        double averageTemperature = sum / temperatures.length;

        // Вывод результатов в консоль
        System.out.println("Средняя температура: " + averageTemperature);
        System.out.println("Количество дней с температурой ниже нуля: " + coldDaysCount);
    }
}