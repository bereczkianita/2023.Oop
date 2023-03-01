package lab3_1;

public class Customer {
    private String firstName;
    private String lastName;
    private BankAccount account;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }
    public BankAccount getAccount(){ return getAccount();}
    public String getFirstName(){ return getFirstName();}
    public String getLastName(){ return getLastName();}

    public void closeAccount(){
        account=null;
    }
}
