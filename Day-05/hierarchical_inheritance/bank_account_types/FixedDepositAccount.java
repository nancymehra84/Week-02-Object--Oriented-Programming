package hierarchical_inheritance.bank_account_types;

// Subclass: FixedDepositAccount
class FixedDepositAccount extends BankAccount {
    private int depositTerm; // In months
    private double interestRate;

    public FixedDepositAccount(String accountNumber, double balance, int depositTerm, double interestRate) {
        super(accountNumber, balance);
        this.depositTerm = depositTerm;
        this.interestRate = interestRate;
    }

    public int getDepositTerm() {
        return depositTerm;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void displayMaturityAmount() {
        double maturityAmount = balance * Math.pow(1 + (interestRate / 100), depositTerm / 12.0);
        System.out.println("Maturity Amount after " + depositTerm + " months: " + maturityAmount);
    }

    @Override
    public void displayAccountType() {
        System.out.println("This is a Fixed Deposit Account.");
    }
}
