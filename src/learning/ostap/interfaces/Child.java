package learning.ostap.interfaces;

import learning.ostap.objects.Animal;

public class Child extends Human implements Visitors {
    String name;
    private int age;
    private  String sex;

    public Child(String name, int age, String sex) {
        super(name, age, sex);
    }

    public String introduceYourSelf() {
        return ("Hello, where is my transfer? My name is ");
    }

    void transfer(Animal animal) {
    }

    @Override
    public String toString() {
        return "Child{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
