package arrays;

public class ArraysApp {

    public static void main(String[] args) {
        int[] intArray = new int[10];
        intArray[0] = 2;
        System.out.println(intArray[1]);

        String[] stringArray = new String[10];
        System.out.println(stringArray[0]);

        int[] intArray2 = {1, 2, 3, 4, 5};
        System.out.println(intArray2);

        System.out.println("while");
        int x = 0;
        while (x < intArray2.length) {
            System.out.println(intArray2[x]);
            x++;
        }

        System.out.println("do-while");
        int y = 0;
        do {
            System.out.println(intArray2[y]);
            y++;
        } while (y < intArray2.length);

        System.out.println("for");
        for (int i = 0; i < intArray2.length; i++) {
            System.out.println(intArray2[i]);
        }

        System.out.println("for-each");
        for (int element : intArray2) {
            System.out.println(element);
        }
    }
}
