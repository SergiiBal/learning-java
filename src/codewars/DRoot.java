package codewars;

public class DRoot {
    public static void digital_root(int n) {
        String temp = Integer.toString(n);

        int sum = 0;
        while (temp.length() > 1) {
            int[] arrayNumbers = new int[temp.length()];
            for (int i = 0; i < temp.length(); i++) {
                arrayNumbers[i] = temp.charAt(i) - '0';
             //   System.out.println(arrayNumbers[i]);
                sum = sum + arrayNumbers[i];
            }
          //  System.out.println(sum);
            n = sum;
            temp = Integer.toString(n);
            sum = 0;
        }
        System.out.println(n);
    }

    public static void main(String[] args) {
        digital_root(132189);
    }
}


