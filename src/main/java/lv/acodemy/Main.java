package lv.acodemy;

import lv.acodemy.classroom.Car;

public class Main {
    public static void main(String[] args) {

        //How to create Objects?

        Car myFirstCar = new Car();
        System.out.println(myFirstCar);

        //Set carBrand

        myFirstCar.setCarBrand("Volvo");
        System.out.println(myFirstCar);

        //Set all other fields

        myFirstCar.setModel("XC70");
        myFirstCar.setProductionYear(2023);
        myFirstCar.setMileage(100);
        myFirstCar.setColor("Red");
        System.out.println(myFirstCar);


        //Create a new object;

        Car mySecondCar = new Car();
        mySecondCar.setCarBrand("Mercedes");
        mySecondCar.setModel("GL");
        mySecondCar.setProductionYear(2024);
        mySecondCar.setMileage(10);
        mySecondCar.setColor("Green");
        System.out.println(mySecondCar);

        Car myBmwCar = new Car("BMW", "X5", 2020, 130_000, "black");
        System.out.println(myBmwCar);

        Car mySkoda = new Car.CarBuilder().setCarBrand("Skoda").setModel("Yeti").setProductionYear(2000).setMileage(50_000).setColor("Blue").build();
        mySkoda.start();
        mySkoda.drive(1_000);
        mySkoda.drive(2_500);

    }

}