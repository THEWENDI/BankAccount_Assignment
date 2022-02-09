import java.util.ArrayList;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();

        account1.setdeposit("checking",700.00);
        account1.setwithdraw("checking",200.00);
        account1.setdeposit("saving",500.00);
        System.out.println(account1.getcheckingBalance());
        System.out.println(account1.accountsBalance());


        account2.setdeposit("checking",70.00);
        account2.setdeposit("saving",7.00);
        System.out.println(account2.accountsBalance());


        System.out.println(BankAccount.gettotalMoney());
    }

}