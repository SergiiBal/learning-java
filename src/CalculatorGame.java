import calculator.Calculator;

public class CalculatorGame {
    public static void main(String[] args) {
        // gameOne();
        Calculator f = new Calculator();
        // f.setResault(50);
        f.decrementTimes(6,100);
        f.printResult();
        f.setResult(3);
        f.multiplyTimes(2,5);
        f.printResult();
        f.divideTimes(0,7);
        f.printResult();
        f.reset();
        f.printResult();

//        Calculator a = new Calculator();
//        a.setResault(3);
//        a.square();
//        a.printResault();
//        a.squareRoot();
//        a.printResault();
//        a.isGreaterThan(0);
//        a.isGreaterThan(4);
//        a.isGreaterThan(3);
//        a.incrementTimes(2,4);
//        a.printResault();
//        a.incrementTimes(-1, 10);
//        a.printResault();
//        a.incrementTimes(5,-5);
//        a.printResault();

    }

    private static void gameOne() {
        Calculator c = new Calculator();
        c.printResult();
        c.plus(3);
        c.multiply(4);
        c.divide(6);
        c.printResult();
        c.setResult(5);
        c.printResult();

        Calculator d = new Calculator();
        d.printResult();
        d = c; // boss variables hold same objects
        d.printResult();

        c.minus(2);
        d.minus(3);
        c.printResult();

        d = new Calculator(); // new assignment
        d.setResult(10.5);
        c.plus(5);
        d.minus(5);
        c.printResult();
        d.printResult();
        // 5 5.5
    }
}
