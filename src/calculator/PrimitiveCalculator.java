package calculator;

public class PrimitiveCalculator {
    int o1 = 10;

    public static void main(String[] args) {
        PrimitiveCalculator a = new PrimitiveCalculator();
        int resault = 0;
        resault = a.summ(5, 7);
        System.out.println(resault);
        resault = a.minus(4, 2);
        System.out.println(resault);
//        resault = a.devide(8,2);
//        System.out.println(resault);
        double resault2 = 0;
        resault2 = a.devide(7, 2);
        System.out.println(resault2);
        PrimitiveCalculator b = new PrimitiveCalculator();
        double resault3 = 0;
        if (resault >= resault2) {
            resault3 = 3;
        } else {
            resault3 = 6;
        }
        System.out.println(resault2);
        int o1 = 10;
    }

    int summ(int o1, int o2) {
        return o1 + o2;
    }

    int minus(int o1, int o2) {
        return o1 - o2;
    }

    double devide(double o1, double o2) {
        return o1 / o2;
    }
}
