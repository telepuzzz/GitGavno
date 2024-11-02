import java.util.Scanner;

public class RomanCalc2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение чисел");
        System.out.println(calc(scanner.nextLine()));
    }

    public static String calc(String input) {
        String[] splitInput = input.split(" ");
        int a = 0;
        int b = 0;

        String roman = new String("I,II,III,IV,V,VI,VII,VIII,IX,X");
        String[] romanian = roman.split(",");
        if (splitInput[0] == romanian[0] || splitInput[0] == romanian[1] || splitInput[0] == romanian[2] || splitInput[0] == romanian[3] || splitInput[0] == romanian[4] || splitInput[0] == romanian[5] || splitInput[0] == romanian[6] || splitInput[0] == romanian[7] || splitInput[0] == romanian[8] || splitInput[0] == romanian[9] ) {
            switch (splitInput[0]) {
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
        } else {
            a = Integer.parseInt(String.valueOf(splitInput[0]));
        }

            if (splitInput[2] == romanian[0] || splitInput[2] == romanian[1] || splitInput[2] == romanian[3] || splitInput[2] == romanian[4] || splitInput[2] == romanian[5] || splitInput[2] == romanian[6] || splitInput[2] == romanian[7] || splitInput[2] == romanian[8] || splitInput[2] == romanian[9] ) {
                switch (splitInput[2]) {
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
            } else {
                b = Integer.parseInt(String.valueOf(splitInput[2]));
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
                    System.out.println("Совсем Неверный оператор");
            }
            int c = result;
            return String.valueOf(Integer.parseInt(String.valueOf(c)));
        }
    }