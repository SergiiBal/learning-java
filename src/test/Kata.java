package test;

public class Kata {
    public static int[] squareOrSquareRoot(int[] inputArray) {
        int[] resultArray = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            double b = Math.sqrt(inputArray[i]);
            if (Math.floor(b) == b) {
                resultArray[i] = (int) Math.sqrt(inputArray[i]);
            } else {
                resultArray[i] = (int) Math.pow(inputArray[i], 2);
            }
            //   System.out.println(resultArray[i]);
        }
        return resultArray;
    }


    public static void main(String[] args) {

        int[] result = squareOrSquareRoot(new int[] {4, 3, 9, 7, 2, 1});
        for (int x : result) {
            System.out.println(x);
        }

    }
}
