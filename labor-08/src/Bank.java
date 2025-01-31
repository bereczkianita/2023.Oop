import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    private final List<Customer> customers;

    public Bank(String name, List<Customer> customers) {
        this.customers = new ArrayList<>();
    }
    public void addCustomer(Customer customer){
        customers.add(customer);
    }
    public Customer getCustomer(int customerId){
        for (Customer customer : customers){
            if (customer.getId() == customerId){
                return customer;
            }
        }
        return null;
    }

    private void printCustomers(PrintStream ps){
        ps.println("ID, Firstname, Last name, Number of bank accounts");
        for (Customer customer : customers){
            ps.println(customer.getId() + ", " + customer.getFirstName() + ", " + customer.getLastName() +
                    ", " + customer.getAccountNumbers());
        }
        ps.close();
    }
    public void printCustomersToStdout(){
        printCustomers(System.out);
    }
    public void printCustomersToFile(String filename){
        try{
            printCustomers(new PrintStream(filename));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}