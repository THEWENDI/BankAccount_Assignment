import java.util.ArrayList;

public class BankAccount{
    private double checkingBalance = 0.0;
    private double savingsBalance = 0.0;
    private static int totalAccounts = 0;
    private static double totalMoney =0.0;

    // constructor
    public BankAccount() {
        totalAccounts++;
    }

    // checking : getter 
    public double getcheckingBalance(){
        return this.checkingBalance;
    }
    // saving : getter 
    public double getsavingsBalance(){
        return this.savingsBalance;
    }
    // totalMoney : getter
    public static double gettotalMoney(){
        return totalMoney;
    }
    // Create a method that will allow a user to deposit money into either the checking 
    // or saving, be sure to add to total amount stored.
    public void setdeposit(String account, double amount){
        if(account == "checking"){
            this.checkingBalance += amount;
            totalMoney += amount;
        }else if (account == "saving"){
            this.savingsBalance += amount;
            totalMoney += amount;
        }else{
            System.out.println("Please select 'checking' or 'saving' account for deposit");
        }
    }

    // Create a method to withdraw money from one balance. Do not allow them to withdraw money 
    // if there are insufficient funds.
    public void setwithdraw(String account, double amount){
        if(account == "checking" && (this.checkingBalance - amount) >= 0){
            this.checkingBalance -= amount;
            totalMoney -= amount;
        }else if(account == "saving" && (this.savingsBalance - amount) >= 0){
            this.savingsBalance -= amount;
            totalMoney -= amount;
        }else if(account == "checking" && (this.checkingBalance - amount) < 0){
            System.out.println("Insufficient funds");
        }else if(account == "saving" && (this.savingsBalance - amount) < 0){
            System.out.println("Insufficient funds");
        }else{
            System.out.println("Please select 'checking' or 'saving' account for deposit");
        }
    }
    // Create a method to see the total money from the checking and saving
    public double accountsBalance(){
        return this.checkingBalance + this.savingsBalance;
    }







}