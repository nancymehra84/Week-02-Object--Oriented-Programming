package encapsulation_and_polyphorphism.bank_system;

// CurrentAccount class
class CurrentAccount extends BankAccount {
    private static final double OVERDRAFT_LIMIT = 1000;

    // Constructor
    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return 0; // No interest for Current Account
    }

    public boolean hasOverdraftFacility(double amount) {
        return amount <= (getBalance() + OVERDRAFT_LIMIT);
    }
}

