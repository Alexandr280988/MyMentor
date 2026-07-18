package TwoWeekDay3;

public class StringPractice {
    public static void main(String[] args) {
        //Избавляемся от пробелов
        String text = "  Java 2026!  ";
        String cleanText = text.strip();
        System.out.println(cleanText);

        // длина строки
        System.out.println(cleanText.length());

        // первый и последний символ
        char start = cleanText.charAt(0);
        char end = cleanText.charAt(cleanText.length() - 1);
        System.out.println(start);
        System.out.println(end);

        // начинается ли строка с буквы
        boolean startWithLetter = Character.isLetter(cleanText.charAt(0));
        System.out.println(startWithLetter);

        // подсчет пробелов
        int spaceCount = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        System.out.println(spaceCount);

        //Вывод инициалов
        String fullName = "Иван Иванов";
        int spaceIndex = fullName.indexOf(" ");
        char firstName = fullName.charAt(0);
        char lastName = fullName.charAt(spaceIndex + 1);
        System.out.println("Инициалы: " + firstName + " " + lastName);
    }
}
