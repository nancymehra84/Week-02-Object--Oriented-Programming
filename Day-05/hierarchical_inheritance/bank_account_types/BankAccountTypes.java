package hierarchical_inheritance.bank_account_types;

// Demonstration
public class BankAccountTypes {
    public static void main(String[] args) {
        // Create SavingsAccount
        SavingsAccount savings = new SavingsAccount("S123", 5000, 3.5);
        savings.displayAccountType();
        savings.applyInterest();
        savings.deposit(1000);
        savings.withdraw(500);

        // Create CheckingAccount
        CheckingAccount checking = new CheckingAccount("C456", 3000, 1000);
        checking.displayAccountType();
        checking.deposit(500);
        checking.withdraw(1200); // Exceeds withdrawal limit
        checking.withdraw(800); // Valid withdrawal

        // Create FixedDepositAccount
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("F789", 10000, 24, 5.0);
        fixedDeposit.displayAccountType();
        fixedDeposit.displayMaturityAmount();
    }
}

