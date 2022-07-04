package headToJava;

class TestArrays {

    public static void main(String[] args) {
        int y = 0;
        String[] islands = {"Bermuda", "Fiji", "Azores", "Cozumel"};
        int[] index = {1, 3, 0, 2};
        while (y < islands.length) {
            System.out.println("island = " + islands[index[y]]);
            y = y + 1;
        }
    }
}
