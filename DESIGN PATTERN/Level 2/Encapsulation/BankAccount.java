// Create a BankAccount class with private attributes and public methods deposit(),withdraw(), checkBalance().

public class BankAccount {
    private double balance;

    public void deposite(double amount) {
        balance+= amount;
        System.out.println("Deposited amount: "+amount);

    }

    public void withdraw(double amount) {
        balance-= amount;
        if(balance < amount) {
            System.out.println("Insufficent balance");
        } else {
            System.out.println("Withdrawn amount: "+amount);
        }
    }

    public double checkBalance() {
        return balance;
        
    }

    public static void main(String[] args) {
        BankAccount ba= new BankAccount();
        ba.deposite(10000);
        ba.withdraw(4000);
        System.out.println("Final Balance: "+ba.checkBalance());
    }
}
