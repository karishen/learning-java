package lv.acodemy.classroom;

public class PlayWithString {
    public static void main(String[] args) {

        String name = "Karina";
        String surname = "Startseva";

        //My name is : Karina Startseva

        String myText = "My name is: " + name + " " + surname;
        System.out.println(myText);

        System.out.println("My name is: " + name + " " + surname);


        //Interpolation
        // %s - for text
        // %d - for numbers

        String interpolation = String.format("My name is: %s %s", name, surname);
        System.out.println(interpolation);
        System.out.println(String.format("My name is: %s %s", name, surname));


        String firstName = "Karina";
        String lastName = "Startseva";
        String myName = "My name is: " + firstName + " " + lastName;
        System.out.println(myName);

        int age = 33;
        String city = "Riga";
        System.out.println(firstName + " " + lastName + " is " + age + " years old and lives in " + city);
        System.out.println(String.format("%s %s is %d years old and lives in %s", firstName, lastName, age, city));
    }
}
