package test;

public class Phone {
   private int currentTime;
   private int clockTime;

   public Phone(int currentTime, int clockTime) {
        this.currentTime = currentTime;
        this.clockTime = clockTime;
    }

    void wakeUp() {
       if (currentTime == clockTime) {
           Utility.printTimes("Wake up", 10);
       }
       else
           System.out.println("Sleeping");
    }

}
