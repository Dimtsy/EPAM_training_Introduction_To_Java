package programmingWithClasses.aggregationAndComposition.bank;

public class Account {
    private double balance;
    private int numberAccount;
    private boolean onOf;

    public Account(double balance, int numberAccount, boolean onOf) {
        this.balance = balance;
        this.numberAccount = numberAccount;
        this.onOf = onOf;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(int numberAccount) {
        this.numberAccount = numberAccount;
    }

    public boolean isOnOf() {
        return onOf;
    }

    public void setOnOf(boolean onOf) {
        this.onOf = onOf;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", numberAccount=" + numberAccount +
                ", onOf=" + onOf +
                '}';
    }
}
