import java.util.Scanner;

public class RomanCalc2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите римское или арабское выражение чисел от 1 до 10");
        System.out.println(calc(scanner.nextLine()));
    }

    public static String calc(String input) {
        String[] splitInput = input.split(" ");
        int a = 0;
        int b = 0;
        if (splitInput[0].equals(String.valueOf(1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10))) {
            a = Integer.parseInt(splitInput[0]);
        } else {
            switch (String.valueOf(splitInput[0])) {
                case "I":
                    a = 1;
                    break;
                case "II":
                    a = 2;
                    break;
                case "III":
                    a = 3;
                    break;
                case "IV":
                    a = 4;
                    break;
                case "V":
                    a = 5;
                    break;
                case "VI":
                    a = 6;
                    break;
                case "VII":
                    a = 7;
                    break;
                case "VIII":
                    a = 8;
                    break;
                case "IX":
                    a = 9;
                    break;
                case "X":
                    a = 10;
                    break;
            }
        }

        if (splitInput[2].equals(String.valueOf(1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10))) {
            b = Integer.parseInt(splitInput[2]);
        } else {
            switch (String.valueOf(splitInput[2])) {
                case "I":
                    b = 1;
                    break;
                case "II":
                    b = 2;
                    break;
                case "III":
                    b = 3;
                    break;
                case "IV":
                    b = 4;
                    break;
                case "V":
                    b = 5;
                    break;
                case "VI":
                    b = 6;
                    break;
                case "VII":
                    b = 7;
                    break;
                case "VIII":
                    b = 8;
                    break;
                case "IX":
                    b = 9;
                    break;
                case "X":
                    b = 10;
                    break;
            }
        }
        String operation = splitInput[1];
        int result = 0;
        switch (operation) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            default:
                System.out.println("Введён неверный оператор");
        }
        int c = result;
        return String.valueOf(Integer.parseInt(String.valueOf(c)));
    }
}
