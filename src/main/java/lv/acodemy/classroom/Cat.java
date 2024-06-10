package lv.acodemy.classroom;

public class Cat {

    private String catBreed;
    private String fur;
    private int howOld;
    private String color;
    private boolean isSleeping = false;


    public void sleep() {
        if (!isSleeping) {
            isSleeping = true;
            System.out.println("Tha cat has sleep");
        } else {
            System.out.println("The cat is already z-z-zz-z");
        }
    }

    public String getCatBreed() {
        return catBreed;
    }

    public void setCatBreed(String catBreed) {
        this.catBreed = catBreed;
    }

    public String getFur() {
        return fur;
    }

    public void setFur(String fur) {
        this.fur = fur;
    }

    public int getHowOld() {
        return howOld;
    }

    public void setHowOld(int howOld) {
        this.howOld = howOld;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "catBreed='" + catBreed + '\'' +
                ", fur='" + fur + '\'' +
                ", howOld=" + howOld +
                ", color='" + color + '\'' +
                '}';


    }
}
