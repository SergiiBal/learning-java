package learning.ostap.objects;

import java.util.Objects;

public class Bird {
    private String name;
    private int age = 0;
    private static int numberOfWings = 2;
    private String colour;
    private int wingspan = 2;

    public Bird(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    public Bird(String name, int age, int numberOfWings, String colour, int wingspan) {
        this.name = name;
        this.age = age;
        this.colour = colour;
        this.wingspan = wingspan;
        Bird.numberOfWings = numberOfWings;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static int getNumberOfWings() {
        return numberOfWings;
    }

    public String getColour() {
        return colour;
    }

    public  int getWingspan() {
        return wingspan;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void setNumberOfWings(int numberOfWings) {
        Bird.numberOfWings = numberOfWings;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", number of winds=" + numberOfWings +
                ", colour='" + colour + '\'' +
                ", wingspan=" + wingspan +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bird bird = (Bird) o;
        return age == bird.age && wingspan == bird.wingspan && name.equals(bird.name) && colour.equals(bird.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, colour, wingspan);
    }
}
