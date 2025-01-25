package hierarchical_inheritance.bank_account_types;

// Subclass: SavingsAccount
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void applyInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest applied:" + interest + ", New Balance: " + balance);
    }

    @Override
    public void displayAccountType() {
        System.out.println("This is a Savings Account.");
    }
}

