package codewars;

public class RoundToTheNextMultipleOf5 {

    public static int roundToNext5(int number) {
        int newNumber = 0;
        int result = 0;
        newNumber = newNumber + number;
        for (int i = 0; i <= 4; i++) {
            if (newNumber % 5 == 0 || newNumber == 0) {
                System.out.println(newNumber);
                result = newNumber;
            }
            newNumber = newNumber + 1;
        }
        return result;
    }

    public static void main(String[] args) {
      roundToNext5(1);
    }
}