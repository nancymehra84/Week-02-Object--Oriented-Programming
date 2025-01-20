public class BankAccount {
    // Static variable 
    static String bankName = "SBI";
    static int totalAccounts = 0;

    // Instance variables
    String accountHolderName;
    final String accountNumber;

    // Constructor with 'this'
    public BankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++; 
    }

    // Static method 
    public static void getTotalAccounts() {
        System.out.println("Total accounts: " + totalAccounts);
    }

    // Method to display account details 
    public void displayAccountDetails() {
        
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder Name: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
        }
    }

    // Main method 
    public static void main(String[] args) {
        // Create two BankAccount instances
        BankAccount account1 = new BankAccount("Nancy", "1234567890");
        BankAccount account2 = new BankAccount("Muskan", "5738927907");

        // Display details 
        account1.displayAccountDetails();
        account2.displayAccountDetails();

        // Get total number of accounts
        BankAccount.getTotalAccounts(); 
    }
}
