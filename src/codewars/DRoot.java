package codewars;

public class DRoot {
    public static void digital_root(int n) {
        String temp = Integer.toString(n);
        int[] arrayNumbers = new int[temp.length()];
        int sum = 0;
        if
        for (int i = 0; i < temp.length(); i++) {
                arrayNumbers[i] = temp.charAt(i) - '0';
            System.out.println(arrayNumbers[i]);
            sum = sum +  arrayNumbers[i];
            }
        System.out.println(sum);
        n = sum;
        }

    public static void main(String[] args) {
        digital_root(16);
    }
}


