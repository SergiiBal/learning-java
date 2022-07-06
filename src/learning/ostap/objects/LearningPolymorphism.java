package learning.ostap.objects;

public class LearningPolymorphism {
    public static void main(String[] args) {
      //  Animal a = new Animal("Bamby");
        Bird b = new Bird("Tom", 4, "BLACK");
        Cat c = new Cat("Bob");
     //   printClass(a);
        printClass(b);
        printClass(c);
    }

    public static void printClass(Animal animal){
        System.out.println(animal.getClass().getSimpleName());
    }
}
