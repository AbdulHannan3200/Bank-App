public class BankApp implements BankAppInterface {

    private String name;
    private int accountNumber;
    private int initialDeposit;
    public int totalAmount;

    public BankApp(String name, int accountNumber, int initialDeposit) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.initialDeposit = initialDeposit;
        this.totalAmount = initialDeposit; // Set initial deposit as starting balance
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getInitialDeposit() {
        return initialDeposit;
    }

    public void setInitialDeposit(int initialDeposit) {
        this.initialDeposit = initialDeposit;
    }

    @Override
    public int deposit(int amount) {
        if (amount > 0) {
            totalAmount += amount;
        } else {
            System.out.println("Enter amount greater than 0.0");
        }
        return totalAmount;
    }

    @Override
    public int withdraw(int amount) {
        if (amount > 0 && amount <= totalAmount) {
            totalAmount -= amount;
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
        return totalAmount;
    }

    @Override
    public void checkBalance(int accountNumber) {
        if (this.accountNumber == accountNumber) {
            System.out.println("Your total balance is : " + totalAmount);
        } else {
            System.out.println("Account number mismatch.");
        }
    }
}
