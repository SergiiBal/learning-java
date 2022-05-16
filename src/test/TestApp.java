package test;

public class TestApp {

    public static void main(String[] args) {
        System.out.println("Hello");
        Utility.printTimes("Ostap", -1);
        int sum = Utility.getSum(3, 4);
        System.out.println(sum);
        System.out.println(Utility.getSum(3, 4));
        System.out.println(Utility.isBigger(6, 5));
        System.out.println(Utility.compare(7, 3));
        Phone clock = new Phone(12,13);
        clock.wakeUp();
        
    }
}
