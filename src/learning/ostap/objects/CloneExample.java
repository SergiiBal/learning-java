package learning.ostap.objects;

public class CloneExample implements Cloneable {
    private String name;
    private int age;
    public CloneExample(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void displayData(){
        System.out.println("Name : "+this.name);
        System.out.println("Age : "+this.age);
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        CloneExample std = new CloneExample("Krishna", 25);
        System.out.println("Contents of the original object");
        std.displayData();
        System.out.println("Contents of the copied object");
        CloneExample copiedStd = (CloneExample) std.clone();
        copiedStd.displayData();
    }
}