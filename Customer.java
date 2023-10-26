import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Customer {
    private String name;
    private double balance;

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }
}

class Loan {
    private Customer customer;
    private double loanAmount;
    private double interestRate;
    private int term;
    private double remainingBalance;

    public Loan(Customer customer, double loanAmount, double interestRate, int term) {
        this.customer = customer;
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.term = term;
        this.remainingBalance = loanAmount;
    }

    public void makePayment(double paymentAmount) {
        double interestPayment = remainingBalance * (interestRate / 12); // Monthly interest
        double principalPayment = paymentAmount - interestPayment;
        remainingBalance -= principalPayment;
    }

    public double getRemainingBalance() {
        return remainingBalance;
    }
}

public class BankManagementSystem {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
      
        Customer customer2 = new Customer();      
        Loan loan1 = new Loan(customer1); 
        Loan loan2 = new Loan(customer2); 

        // Make monthly payments
        for (int month = 1; month <= 12; month++) {
            loan1.makePayment(); 
            loan2.makePayment(); 
        }

      
        System.out.println(" remaining loan balance: $" + loan1.getRemainingBalance());
        System.out.println(" remaining loan balance: $" + loan2.getRemainingBalance());
    }
}
