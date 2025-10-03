package services;

import exceptions.LimitExceededException;
import exceptions.NotEnoughBalanceException;
import model.entities.Account;

import java.util.Scanner;


public class AccountService {
    private Scanner sc;

    public AccountService(Scanner sc){
        this.sc = sc;
    }


    public Account createAccount(){
        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = sc.nextInt();

        System.out.print("Holder: ");
        sc.nextLine();
        String holder = sc.nextLine();

        System.out.print("Initial balance: ");
        double initialBalance = sc.nextDouble();

        System.out.print("Withdraw limit: ");
        double withdrawLimit = sc.nextDouble();


        return new Account(number, holder, initialBalance, withdrawLimit);
    }


    public void makeWithdraw(Account account){
        System.out.println();
        System.out.println("Enter amount for withdraw: ");
        double amount = sc.nextDouble();

        if(amount > account.getBalance()){
            throw new NotEnoughBalanceException("Not enough balance");
        }
        if(amount > account.getWithdrawLimit()){
            throw new LimitExceededException("The amount exceeds withdraw limit");
        }
        account.withdraw(amount);

    }

    public void showNewBalance(Account account){
        System.out.printf("New balance: %.2f", account.getBalance());
    }


}
