package test;

public class FindOdd {
    public static int findIt(int[] a) {
        int odd = a[1];
        int n = 0;
        int x;
        for (x = 1; x <= a.length; x = x + 1) {
            if (odd == a[x]) {
                n++;}}
        if (n % 2 == 0 || x< a.length) {
            odd = a[x+1];
        }
        return odd;
    }
}

    public static void main(String[] args) {
        int result = new int[] ({10});
        System.out.println(result);
    }
}

