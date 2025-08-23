package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int accountNum = sc.nextInt();

        System.out.print("Enter account holder: ");
        sc.nextLine();
        String accountHolder = sc.nextLine();

        System.out.print("Is there na initial deposit (y/n)? ");
        char confirm = sc.next().charAt(0);
        if (confirm == 'y' || confirm == 'Y') {
            System.out.print("Enter initial deposit value: ");
            double initialValue = sc.nextDouble();
            account = new Account(accountNum, accountHolder, initialValue);
        } else {
            account = new Account(accountNum, accountHolder);
        }

        System.out.println();
        System.out.println("Account Data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("Updated account Data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("Updated account Data: ");
        System.out.println(account);

        sc.close();
    }
}
