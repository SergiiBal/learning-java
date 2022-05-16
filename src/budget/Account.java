package budget;

public class Account {
    private String name;
    private double balance;
    private String currency;

    public Account(String name) {
        this.name = name;
        this.balance = 0;
        this.currency = "UAH";
    }

    public Account(String name, double balance, String currency) {
        this.name = name;
        this.balance = balance;
        this.currency = currency;
    }

    public Account(String name, String currency) {
        this.name = name;
        this.balance = 0;
        this.currency = currency;
    }

    //getter
    public String getName() {
        return name;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                ", currency='" + currency + '\'' +
                '}';
    }

    //TODO: Add new methods
    //addAmount - (adds amount to balance)
    //subtractAmount -(removes amount from balance)
}

