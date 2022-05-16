package javaExample;

class TestArrays {

    public static void main(String[] args) {
        int y = 0;
        int arraySize = 4;

        while (y < arraySize) {
            String[] islands = {"Bermuda", "Fiji", "Azores", "Cozumel"};

            int[] index = {1, 3, 0, 2};

            int ref = index[y];

            System.out.println("island = " + islands[ref]);

            y = y + 1;
        }
    }
}
