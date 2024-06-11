package tnsif.one;

public class BankAccount {
	
	
	private String accName;
    private double balance;

    // Constructor
    public BankAccount(String accName, double balance) {
        this.accName = accName;
        this.balance = balance;
    }

    // Getter for accName
    public String getAccName() {
        return accName;
    }

    // Setter for accName
    public void setAccName(String accName) {
        this.accName = accName;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // toString method
    @Override
    public String toString() {
        return "BankAccount{" +
                "accName='" + accName + '\'' +
                ", balance=" + balance +
                '}';
    }

    // Withdraw method with LowBalanceException
    public void withdraw(double amount) throws LowBalanceException {
        if (balance - amount < 1000) {
            throw new LowBalanceException("Withdrawal would result in balance less than 1000.");
        } else {
            balance -= amount;
        }
    }
}
