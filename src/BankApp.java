public class BankApp implements BankAppInterface {
    private final String name;
    private final int accountNumber;
    private int initialDeposit;
    private int totalAmount;

    public BankApp(String name, int accountNumber, int initialDeposit) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.initialDeposit = initialDeposit;
        this.totalAmount = initialDeposit;
    }

    public String getName() {
        return name;
    }


    public int getAccountNumber() {
        return accountNumber;
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
            System.out.println("Deposit amount must be greater than 0.");
        }
        return totalAmount;
    }

    @Override
    public int withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("Amount to withdraw must be greater than 0.");
        } else if (amount > totalAmount) {
            System.out.println("Your balance is insufficient!");
        } else {
            totalAmount -= amount;
        }
        return totalAmount;
    }

    @Override
    public void checkBalance(int accountNumber) {
        System.out.println("Your total balance is: " + totalAmount);

    }

    @Override
    public void accountDetail(int accountNumber) {
        System.out.println("\n\nName : "+getName());
        System.out.println("Account Number : " +getAccountNumber());
        System.out.println("Total Amount : " +totalAmount);
    }
}
