package TwoWeekDay2;

public class GrowingArray {
    public static void main(String[] args) {
        // Возрастающий массив.
        int[] steps = {2, 5, 7, 9, 0};
        boolean grow = true;
        for (int i = 1; i < steps.length; i++) {
            if (steps[i] <= steps[i - 1]) {
                grow = false;
                break;
            }
        }
        System.out.println("Массив строго возрастающий? " + grow);
    }
}
