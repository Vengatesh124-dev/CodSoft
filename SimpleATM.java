1
import java.util.Scanner;

class BankAccount {
    double balance;

    BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    void deposit(double amount) {
        if (amount > 0) balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void checkBalance() {
        System.out.println("Balance: " + balance);
    }
}

public class SimpleATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(1000); // initial balance

        while (true) {
            System.out.println("\n1.Deposit  2.Withdraw  3.Check Balance  4.Exit");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter amount: ");
                account.deposit(sc.nextDouble());
            } else if (choice == 2) {
                System.out.print("Enter amount: ");
                account.withdraw(sc.nextDouble());
            } else if (choice == 3) {
                account.checkBalance();
            } else if (choice == 4) {
                System.out.println("Thank you for using ATM!");
                break;
            } else {
                System.out.println("Invalid option!");
            }
        }
        sc.close();
    }
}