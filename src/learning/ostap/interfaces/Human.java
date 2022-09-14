package learning.ostap.interfaces;

public class Human {
    protected String name;
    protected int age = 0;
    protected String sex;

    public Human(String name, int age, String sex) {
    this.name = name;
    this.age = age;
    this.sex = sex;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
