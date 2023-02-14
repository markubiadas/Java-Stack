import java.util.ArrayList;

public class BankAccountTest {
    public static void main(String[] args){

        BankAccount bankAccount1 = new BankAccount(100, 100);
        bankAccount1.depositToSaving(200);
        bankAccount1.withdrawMoney(101);

        System.out.println("Checking Balance: $" + bankAccount1.getCheckingBalance());
        System.out.println("Saving Balance: $" + bankAccount1.getSavingBalance());
        System.out.println("Total Balance: $" + bankAccount1.showAccountBalance());
    }
}