package Chapters.Chapter11.Exercises_11_03;

public class SavingAccount extends Account{

    public SavingAccount(){

    }

    public SavingAccount(int id, double balance) {
        super(id, balance);
    }

    @Override
    public void withdraw(double withdrawAmount) {
        if(getBalance()-withdrawAmount>=0){
            setBalance(getBalance()-withdrawAmount);
        }else{
            System.out.println("You do not Have ₺"+withdrawAmount+"in your Account");
        }
    }

    @Override
    public String toString() {
        return "Class : Saving Account \nBalance : "+getBalance()+"\nMonthly Interest : "+getMonthlyInterest()+"\nDate Created : "+getDateCreated();
    }
}
