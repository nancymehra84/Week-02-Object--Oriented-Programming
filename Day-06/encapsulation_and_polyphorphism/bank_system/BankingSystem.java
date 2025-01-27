package encapsulation_and_polyphorphism.bank_system;

public class BankingSystem {

    public static void calculateAndDisplayDetails(BankAccount[] accounts) {
        for (BankAccount account : accounts) {
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Holder Name: " + account.getHolderName());
            System.out.println("Balance: " + account.getBalance());
            System.out.println("Interest: " + account.calculateInterest());

            if (account instanceof Loanable) {
                Loanable loanable = (Loanable) account;
                System.out.println("Loan Eligibility: " + loanable.calculateLoanEligibility());
                loanable.applyForLoan();
            }

        }
    }

    public static void main(String[] args) {
        // Create instances of accounts
        BankAccount[] accounts = new BankAccount[2];

        accounts[0] = new SavingsAccount("SBI8461", "Nancy", 500);
        accounts[1] = new CurrentAccount("CDA8839", "Muskan", 2500);

        // Calculate and display details
        calculateAndDisplayDetails(accounts);
    }
}
