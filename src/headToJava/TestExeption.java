package headToJava;

public class TestExeption {
    public static void main(String[] args) {

        String test = "yes";
        // "not yes"
try {
    System.out.println("Начало try");
    doRisky(test);
    System.out.println("Конец try");
} catch (ScaryException se) {
    System.out.println("Жуткое исключение");
} finally {
    System.out.println("finally");
}
        System.out.println(" Конец main");
    }

    static void doRisky(String test) throws ScaryException {
        System.out.println("Начало опасного метода");
        if ("yes".equals(test)) {
            throw new ScaryException();
        }
        System.out.println("Конец опасного метода");
        return;
    }
}

class ScaryException extends Exception {
}


