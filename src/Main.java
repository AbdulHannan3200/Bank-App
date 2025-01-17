import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        BankApp account1 = new BankApp("Liaqat Ali", 32001, 1000);
        BankApp account2 = new BankApp("AbdulHannan", 32002, 1500);
        BankApp account3 = new BankApp("Faizan Liaqat", 32003, 2000);

        Scanner uInput = new Scanner(System.in);

        while (true) {
            System.out.println("\nWelcome to the Bank App");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = uInput.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter account number: ");
                    int depositAccount = uInput.nextInt();
                    System.out.print("Enter deposit amount: ");
                    int depositAmount = uInput.nextInt();

                    handleDeposit(depositAccount, depositAmount, account1, account2, account3);
                    break;

                case 2:
                    System.out.print("Enter account number: ");
                    int withdrawAccount = uInput.nextInt();
                    System.out.print("Enter withdraw amount: ");
                    int withdrawAmount = uInput.nextInt();
                    // Handle withdrawal based on account number
                    handleWithdraw(withdrawAccount, withdrawAmount, account1, account2, account3);

                    break;

                case 3:
                    System.out.print("Enter account number: ");
                    int balanceAccount = uInput.nextInt();
                    // Handle balance checking based on account number
                    handleBalance(balanceAccount, account1, account2, account3);
                    break;

                case 4:
                    System.out.println("Exiting the Bank App.");
                    uInput.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please choose a valid option.");
                    break;
            }
        }
    }

    // Method to handle deposits
    private static void handleDeposit(int accountNumber, int amount, BankApp account1, BankApp account2, BankApp account3) {
        if (account1.getAccountNumber() == accountNumber) {
            account1.deposit(amount);
            System.out.println("Successfully deposited-:)");
        } else if (account2.getAccountNumber() == accountNumber) {
            account2.deposit(amount);
            System.out.println("Successfully deposited-:)");
        } else if (account3.getAccountNumber() == accountNumber) {
            account3.deposit(amount);
            System.out.println("Successfully deposited-:)");
        } else {
            System.out.println("Account number not found.");
        }
    }

    // Method to handle withdrawals
    private static void handleWithdraw(int accountNumber, int amount, BankApp account1, BankApp account2, BankApp account3) {
        if (account1.getAccountNumber() == accountNumber) {
            account1.withdraw(amount);
            System.out.println("Successfully Withdraw-:)");
        } else if (account2.getAccountNumber() == accountNumber) {
            account2.withdraw(amount);
            System.out.println("Successfully Withdraw-:)");
        } else if (account3.getAccountNumber() == accountNumber) {
            account3.withdraw(amount);
            System.out.println("Successfully Withdraw-:)");
        } else {
            System.out.println("Account number not found.");
        }
    }

    // Method to check balance
    private static void handleBalance(int accountNumber, BankApp account1, BankApp account2, BankApp account3) {
        if (account1.getAccountNumber() == accountNumber) {
            account1.checkBalance(accountNumber);
        } else if (account2.getAccountNumber() == accountNumber) {
            account2.checkBalance(accountNumber);
        } else if (account3.getAccountNumber() == accountNumber) {
            account3.checkBalance(accountNumber);
        } else {
            System.out.println("Account number not found.");
        }
    }
}
