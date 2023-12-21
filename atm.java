package a3;

import java.util.Scanner;

public class ATM{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int balance = 10000;
        String username;
        int withdraw;

        System.out.println("***WELCOME TO ATM*******");

        System.out.println("Enter Account Name:");
        username = sc.nextLine();
        System.out.println("Enter Account Pin:");
        int userpin = sc.nextInt();

        if (userpin != 1011) {
            System.out.println("Check details");
            System.out.println("Exiting......");
            System.exit(0);
        } else {
            int count1 = 0;
            int count2 = 0;
            int count3 = 0;
            
            System.out.println("ACCEPTED!!");
            System.out.println("ENTER TODAY'S DATE [DAY MONTH YEAR] FORMAT..");
            
            int day = sc.nextInt();
            int month = sc.nextInt();
            int year = sc.nextInt();

            while (true) {
                System.out.println("ENTER 1 TO BALANCE");
                System.out.println("ENTER 2 TO WITHDRAW");
                System.out.println("ENTER 3 TO DEPOSIT");
                System.out.println("ENTER 4 TO TRANSFER");
                System.out.println("ENTER 5 TO SHOW TRANSACTION HISTORY");
                System.out.println("ENTER 6 TO EXIT");
                
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Balance: " + balance);
                        break;

                    case 2:
                        System.out.println("Withdrawal amount?");
                        withdraw = sc.nextInt();
                        if (withdraw > balance || balance == 0) {
                            System.out.println("Insufficient balance");
                            System.out.println("Enter amount less than: " + balance);
                            continue;
                        }
                        balance -= withdraw;
                        ++count1;
                        break;

                    case 3:
                        System.out.println("Deposit amount?");
                        int deposit = sc.nextInt();
                        balance += deposit;
                        System.out.println("Deposited..");
                        count2 = count2 + 1;
                        break;

                    case 4:
                        sc.nextLine();
                        System.out.println("Enter account to transfer:");
                        String username1 = sc.nextLine();
                        System.out.println("How much?");
                        int transfer1 = sc.nextInt();
                        if (transfer1 > balance || transfer1 == 0) {
                            System.out.println("Insufficient balance");
                            System.out.println("Enter amount less than: " + balance);
                            continue;
                        }
                        balance -= transfer1;
                        System.out.println("TRANSFERRED..");
                        ++count3;
                        break;

                    case 5:
                        System.out.println("WITHDRAWALS done: " + count1 + " times on " + day + "-" + month + "-" + year + "");
                        System.out.println("DEPOSITS done: " + count2 + " times on " + day + "-" + month + "-" + year + "");
                        System.out.println("TRANSFERS done: " + count3 + " times on " + day + "-" + month + "-" + year + "");
                        break;

                    case 6:
                        System.out.println("Exiting ATM. Goodbye!");
                        System.exit(0);
                }
            }
        }
    }
}
