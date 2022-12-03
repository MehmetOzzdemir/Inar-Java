package Chapters.Chapter11.Exercises_11_03;

public class CheckingAccount extends Account{

    private double overDraftLimit;

    public CheckingAccount() {
        overDraftLimit=250;
    }

    public CheckingAccount(int id, double balance, double overDraftLimit) {
        super(id, balance);
        this.overDraftLimit = overDraftLimit;
    }

    public CheckingAccount(double overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }

    @Override
    public void withdraw(double withdrawAmount) {
        if(getBalance()-withdrawAmount>=0-overDraftLimit){
            setBalance(getBalance()-withdrawAmount);
        }else {
            System.out.println("Out Of Limits.");
        }
    }

    @Override
    public String toString() {
        return "Class : Checking Account \nBalance : "+getBalance()+"\nMonthly Interest : "+getMonthlyInterest()+"\nDate Created : "+getDateCreated();

    }
}
