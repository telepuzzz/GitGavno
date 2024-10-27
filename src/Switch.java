import java.util.Scanner;

public class  Switch {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи возраст");
        String age = scanner.nextLine();
    //    int age = scanner.nextInt();
        switch(age){
            case "ноль" :
                System.out.println("Ты родился");
                break;
            case "семь" :
                System.out.println("ты пошел в школу");
                break;
            case "восемнадцать" :
                System.out.println("Ты закончил школу");
                break;
                //default:
                //System.out.println("ни одно из предыдущих условий не подошло");
        }
    }
}

//switch(operation){
//        case '+' : result = a + b;
//        break;
//        case '-' : result = a - b;
 //       break;
  //      case '*' : result = a * b;
 //       break;
  ///      case '/' : result = a / b;
  //      break;
//default:
  //      System.out.println("Введен неверный оператор");
  //      return;
   //     }