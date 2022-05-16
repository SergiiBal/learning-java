package test;

public class SumExceptBiggestAndLowest {
    public static int summm(int[] inputArray3) {
        int[] resultArray3 = inputArray3;
        if (resultArray3 == null || resultArray3.length <= 1) {
            return  0;
        }
        int max = resultArray3[0];
        int min = resultArray3[0];
        int sum = 0;
        for (int i = 0; i < resultArray3.length; i++) {
            sum = sum + resultArray3[i];
            if (max <= resultArray3[i]) {
                max = resultArray3[i];
            }
            if (min >= resultArray3[i]) {
                min = resultArray3[i];
            }
        }
        return sum - min - max;

    }


    public static void main(String[] args) {
       int c = SumExceptBiggestAndLowest.summm(new int[]{});
     //   int c = SumExceptBiggestAndLowest.summm(null);
        System.out.println(c);
    }
}



