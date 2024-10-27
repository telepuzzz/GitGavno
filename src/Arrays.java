public class Arrays {
    public static void main(String[] args) {
        int number = 10;   //  [10]
        int[] numbers = new int[5];     // numbers  -->  [массив]   ссылочный тип данных
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        int[] numbers1 = {1,2,3};
        for(int i = 0; i < numbers1.length; i++){
            System.out.println(numbers1[i]);
        }
    }
}








//     numbers[0] = 10;


// int number = 10; // примитивный тип данных
// char character = 'a'; //примитивный тип данных
// String s = "Hello";
// String s1 = new String("Hello");  // s = s1 умпрощение работает только со String