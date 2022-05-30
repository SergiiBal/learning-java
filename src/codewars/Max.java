//package codewars;
//
//public class Max {
//    public static int sequence(int[] arr) {
//        int[] myArray = arr;
//        int sum = 0;
//        int maxSum = 0;
//        int maxNumber = 0;
//        int number = 0;
//        int k = 0;
//        for (int i=0; i< myArray.length; i++) {
//           if (myArray[i] >= maxNumber) {
//               maxNumber = myArray[i];
//               number = i;
//            }
//        }
//        maxSum = maxNumber;
//        for ( k= number; k < myArray.length)
//        return maxNumber;
//    }
//
//    public static void main(String[] args) {
//      int p = sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
//        System.out.println(p);
//    }
//}