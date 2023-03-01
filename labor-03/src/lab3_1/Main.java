package lab3_1;

public class Main {
    public static void main(String[] args) {
        BankAccount account1=new BankAccount("OTP0001");
        BankAccount account2=new BankAccount("OTP0002");
        Customer customer1=new Customer("John", "Black");
        Customer customer2=new Customer("Marry", "White");
        customer1.setAccount(account1);
        customer2.setAccount(account2);
    }
}
