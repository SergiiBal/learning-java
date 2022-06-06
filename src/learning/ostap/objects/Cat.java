package learning.ostap.objects;

public class Cat {
    private String name;
    private  int age = 0;
    private static int palmsAmount = 4;
    private  String colour = "indefinite";

    public Cat (String name) {
        this.name = name;
    }

    public  Cat (String name, int age) {
        this.name = name;
        this.age = age;
    }
    public  Cat (String name, int age, int palmsAmount, String colour) {
        this.name = name;
        this.age = age;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static int getPalmsAmount() {
        return palmsAmount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public static void setPalmsAmount(int palmsAmount) {
        Cat.palmsAmount = palmsAmount;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", colour='" + colour + '\'' +
                ", palms=" + palmsAmount +
                '}';
    }
}
