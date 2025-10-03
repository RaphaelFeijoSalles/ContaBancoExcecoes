package application;

import services.AccountService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Controller controller = new Controller(new AccountService(sc), sc);
        controller.run();
        sc.close();

    }
}