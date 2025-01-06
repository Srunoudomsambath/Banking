import java.time.LocalDateTime;
import java.util.Date;
interface BankService{
    void withdrawal(double cash);
    void deposit(double cash);
    void showBalance();
}



 class Account implements BankService {
    private double cash = 0.0;
    private String accountName;
    public Account(String accountName) {
        this.accountName = accountName;
    }
    public Account() {}
        @Override
        public void withdrawal ( double cash) {
            if (cash > this.cash) {
                System.out.println("[!] Cannot withdraw, because your balance is not enough");
                return;
            }
            this.cash -= cash;
            System.out.println("[+]Your transaction in " + accountName + "account" + "withdrawn successfully ");
        }
        @Override
        public void deposit ( double cash){
        if(cash<=0.0){
            System.out.println("[!] Cannot deposit");
        }
        this.cash+=cash;
            System.out.println("[+] Your transaction in " + accountName + "account " + "deposited successfully");
        }

        @Override
        public void showBalance () {
            System.out.println("================================");
            System.out.println("[+] Your balance : " + this.cash + "$");

        }
    }


class SavingAccount extends Account{
    public SavingAccount(String accountName){
        super(accountName);
    }

}
class CreditCardAcc extends Account{
    private String cardNumber;
    private Date expireDate;
    private String secretNumber;
    public CreditCardAcc(String accountName, LocalDateTime localDateTime, String number){
        super(accountName);
    }


}

public class Bank {
    public static void main(String [] args){
    Account savingAccount = new SavingAccount("sambath");
    savingAccount.deposit(30.0);
    savingAccount.withdrawal(20);
    savingAccount.showBalance();
    Account CreditCardAcc = new CreditCardAcc("527-998-098-440-8225",
            LocalDateTime.of(2026,1,1,1,1), "333");
    CreditCardAcc.deposit(10);
    CreditCardAcc.withdrawal(2);
    CreditCardAcc.showBalance();
    }
}
