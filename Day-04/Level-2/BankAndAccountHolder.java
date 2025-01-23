import java.util.ArrayList;
import java.util.Scanner;

class Account{
    private int accountNumber;
    private double balance;

    //constructor
    public Account (int acoountNumber, double initialDeposit){
        this.accountNumber= accountNumber;
        this.balance=initialDeposit;
    }

    //Getter method

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    //method to deposit and withdraw money
    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        if (amount <=balance){
            balance=amount;
        }else {
            System.out.println("Insufficient Balance.");
        }
    }
    //Display account details
    public void displayAccountDetails(){
        System.out.println("Account Number:"+accountNumber+", Balance:"+balance);
    }
}
class Customer{
    private String name;
    private ArrayList<Account> accounts;

    //constructor
    public Customer (String name){
        this.name=name;
        this.accounts=new ArrayList<>();
    }

    public void addAccount(Account account){
        accounts.add(account);
    }

    public void viewBalances(){
        System.out.println("Customer: "+ name+"- Account Details: ");
        for (Account account : accounts ){
            account.displayAccountDetails();
        }
    }
    //getter for customer name
    public String getName(){
        return name;
    }
}
class Bank {
    private String bankName;
    private ArrayList<Customer> customers;

    // Constructor
    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    // Method to open an account for a customer
    public void openAccount(Customer customer, int accountNumber, double initialDeposit) {
        Account newAccount = new Account(accountNumber, initialDeposit);
        customer.addAccount(newAccount);
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
        System.out.println("Account opened for " + customer.getName() + " with account number " + accountNumber);
    }

    // Method to display all customers
    public void displayCustomers() {
        System.out.println("Bank: " + bankName + " - Customers:");
        for (Customer customer : customers) {
            System.out.println("- " + customer.getName());
        }
    }
}
public class BankAndAccountHolder {
    public static void main(String[] args){
        Bank bank=new Bank("SBI Bank");

        //create customers
        Customer customer1=new Customer("Nancy");
        Customer customer2=new Customer("Muskan");

        // Open accounts for customers
        bank.openAccount(customer1, 1001, 500.0);
        bank.openAccount(customer1, 1002, 1000.0);
        bank.openAccount(customer2, 2001, 750.0);

        // Display all customers in the bank
        bank.displayCustomers();

        // Display balances for each customer
        customer1.viewBalances();
        customer2.viewBalances();
    }
}
