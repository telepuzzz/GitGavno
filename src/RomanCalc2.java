import java.util.Scanner;

public class RomanCalc2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение чисел");
        System.out.println(calc(scanner.nextLine()));
    }

    public static String calc(String input) {
        String[] splitInput = input.split("");
        int a = 0;
        int b = 0;
        if(splitInput.equals(String.valueOf(1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10))) {
            a = Integer.parseInt(splitInput[0]);
        } else {
            switch (String.valueOf(a)) {
                case "I":
                    a = Integer.parseInt(String.valueOf(1));
                    break;
                case "II":
                    a = Integer.parseInt(String.valueOf(2));
                    break;
                case "III":
                    a = Integer.parseInt(String.valueOf(3));
                    break;
                case "IV":
                    a = Integer.parseInt(String.valueOf(4));
                    break;
                case "V":
                    a = Integer.parseInt(String.valueOf(5));
                    break;
                case "VI":
                    a = Integer.parseInt(String.valueOf(6));
                    break;
                case "VII":
                    a = Integer.parseInt(String.valueOf(7));
                    break;
                case "VIII":
                    a = Integer.parseInt(String.valueOf(8));
                    break;
                case "IX":
                    a = Integer.parseInt(String.valueOf(9));
                    break;
                case "X":
                    a = Integer.parseInt(String.valueOf(10));
                    break;
                default:
                    System.out.println("Вы ввели недопустимое число");
            }
        }
        if(splitInput[2].equals(String.valueOf(1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10))) {
            b = Integer.parseInt(splitInput[2]);
        } else {
            switch (String.valueOf(b)) {
                case "I":
                    b = Integer.parseInt(String.valueOf(1));
                    break;
                case "II":
                    b = Integer.parseInt(String.valueOf(2));
                    break;
                case "III":
                    b = Integer.parseInt(String.valueOf(3));
                    break;
                case "IV":
                    b = Integer.parseInt(String.valueOf(4));
                    break;
                case "V":
                    b = Integer.parseInt(String.valueOf(5));
                    break;
                case "VI":
                    b = Integer.parseInt(String.valueOf(6));
                    break;
                case "VII":
                    b = Integer.parseInt(String.valueOf(7));
                    break;
                case "VIII":
                    b = Integer.parseInt(String.valueOf(8));
                    break;
                case "IX":
                    b = Integer.parseInt(String.valueOf(9));
                    break;
                case "X":
                    b = Integer.parseInt(String.valueOf(10));
                    break;
            }
        }
        String operation = splitInput[1];
        int c = 0;

        switch (operation) {
            case "+":
                c = Integer.parseInt(String.valueOf(a)) + Integer.parseInt(String.valueOf(b));
                break;
            case "-":
                c = Integer.parseInt(String.valueOf(a)) - Integer.parseInt(String.valueOf(b));
                break;
            case "*":
                c = Integer.parseInt(String.valueOf(a)) * Integer.parseInt(String.valueOf(b));
                break;
            case "/":
                c = Integer.parseInt(String.valueOf(a)) / Integer.parseInt(String.valueOf(b));
                break;
            default:
                System.out.println("Совсем Неверный оператор");
        }
        return String.valueOf(c);
    }
}

