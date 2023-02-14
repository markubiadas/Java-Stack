import java.util.ArrayList;

public class BankAccount {

    private double checkingBalance;
    private double savingBalance;

    private static int numberOfAccounts;
    private static double totalBalance = 0;

    

    // Constructor
    public BankAccount(double checkingBalance, double savingBalance) {
        this.checkingBalance = checkingBalance;
        this.savingBalance = savingBalance;
        numberOfAccounts++;
        totalBalance += checkingBalance + savingBalance;
    }



    // Getters and Setters

    // Create a getter method for the user's checking account balance.
    public double getCheckingBalance(){
        return this.checkingBalance;
    }

    // Create a getter method for the user's saving account balance.
    public double getSavingBalance(){
        return this.savingBalance;
    }

    // Methods

    // Create a method that will allow a user to deposit money into either the checking or saving, be sure to add to total amount stored.
    public void depositToChecking(double depositToChecking){
        checkingBalance += depositToChecking;
        totalBalance += depositToChecking;
    }

    public void depositToSaving(double depositToSaving){
        savingBalance += depositToSaving;
        totalBalance += depositToSaving;
    }

    //Create a method to withdraw money from one balance. Do not allow them to withdraw money if there are insufficient funds.
    public void withdrawMoney(double withdrawMoney){
        if(checkingBalance - withdrawMoney < 0){
            System.out.println("Insufficient funds. Please put a number smaller than your current balance.");
        } 
        else {
            checkingBalance -= withdrawMoney;
            totalBalance -= withdrawMoney;
        }
    }

    // Create a method to see the total money from the checking and saving.
    public double showAccountBalance(){
        double totalAccountBalance = checkingBalance + savingBalance;
        return totalAccountBalance;
    }

}