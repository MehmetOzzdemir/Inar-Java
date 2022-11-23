package Chapters.Chapter10.Exercises_10_07;

import Chapters.Chapter09.Exercises_09_07.Account;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Exercises_10_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Account[] accounts = getAccounts(10);
        ATMMachine(accounts,input);

    }

    public static void ATMMachine(Account []accounts,Scanner input){
        int choice =0;
        while (true){
            System.out.print("Enter An ID : ");
            int id =input.nextInt();
            while (id<11 && id>0){
                displayMenu();
                System.out.println("Enter A Choice : ");
                choice = input.nextInt();
                if (choice == 1) {
                    displayBalance(accounts[id]);
                    System.out.println();
                } else if (choice == 2) {
                    accounts[id].withdraw(enterWithdrawAccount(accounts[id], input));
                    System.out.println();
                } else if (choice == 3) {
                    accounts[id].deposit(enterDepositAmount(input));
                    System.out.println();
                } else if (choice == 4) {
                    break;
                } else {
                    System.out.println("Invalid choice!!");
                }
            }
            if(id<0 || id>10){
                System.out.println("Invalid ID Number");
            }
                System.out.println("Do You Want To check Another Account Y/N : ");
                char c=input.next().toUpperCase().charAt(0);

                if(c=='N'){
                    break;
                }else if(c=='Y'){
                    continue;
                }else {
                    System.out.println("Invalid Value.Please just Y/N");
                    break;
                }
            }
    }

    public static Account[] getAccounts(int i) {
        Account[] accounts = new Account[i];
        for (int j = 0; j < i; j++) {
            accounts[j] = new Account(j, 100);
        }
        return accounts;
    }
    public static double enterDepositAmount(Scanner input ){
        System.out.print("Enter The Amount of Deposit ₺ : ");
        double deposit =input.nextDouble();
        return deposit;
    }
    public static double enterWithdrawAccount(Account account,Scanner input ){
        while (true){
            System.out.println("Enter The Amount Of Withdraw ₺ : ");
            double withdraw =input.nextDouble();
            if(withdraw<= account.getBalance()){
                return withdraw;
            }
            System.out.println();
            System.out.println("You Do Not Have ₺"+withdraw);
            System.out.println("Your Maxiumum Amount Can be ₺"+account.getBalance());
            System.out.println();
        }


    }
    public static void displayBalance(Account account){
        System.out.println("The balance is ₺ "+account.getBalance());
    }

    public static void displayMenu() {
        System.out.println("Main Menu");
        System.out.println("1: check balance");
        System.out.println("2: withdraw");
        System.out.println("3: deposit");
        System.out.println("4: exit");
    }

}
