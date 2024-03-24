import java.util.Scanner;

public class ATM {

    private BankAccount account;
    private Scanner scanner;

    public ATM(BankAccount account) {
        this.account = account;
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("\nWelcome to ATM!");
        System.out.println("1. Withdraw Cash");
        System.out.println("2. Deposit Cash");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    public void processChoice(int choice) {
        switch (choice) {
            case 1:
                withdrawCash();
                break;
            case 2:
                depositCash();
                break;
            case 3:
                checkBalance();
                break;
            case 4:
                System.out.println("Thank you for using ATM!");
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }

    private void withdrawCash() {
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = readValidAmount();
        if (withdrawAmount > 0) {
            if (account.getBalance() >= withdrawAmount) {
                account.withdraw(withdrawAmount);
                System.out.println("Withdrawal successful. Please collect your cash.");
            } else {
                System.out.println("Insufficient funds!");
            }
        } else {
            System.out.println("Invalid amount!");
        }
    }

    private void depositCash() {
        System.out.print("Enter amount to deposit: ");
        double depositAmount = readValidAmount();
        if (depositAmount > 0) {
            account.deposit(depositAmount);
            System.out.println("Deposit successful. Your new balance is: " + account.getBalance());
        } else {
            System.out.println("Invalid amount!");
        }
    }

    private void checkBalance() {
        System.out.println("Your current balance is: " + account.getBalance());
    }

    private double readValidAmount() {
        while (true) {
            if (scanner.hasNextDouble()) {
                double amount = scanner.nextDouble();
                if (amount >= 0) {
                    return amount;
                } else {
                    System.out.println("Amount must be non-negative.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid numeric amount.");
                scanner.next();
            }
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.00); 
        ATM atm = new ATM(account);

        while (true) {
            atm.displayMenu();
            int choice = atm.readValidChoice();
            atm.processChoice(choice);
            if (choice == 4) {
                break;
            }
        }
        atm.closeScanner();
    }

    private int readValidChoice() {
        while (true) {
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                if (choice >= 1 && choice <= 4) {
                    return choice;
                } else {
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid menu choice.");
                scanner.next();
            }
        }
    }

    private void closeScanner() {
        scanner.close();
    }
}

class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }
}
