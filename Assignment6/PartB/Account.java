package PartB;

public class Account {
    // instance data members
    protected final String firstName, lastName; // two String members
    protected double currentBalance;

    // methods
    public Account(String firstName, String lastName, double currentBalance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.currentBalance = currentBalance;
    }

    public String getAcctType() {
        return this.getClass().getName(); // returns the string of the class name
    }

    public double debitTransaction(double debitAmount) {
        this.currentBalance -= debitAmount;
        return this.currentBalance;
    }

    public double creditTransaction(double creditAmount) {
        if(creditAmount < 0) {
            throw new IllegalArgumentException("credit amount cant be negative");
        }
        this.currentBalance += creditAmount;
        return this.currentBalance;
    }

    public String toString() {
        return "Account name: " + this.firstName + " " + this.lastName + ", Account Type: "
                + getAcctType() + ", Balance: " + String.format("$%.2f", this.currentBalance);
    }

    // Simple Unit Test
    public static void main(String[] args) {
        Account ac1 = new Account("John", "Smith", 100);
        System.out.println(ac1);

        ac1.debitTransaction(30.25); // should be $69.75
        System.out.println(ac1);

        ac1.creditTransaction(10.10);
        System.out.println(ac1); // should be $79.85
    }

  /* Output of the unit test
  Account name: John Smith, Account Type: Account, Balance: $100.00
  Account name: John Smith, Account Type: Account, Balance: $69.75
  Account name: John Smith, Account Type: Account, Balance: $79.85
  */

} // end class


