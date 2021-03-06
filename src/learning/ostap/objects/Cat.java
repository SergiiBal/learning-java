package learning.ostap.objects;


import java.util.Objects;

public class Cat extends Animal {
    private static int palmsAmount = 4;
    private CatColor color = CatColor.UNKNOWN;

    public Cat(String name, int age, int palmsAmount, String color) {
        super(name, age);
        this.color = CatColor.valueOf(color.toUpperCase());
        Cat.palmsAmount = palmsAmount;
    }

    public Cat(String name, int age) {
        super(name, age, CatColor.UNKNOWN.name());
    }

    public Cat(String name) {
        super(name, 0, CatColor.UNKNOWN.name());
    }

    public static int getPalmsAmount() {
        return palmsAmount;
    }

    public void setColor(CatColor color) {
        this.color = color;
    }

    public static void setPalmsAmount(int palmsAmount) {
        Cat.palmsAmount = palmsAmount;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", colour='" + color + '\'' +
                ", palms=" + palmsAmount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return color == cat.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }
}
