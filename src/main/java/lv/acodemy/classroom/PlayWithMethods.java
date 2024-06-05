package lv.acodemy.classroom;

public class PlayWithMethods {
    public static void main(String[] args) {

        greeting("Karina");

        var x = add(10, 20);
        System.out.println(x);
        System.out.println(add(30, 40));

        System.out.println(isEven(10));
        System.out.println(isEven(11));
        System.out.println(isEven(100));
        System.out.println(isEven(500));


    }

    public static void greeting(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int findMax(int numberOne, int numberTwo) {
        return Math.max(numberOne, numberTwo);
    }

}

