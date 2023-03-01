package lab3_1;

public class BankAccount {
    private double balance;
    private String accountNumber;
    public BankAccount(String accountNumber) {
        this.accountNumber=accountNumber;
        this.balance=0;
    }
    public void deposit(double amount) {
        if(amount<0) {
            return;
        }
        this.balance=amount;
    }
    public boolean withdraw(double amount) {
        if(amount<0) {
            return false;
        }
        if(this.balance<amount) {
            return false;
        }
        this.balance-=amount;
        return true;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                ", accountNumber='" + accountNumber + '\'' +
                '}';
    }
}

