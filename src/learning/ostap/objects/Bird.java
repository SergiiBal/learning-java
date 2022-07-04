package learning.ostap.objects;

import java.util.Objects;

public class Bird extends Animal {
    private BirdName name = BirdName.UNKNOWN;
    private int age = 0;
    private static int numberOfWings = 2;
  //  private String color;
    private int wingspan = 2;

    public Bird(String name, int age, String color) {
        super(name, age, color);
    //    this.name = BirdName.valueOf(name.toUpperCase());
    //    this.color = color;

    }

//    public Bird(String color) {
//        super(BirdName.UNKNOWN.name(), color);
//    }

    public Bird(String name, int age, int numberOfWings, String color, int wingspan) {
      super(name, age, color);
      this.name = BirdName.valueOf(name.toUpperCase());
     this.age = age;
       // this.color = color;
        this.wingspan = wingspan;
        Bird.numberOfWings = numberOfWings;
    }



//    public BirdName getName() {
//        return name;
//    }

    public int getAge() {
        return age;
    }

    public static int getNumberOfWings() {
        return numberOfWings;
    }

//    public String getColor() {
//        return color;
//    }

    public  int getWingspan() {
        return wingspan;
    }

    public void setName(String name) {
       this.name = BirdName.valueOf(name.toUpperCase());
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void setNumberOfWings(int numberOfWings) {
        Bird.numberOfWings = numberOfWings;
    }

//    public void setColor(String color) {
//        this.color = color;
//   }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", number of winds=" + numberOfWings +
                ", color='" + color + '\'' +
                ", wingspan=" + wingspan +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Bird bird = (Bird) o;
//        return age == bird.age && wingspan == bird.wingspan && name.equals(bird.name) && color.equals(bird.color);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bird bird = (Bird) o;
        return age == bird.age && wingspan == bird.wingspan && name == bird.name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, color, wingspan);
    }
}
