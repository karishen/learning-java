package lv.acodemy.classroom;

public class PlayWithStatements {
    public static void main(String[] args) {


        //if (if-else)
        //Exercise: if A > 5 =>
        int a = 10;
        if (a > 5) {
            System.out.println("This is true!");
        }

        //Exercise 2: Write program that will check if variable y is even

        int y = 8;
        if (y % 2 == 0) {
            System.out.println("y is even number");
        }

        //Exercise 3: Write program that will check if number is equal to 50

        int b = 50;
        if (b == 50) {
            System.out.println("b is equal to 50");
        }

        //>, <, <=, =>, ==, != (comparison operators)

        if (b != y) {
            System.out.println("b is not equal to y");
        }

        //Boolean

        boolean isSummer = true;
        if (isSummer) {
            System.out.println("It's time to go on vacation");
        }

        // ======== IF-ELSE ==========

        int z = 10;

        if (z >= 0) {
            System.out.println("Z is positive number");
        } else {
            System.out.println("Z is negative number");
        }

        //Exercise 5:

        String name = "Janis";
        if (name.equals("Janis")) {
            System.out.println("Variables contains name Janis!");
        } else {
            System.out.println("Variable contains name: " + name);
        }

        // ====IF-ELSE-IF-ELSE====

        //Exercise 6: Write program that will check if variable > 10, check if variable = 10

        int e = 12;
        if (e > 10) {
            System.out.println("Variable is more than 10");
        } else if (e == 10) {
            System.out.println("Variable is equal to 10");
        } else {
            System.out.println("Variable is less than 10");
        }

        //Exercise 7: Create array with numbers

        int[] numbers = {10, -5, 0, 25, -30, 15, -10, 5, -20};

        for (int number : numbers) {
            if (number > 0) {
                System.out.printf("Number %d is positive number\n", number);
            } else if (number < 0) {
                System.out.printf("Number %d is negative number\n", number);
            } else {
                System.out.printf("Number %d is equal to 0\n", number);
            }
        }

        //Exercise 8: Excellent (90-100)/ Good (75-89)/OK (50-74)/ NOK (0-49)

        int[] grades = {95, 82, 74, 56, 48, 91, 87, 66, 77, 45};

        for (int grade : grades) {
            if (grade >= 90 && grade <= 100) {
                System.out.printf("Grade %d is Excellent \n", grade);
            } else if (grade >= 75 && grade < 90) {
                System.out.printf("Grade %d is Good \n", grade);
            } else if (grade >= 50 && grade < 75) {
                System.out.printf("Grade %d is OK \n", grade);
            } else if (grade >= 0 && grade < 50) {
                System.out.printf("Grade %d is NOK \n", grade);
            }
        }

        //Exercise 9: Create temperature
        // < -10 (Cold)
        // from 0 to 10 (NOt cold)
        // from 10 to 20 (Warm)
        // from 20-30 (hot)
        //> 30 ( Very Hot)

        int[] temp = {-14, 5, 12, -8, 19, 25, 40, 33};

        for (int temperature : temp) {
            if (temperature <= -10) {
                System.out.printf("Temperature %d is cold \n", temperature);
            } else if (temperature >= 0 && temperature < 10) {
                System.out.printf("Temperature %d is not cold \n", temperature);
            } else if (temperature >= 10 && temperature < 20) {
                System.out.printf("Temperature %d is warm \n", temperature);
            } else if (temperature >= 20 && temperature < 30) {
                System.out.printf("Temperature %d is hot \n", temperature);
            } else if (temperature >= 30) {
                System.out.printf("Temperature %d is very hot \n", temperature);
            }

        }
    }
}

