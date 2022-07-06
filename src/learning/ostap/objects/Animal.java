package learning.ostap.objects;

public abstract class Animal {
    protected String name;
    protected String color;
    protected int age = 0;

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

//    public Animal(String color) {
//        this.color = color;
//    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
////////////////////////////
    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}


