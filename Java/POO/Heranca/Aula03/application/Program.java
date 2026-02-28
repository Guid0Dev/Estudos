package POO.Heranca.Aula03.application;

import POO.Heranca.Aula03.entities.Account;
import POO.Heranca.Aula03.entities.BusinessAccount;
import POO.Heranca.Aula03.entities.SavingAccount;

public class Program {
    public static void main(String[] args) {
        BusinessAccount acc = new BusinessAccount();
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        //UPCASTING
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "bob", 0.0, 200.0);
        Account acc3 = new SavingAccount(1004,"Anna",0.0,0.01);


        //DOWNCASTING
        BusinessAccount acc4 = (BusinessAccount)acc2; 
        acc4.loan(100.0);

        //BusinessAccount acc5 = (BusinessAccount)acc3;
        if(acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount)acc3;
            acc5.loan(200.0);
            System.out.print("Loan!");
        }
        if(acc3 instanceof SavingAccount){
            SavingAccount acc5 = (SavingAccount)acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }
    }
}
