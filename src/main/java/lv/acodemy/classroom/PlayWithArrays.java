package lv.acodemy.classroom;

import java.util.Arrays;

public class PlayWithArrays {
    public static void main(String[] args) {


        //Arrays

        //Declaring Array

        int[] numbers;

        //Creating an Array
        numbers = new int[10];

        System.out.println(Arrays.toString(numbers));

        numbers[1] = 2;
        numbers[3] = 4;
        numbers[5] = 6;
        numbers[7] = 8;
        numbers[9] = 10;
        System.out.println(Arrays.toString(numbers));

        // Create int array with numbers

        int[] evenNumbers = {2, 4, 6, 8, 10, 12};

        String[] names = {"Karina", "Marina", "Arina"};
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

        String[] fruits = {"Orange", "Apple", "Plum", "Strawberry", "Watermelon"};
        System.out.println(fruits[0]);
        System.out.println(fruits[1]);
        System.out.println(fruits[2]);
        System.out.println(fruits[3]);
        System.out.println(fruits[4]);


    }
}
