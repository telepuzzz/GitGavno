import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions1 {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Обработка исключения в методе main");
        }
        //    try {
        //      ;

        //        System.out.println("После scanner");
        //    } catch (FileNotFoundException e) {
        //        System.out.println("Файл не найден");
        //    }

        //     System.out.println("После блока try catch");
        // }
    }
    public static void readFile() throws FileNotFoundException {
            File file = new File("testttt");
            Scanner scanner = new Scanner(file);
    }
}
