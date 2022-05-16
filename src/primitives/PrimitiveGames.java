package primitives;

class PrimitiveGames {
    public static void main(String[] args) {
        PrimitiveHolder.printBar();
        PrimitiveHolder object1 = new PrimitiveHolder();
        PrimitiveHolder object2;
        object2 = new PrimitiveHolder();
        object1.var = 5;
        object2.var = 3;
        object1.printVar();
        object2.printVar();
        PrimitiveHolder.bar = 3;
        PrimitiveHolder.printBar();

        // testFan();

    }

    private static void testFan() {
        int a = 0;
        int b = 1;
        System.out.println("a=" + a + ", b=" + b);
        a = b;
        System.out.println("a=" + a + ", b=" + b);
        b = 3;
        System.out.println("a=" + a + ", b=" + b);
        System.out.println("OBJECTS");
        PrimitiveHolder o1 = new PrimitiveHolder();
        PrimitiveHolder o2 = new PrimitiveHolder();
        o1.var = 0;
        o2.var = 1;
        System.out.println("a=" + o1.var + ", b=" + o2.var);
        o1 = o2;
        System.out.println("a=" + o1.var + ", b=" + o2.var);
        o2.var = 3;
        System.out.println("a=" + o1.var + ", b=" + o2.var);
    }
}

class PrimitiveHolder {
    int var = 0;
    static int bar = 1;

    void printVar() {
        System.out.println(var);
    }

    static void printBar() {
        System.out.println(bar);
    }
}