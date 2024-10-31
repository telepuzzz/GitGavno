import java.util.Scanner;

public class RomanCalc2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение чисел");
        System.out.println(calc(scanner.nextLine()));
    }

    public static String calc(String input) {
        String[] splitInput = input.split("");
        String a = splitInput[0];
        String b = splitInput[2];
        if(splitInput[0] == String.valueOf(1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10)) {
            return String.valueOf(a);
        } else {
            switch (String.valueOf(a)) {
                case "I":
                    a = String.valueOf(1);
                    break;
                case "II":
                    a = String.valueOf(2);
                    break;
                case "III":
                    a = String.valueOf(3);
                    break;
                case "IV":
                    a = String.valueOf(4);
                    break;
                case "V":
                    a = String.valueOf(5);
                    break;
                case "VI":
                    a = String.valueOf(6);
                    break;
                case "VII":
                    a = String.valueOf(7);
                    break;
                case "VIII":
                    a = String.valueOf(8);
                    break;
                case "IX":
                    a = String.valueOf(9);
                    break;
                case "X":
                    a = String.valueOf(10);
                    break;
                default:
                    System.out.println("Вы ввели недопустимое число");
            }
        }
        if(splitInput[2] == String.valueOf(1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10)) {
            return String.valueOf(b);
        } else {
            switch (String.valueOf(b)) {
                case "I":
                    b = String.valueOf(1);
                    break;
                case "II":
                    b = String.valueOf(2);
                    break;
                case "III":
                    b = String.valueOf(3);
                    break;
                case "IV":
                    b = String.valueOf(4);
                    break;
                case "V":
                    b = String.valueOf(5);
                    break;
                case "VI":
                    b = String.valueOf(6);
                    break;
                case "VII":
                    b = String.valueOf(7);
                    break;
                case "VIII":
                    b = String.valueOf(8);
                    break;
                case "IX":
                    b = String.valueOf(9);
                    break;
                case "X":
                    b = String.valueOf(10);
                    break;
            }
        }
        String operation = splitInput[1];
        int c = 0;

        switch (operation) {
            case "+":
                c = Integer.parseInt(a) + Integer.parseInt(b);
                break;
            case "-":
                c = Integer.parseInt(a) - Integer.parseInt(b);
                break;
            case "*":
                c = Integer.parseInt(a) * Integer.parseInt(b);
                break;
            case "/":
                c = Integer.parseInt(a) / Integer.parseInt(b);
                break;
            default:
                System.out.println("Совсем Неверный оператор");
        }
        return String.valueOf(c);
    }
}

