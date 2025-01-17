public interface BankAppInterface {
    int deposit(int amount);
    int withdraw(int amount);
    void checkBalance(int accountNumber);
    void accountDetail(int accountNumber);
}
