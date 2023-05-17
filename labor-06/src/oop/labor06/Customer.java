package oop.labor06;

import java.util.ArrayList;

public class Customer {
    private String firstName;
    private String lastName;
    private final int id;
    private static int numCustomers;

    private ArrayList<BankAccount> accounts;

    public Customer(String firstName, String lastName) {
        accounts = new ArrayList<>();
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = ++numCustomers;

    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public BankAccount getAccount(String accountNumber) {
        for (BankAccount ba : accounts) {
            if (ba.getAccountNumber().equals(accountNumber)) {
                return ba;
            }
        }
        return null;
    }

    public void depositAccount(String bankAccount, double amount) {
        if (getAccount(bankAccount) != null && amount > 0) {
            getAccount(bankAccount).deposit(amount);
        }

    }

    public void closeAccount(String accountNumber) {
        if (getAccount(accountNumber) != null) {

            for (int i = 0; i < accounts.size(); i++) {
                if(accountNumber.equals(accounts.get(i).getAccountNumber())) {
                    accounts.remove(i);
                    break;
                }
            }
        }
    }

    public void setFirstName (String firstName){
        this.firstName = firstName;
    }

    public void setLastName (String lastName){
        this.lastName = lastName;
    }


    @Override
    public String toString () {
        StringBuilder sb = new StringBuilder();
        sb.append(id).append(" ").append(firstName).append(lastName);
        for(BankAccount d : accounts) {
            sb.append(String.format("Account: " +  d.getAccountNumber() +" \n"));
            sb.append(String.format("Balance: " + d.getBalance() + "\n"));
        }
        return sb.toString();
    }
}
