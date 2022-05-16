package calculator;

public class Calculator {
    private double result = 0;

    private boolean isCrashed = false;

    public void plus(double parametr) {
        result = parametr + result;
    }

    public void minus(double p) {
        result = result - p;
    }

    public void multiply(double p) {
        result = result * p;
    }

    public void divide(double p) {
        result = result / p;
    }

    public void printResult() {
        if (!isCrashed) {
            System.out.println(result);
        }
    }

    public void setResult(double p) {
        result = p;
    }

    public void square() {
        result = result * result;
    }

    public void squareRoot() {
        result = Math.sqrt(result);
    }

    public void isGreaterThan(double p) {
        if (result > p) {
            System.out.println("Більше");
        }
        if (result == p) {
            System.out.println("Рівно");
        }
        if (result < p) {
            System.out.println("Менше");
        }
    }

    public void incrementTimes(double p, int times) {
        if (times <= 0) {
            System.out.println("You are fool");
        } else {
            while (times > 0) {
                result = result + p;
                times = times - 1;
            }
        }

    }

    public void decrementTimes(double i, int times) {
        if (times <= 0) {
            System.out.println("You are fool");
        } else {
            while (times > 0) {
                result = result - i;
                times = times - 1;
            }
        }
    }

    public void multiplyTimes(double i, int times) {
        if (times <= 0) {
            System.out.println("You are fool");
        } else {
            while (times > 0) {
                result = result * i;
                times = times - 1;
            }
        }
    }

    public void divideTimes(double u, int times) {
        if (u == 0) {
            System.out.println("Game Over");
            isCrashed = true;
        } else {
            while (times > 0) {
                result = result / u;
                times = times - 1;
            }
        }
    }

    public void reset() {
        System.out.println("Resetting calculator");
        isCrashed = false;
        result = 0;
    }
}


