class PoolPuzzleOne {
    public static void main(String[] arguments) {
        System.out.println(arguments);
        int a = 0;
        int b = 1;
        int result = PoolPuzzleOne.sum(a,b);
        System.out.println(result);
        System.out.println(PoolPuzzleOne.sum(1,10));
        makeBreakfast(0);
        makeBreakfast(3);
        makeBreakfast(1000);

        int x = 0;

        while (x < 4) {
            System.out.print("a");
            if (x < 1) {
                System.out.print(" ");
            }
            System.out.print("n");
            if (x > 1) {
                System.out.print(" oyster");
                x = x + 2;
            }
            if (x == 1) {
                System.out.print("noys");
            }
            if (x < 1) {
                System.out.print("oise");
            }
            System.out.println("");
            x = x + 1;
        }
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static Food makeBreakfast(int amountOfKisses) {
        if (amountOfKisses == 0) {
            return new Food("bad food");
        } else {
            return new Food("awesome food");
        }
    }

    private static class Food {
        Food(String value) {
            System.out.println(value);
        }
    }

}
