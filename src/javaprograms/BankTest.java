
package javaprograms;

class BankAccount {
    private int accountNumber;
    private double balance;

    public BankAccount(int accNo, double bal) {
        accountNumber = accNo;
        balance = bal;
    }

    public void deposit(double amt) {
        balance += amt;
    }

    public void withdraw(double amt) {
        if (amt <= balance)
            balance -= amt;
        else
            System.out.println("Insufficient balance");
    }

    public void display() {
        System.out.println("Balance = " + balance);
    }
}

public class BankTest {
    public static void main(String[] args) {
        BankAccount b = new BankAccount(101, 1000);
        b.deposit(500);
        b.withdraw(300);
        b.display();
    }
}
    

