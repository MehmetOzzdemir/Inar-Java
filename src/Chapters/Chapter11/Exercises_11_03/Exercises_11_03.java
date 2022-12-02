package Chapters.Chapter11.Exercises_11_03;

public class Exercises_11_03 {
    public static void main(String[] args) {
        Account account1=new Account(123,1000);
        CheckingAccount checkingAccount=new CheckingAccount(456,10000,200);
        SavingAccount savingAccount=new SavingAccount(232,2500);
        System.out.println("----------------");
        account1.setAnnuallyInterestRate(2.5);
        account1.withdraw(200);
        System.out.println(account1);

        System.out.println("---------------");

        checkingAccount.withdraw(3000);
        checkingAccount.setAnnuallyInterestRate(2.69);
        System.out.println(checkingAccount);
        System.out.println("---------------");
        savingAccount.deposit(5000);
        savingAccount.setAnnuallyInterestRate(3.5);
        System.out.println(savingAccount);
    }
}
