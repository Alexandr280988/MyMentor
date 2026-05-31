package HomeWork2Day;

public class Year {
    static void main() {
//        int age = 37;
//        System.out.println("Через год, мне будет: " + ++age +

        AgeInfo info = new AgeInfo();
        info.ageForYears(35);
    }
}

class AgeInfo {
    int age = 37;

    void ageForYears(int age) {
        System.out.println("Через год, мне будет: " + ++age + " лет.");
    }
}