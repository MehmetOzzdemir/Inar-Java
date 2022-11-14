package Chapters.Chapter09.Exercises_09_07;

public class Exercises_09_07 {
    public static void main(String[] args) {
        Account mehmet = new Account(1122,20_000,4.5);
        System.out.println("Account Date : "+mehmet.getDateCreated());
        System.out.println("Account ID : "+mehmet.getId());
        System.out.println("Account Balance : $"+mehmet.getBalance());
        System.out.println("Account Annually Interest Rate : %"+mehmet.getAnnualInterestRate());
        System.out.println("Account Monthly Interest : $"+mehmet.getMonthlyInterest());
        System.out.println("--------------------");
        System.out.println("Account Date : "+mehmet.getDateCreated());
        mehmet.withdraw(2_500);
        mehmet.deposit(3_000);
        System.out.println(mehmet.getBalance());
        System.out.println(mehmet.getMonthlyInterest());

    }
}
