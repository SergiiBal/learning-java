package budget;

public class Transaction {
    private String name;
    private Category category;
    private double amount;
    private Account account;

    public Transaction(String name, Category category, double amount, Account account) {
        this.name = name;
        this.category = category;
        this.amount = amount;
        this.account = account;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setCategory(String categoryName) {
        this.category = new Category(categoryName);
    }

    //TODO: Finish Getters and Setters
}
