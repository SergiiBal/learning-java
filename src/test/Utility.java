package test;

class Utility {


    static void printTimes(String name, int n) {
        if (n > 0) {
            while (n > 0) {
                System.out.println(name);
                n = n - 1;
            }
        } else {
            System.out.println("Pomilka");
        }
    }

    static int getSum(int a, int b) {
        return a + b;
    }

    static boolean isBigger(int a, int b) {
        if (a > b) {
            return true;
        } else {
            return false;
        }
        // return a > b;
    }

    static String compare(int a, int b) {
        if (a > b) {
            return "a is bigger";
        } else if (a == b) {
            return "a is equal to b";
        } else {
            return "b is bigger";
        }
    }
}



