package oop.labor06;

public class BankAccount {
    private static int num = 0;

    public static final String prefix = "OTP";
    private final String accountNumber;
    private double balance;

    public BankAccount() {
        num++;
        String number = String.format("%010d", this.num);
        this.accountNumber = prefix+number;
        this.balance = 0;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (this.balance < amount)
            return false;
        this.balance -= amount;
        return true;
    }

    public String toString(){

        return getAccountNumber()+": "+getBalance()+"$";
    }
}
