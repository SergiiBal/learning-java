import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        showedStaticInstanceExamples();

//        showedBudgetExample();
    }

    private static void showedBudgetExample() {
        BudgetCategory category1 = null;
        category1 = new BudgetCategory("Mariia");
        BudgetCategory category2 = new BudgetCategory("Food");
        DatabaseUtils.saveToDatabase(category1);
        DatabaseUtils.saveToDatabase(category2);
        Expense expense1 = new Expense(category1, BigDecimal.valueOf(100), "USD");
        DatabaseUtils.saveToDatabase(expense1);
    }

    private static void showedStaticInstanceExamples() {
        StaticInstanceClass objectA = new StaticInstanceClass();
        StaticInstanceClass objectB = new StaticInstanceClass();
        objectA.printVariables();
        objectB.printVariables();
        System.out.println(objectA.equals(objectB));

        objectA.incrementY();
        objectA.incrementY();
        objectA.printVariables();
        objectB.printVariables();

        StaticInstanceClass.incrementX();
        objectA.printVariables();
        objectB.printVariables();

        StaticInstanceClass.x = 5;
        objectA.printVariables();
        objectB.printVariables();

        objectB.y = 10;
        objectA.printVariables();
        objectB.printVariables();
    }
}

class BudgetCategory {
    final String name;

    BudgetCategory(String name) {
        this.name = name;
    }
}

class Expense {
    final BudgetCategory budgetCategory;
    final BigDecimal amount;
    final String currency;

    Expense(BudgetCategory budgetCategory, BigDecimal amount, String currency) {
        this.budgetCategory = budgetCategory;
        this.amount = amount;
        this.currency = currency;
    }
}

class DatabaseUtils {
    static void saveToDatabase(Expense expense) {
        System.out.println("Saved to database expense with amount: " + expense.amount);
    }

    static void saveToDatabase(BudgetCategory category) {
        System.out.println("Saved to database category: " + category.name);
    }
}

class StaticInstanceClass {
    static int x = 0;
    int y = 0;

    static void incrementX() {
        x = x + 1;
    }

    void incrementY() {
        y = y + 1;
    }

    void printVariables() {
        UtilityClass.printVariables(x, y);
    }
}

class UtilityClass {
    static void printVariables(int x, int y) {
        System.out.println("X = " + x + "; Y = " + y);
    }

}
