import java.io.Serializable;
import java.util.Scanner;

public class RomanCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение чисел");
        System.out.println(calc(scanner.nextLine()));
    }

    public static String calc(String input) {
        String[] splitInput = input.split("");
        int a = Integer.parseInt(splitInput[0]);
        int b = Integer.parseInt(splitInput[2]);
        String operation = splitInput[1];
        int c = 0;
        switch (operation) {
            case "+":
                c = a + b;
                break;
            case "-":
                c = a - b;
                break;
            case "*":
                c = a * b;
                break;
            case "/":
                c = a / b;
                break;
            default:
                System.out.println("Неверный оператор");
        }
        return String.valueOf(c);
        }
    }

    enum Roman {
        I("I", 1), II("II", 2), III("III", 3), IV("IV", 4), V("V", 5), VI("VI", 6), VII("VII", 7), VIII("VIII", 8), IX("IX", 9), X("X", 10);
        private final int value;
        private String key;

        Roman(String key, int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public String getKey() {
            return key;
        }

        static Serializable toInt(String key) {
            for (Roman i : Roman.values()) {
                if (i.getKey().equals(key))
                    return i.getValue();

                return " ";
            }
            return null;
        }
    }


