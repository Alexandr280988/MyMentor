package HomeWork5Day;

public class Methods {
    static void main() {

        NewMethod new1 = new NewMethod();
        new1.printCreeting();
        new1.maxOfTwo();
        System.out.println(new1.isEven());
        System.out.println(new1.sumRange(0, 3));
        new1.celsiusToFahrenheit(10);
    }
}

class NewMethod {

    void printCreeting() {
        System.out.println("Hello, words!");
    }

    int one = 3;
    int two = 5;

    void maxOfTwo() {
        if (one > two) {
            System.out.println(one);
        } else {
            System.out.println(two);
        }
    }

    int numEven = 3;

    boolean isEven() {
        if (numEven % 2 != 0) {
            return false;
        }
        return true;
    }

    int start = 0;
    int end = 10;

    int sumRange(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end ; i++) {
            sum += i;
        }
        return sum;
    }

    double celsius = 0;
    void celsiusToFahrenheit(double celsius) {
        System.out.println("Fahrenheit: " + (celsius + 32));
    }
}
