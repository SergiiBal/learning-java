package budget;

public class BudgetTest {
    public static void main(String[] args) {
        Account account1;
        account1 = new Account("acc1");
        double koza;
        koza = 10.10;
        System.out.println(account1);
        Account account2 = new Account("acc2", 100, "USD");
        System.out.println(account2);
        account2.setCurrency("UAH");
        System.out.println(account2.getCurrency());
        Account account3;
        account3 = new Account("acc3", account2.getBalance(), "PLN");
        System.out.println(account3);
        Category cat1 = new Category("cat1");
        System.out.println(cat1);
        //budget.Category@7b23ec81
        Category cat2 = cat1;
        System.out.println(cat2);
        Category cat3 = new Category("cat1");
        System.out.println(cat3);
    }
}

