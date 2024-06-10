package lv.acodemy.classroom;

public class Main2 {
    public static void main(String[] args) {
        Cat myLovelyCat = new Cat();
        System.out.println(myLovelyCat);

        myLovelyCat.setCatBreed("Siamese");
        myLovelyCat.setFur("Short-haired");
        myLovelyCat.setColor("Brown");
        myLovelyCat.setHowOld(7);
        System.out.println(myLovelyCat);


        myLovelyCat.sleep();
    }


}
