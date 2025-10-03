package application;

import exceptions.LimitExceededException;
import exceptions.NotEnoughBalanceException;
import model.entities.Account;
import services.AccountService;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Controller {
        private AccountService accountService;
        private Scanner sc;

        public Controller(AccountService accountService, Scanner sc){
            this.accountService = accountService;
            this.sc = sc;
        }

        void run() {
            try {
                Account account = accountService.createAccount();
                accountService.makeWithdraw(account);
                accountService.showNewBalance(account);
            }
            catch (NotEnoughBalanceException | LimitExceededException e) {
                System.out.println("Withdraw Error: " + e.getMessage());
            }
            catch (InputMismatchException e) {
                System.out.println("Error: Invalid input value");
            }
            catch (RuntimeException e) {
                System.out.println("Error: Unknown error\n" + Arrays.toString(e.getStackTrace()));
            }

        }
}
