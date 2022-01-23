package chapterFour;

import java.util.Scanner;

public class CreditLimitCalculator {
    public void calculateBalance(){
        Scanner scanner = new Scanner(System.in);
        int account;
        int oldBalance;
        int charges;
        int credits;
        int creditLimit;
        int newBalance;

        System.out.print("Enter your Account Number (or -1 to quit): ");
        account = scanner.nextInt();

        while (account != -1){
            System.out.print("Enter your balance: ");
            oldBalance = scanner.nextInt();

            System.out.print("Enter charges: ");
            charges = scanner.nextInt();

            System.out.print("Enter total credit: ");
            credits = scanner.nextInt();

            System.out.print("Enter credit limit: ");
            creditLimit = scanner.nextInt();

            newBalance = oldBalance + charges - credits;
            System.out.printf("New Balance is %d\n", newBalance);

            if (newBalance > creditLimit)
                System.out.println("Credit limit exceeded");

            System.out.print("\nEnter Account Number (or -1 to quit): ");
            account = scanner.nextInt();
        }
    }
}