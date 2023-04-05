import oop.labor08.BankAccount;

public class SavingsAccount extends BankAccount {


   private double interestRate;

   public SavingsAccount(double interestRate) {
      this.interestRate = interestRate;
   }

   public double getInterestRate() {
      return interestRate;
   }

   public void setInterestRate(double interestRate) {
      this.interestRate = interestRate;
   }
   public void addInterest() {
      super.balance*=this.interestRate;
   }

   @Override
   public String toString() {
      return "SavingsAccount{" +
              "interestRate=" + interestRate +
              '}';
   }
}
