package codewars;

public class Solution2 {
    public static int[] twoSum(int[] numbers, int target) {
        int sum = 0;
        int[] resultArray = new int[2];
    //    System.out.println(numbers.length);
if (numbers == null) {
            System.out.println("Received a null");
        } if (numbers.length < 2) {
            System.out.println("Received an array that's not of length 2");
        } else
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                sum = numbers[i] + numbers[j];
               // System.out.println(sum);
                if (sum == target) {
                    resultArray[0] = i;
                    resultArray[1] = j;
                }
            }
        }
        return resultArray;
    }

    public static void main(String[] args) {
        int[] p = twoSum(new int[]{1, 2, 3}, 4);
        for (int k = 0; k <= 1; k++) {
            System.out.println(p[k]);
        }
    }
}


