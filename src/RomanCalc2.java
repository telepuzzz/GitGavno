import java.util.Scanner;

public class RomanCalc2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите римское или арабское выражение чисел от 1 до 10");
        System.out.println(calc(scanner.nextLine()));
    }

    public static Object calc(String input) {
        String[] splitInput = input.split(" ");
        String arab = "1,2,3,4,5,6,7,8,9,10";
        String roman = "I,II,III,IV,V,VI,VII,VIII,IX,X";
        if (arab.contains(splitInput[0]) & arab.contains(splitInput[2])) {
            splitInput[0] = String.valueOf(Integer.parseInt(splitInput[0]));
            splitInput[2] = String.valueOf(Integer.parseInt(splitInput[2]));
        } else if (roman.contains(splitInput[0]) & roman.contains(splitInput[2])) {
            splitInput[0] = String.valueOf(splitInput[0]);
            splitInput[2] = String.valueOf(splitInput[2]);
        } else {
            return ("Вы ввели неподходящее число/числа");
        }
        int a = 0;
        int b = 0;
        if ((splitInput[0].equals(String.valueOf(1))) || (splitInput[0].equals(String.valueOf(2))) || (splitInput[0].equals(String.valueOf(3))) || (splitInput[0].equals(String.valueOf(4))) || (splitInput[0].equals(String.valueOf(5))) || (splitInput[0].equals(String.valueOf(6))) || (splitInput[0].equals(String.valueOf(7))) || (splitInput[0].equals(String.valueOf(8))) || (splitInput[0].equals(String.valueOf(9))) || (splitInput[0].equals(String.valueOf(10)))) {
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

        if ((splitInput[2].equals(String.valueOf(1))) || (splitInput[2].equals(String.valueOf(2))) || (splitInput[2].equals(String.valueOf(3))) || (splitInput[2].equals(String.valueOf(4))) || (splitInput[2].equals(String.valueOf(5))) || (splitInput[2].equals(String.valueOf(6))) || (splitInput[2].equals(String.valueOf(7))) || (splitInput[2].equals(String.valueOf(8))) || (splitInput[2].equals(String.valueOf(9))) || (splitInput[2].equals(String.valueOf(10)))) {
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

        if (arab.contains(splitInput[0]) & arab.contains(splitInput[2])) {
            return String.valueOf(Integer.parseInt(String.valueOf(c)));
        } else {
            try {
                return convertNumToRoman(c);
            } catch (Exception e) {
                System.out.println("Результат выражения римских чисел не может быть отрицательным");
                System.exit(0);
            }
        }

        return null;
    }

    private static String convertNumToRoman(int numArabian) {
        String[] roman = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
        };
        return roman[numArabian];
    }
}
