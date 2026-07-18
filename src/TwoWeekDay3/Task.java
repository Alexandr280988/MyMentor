package TwoWeekDay3;

public class Task {
    public static void main(String[] args) {
        // Длина и символы
        String str = "Hello world";
        System.out.println(str.length()); // длина str
        System.out.println(str.charAt(0)); // первый символ
        System.out.println(str.charAt(str.length() - 1)); // последний символ

        // Регистр
        char firstChar = str.charAt(0);
        if (firstChar == 'H') {
            String result = str.toUpperCase();
            System.out.println(result);
        } else {
            String result = str.toLowerCase();
            System.out.println(result);
        }

        // палиндром
        String palindrom = "довод";
        char start = palindrom.charAt(0);
        char end = palindrom.charAt(palindrom.length() - 1);
        char twoStart = palindrom.charAt(1);
        char privEnd = palindrom.charAt(3);
        if (start == end && twoStart == privEnd) {
            System.out.println("Палиндром");
        } else {
            System.out.println("Слово не палиндром");
        }

        // Секретный код
        String code = "Телефон: +79991112233"; // вырезаем номер
        int spaceIndex = code.indexOf(" ");
        String secret = code.substring(spaceIndex + 1, code.length());
        System.out.println(secret);

        //сравнение паролей
        String pass1 = "Hello";
        String pass2 = "Hello";
        System.out.println(pass1.equals(pass2));

    }
}
