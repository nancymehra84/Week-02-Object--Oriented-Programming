package hierarchical_inheritance.bank_account_types;

// Subclass: CheckingAccount
class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    public double getWithdrawalLimit() {
        return withdrawalLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance && amount <= withdrawalLimit) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Withdrawal exceeds limit or insufficient funds.");
        }
    }

    @Override
    public void displayAccountType() {
        System.out.println("This is a Checking Account.");
    }
}

