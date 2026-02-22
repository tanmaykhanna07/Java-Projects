import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean check = true;
        Scanner input = new Scanner(System.in);

        AccountManager manager = new AccountManager();

        try {
            manager.toRead();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }

        while (check) {
            try {
                System.out.println("Choose your task from options below\n");
                System.out
                        .println("1. Add account\n2. View Balance\n3. Withdraw amount\n4. Deposit money\n5. Exit\n: ");
                int choice = Integer.parseInt(input.nextLine());

                if (choice == 1) {
                    System.out.println("Enter name of the account holder: ");
                    String name = input.nextLine();
                    System.out.println("Enter 16 digit Card Number of the account holder: ");
                    String cardNumber = input.nextLine();
                    System.out.println("Enter initial balance of the account holder");
                    int initialBalance = Integer.parseInt(input.nextLine());

                    try {
                        manager.addAccount(name, cardNumber, initialBalance);
                        System.out.println("Successfully added account in the database");
                    } catch (InvalidAccountNumberException e) {
                        System.out.println(e);
                    } catch (NegativeBalanceException e) {
                        System.out.println(e);
                    }
                } else if (choice == 2) {
                    System.out.println("Enter your card number: ");
                    String cardNumber = input.nextLine();
                    try {
                        System.out.println(manager.viewBalance(cardNumber));
                    } catch (AccountNotFoundException e) {
                        System.out.println(e);
                    }
                } else if (choice == 3) {
                    System.out.println("Enter your card number: ");
                    String cardNumber = input.nextLine();
                    System.out.println("Enter the money you want to withdraw from your account: ");
                    int withdrawAmount = Integer.parseInt(input.nextLine());
                    try {
                        manager.withdrawMoney(withdrawAmount, cardNumber);
                        System.out.println("Succesfully withdrawed amount");
                    } catch (InsufficientFundsException e) {
                        System.out.println(e);
                    } catch (AccountNotFoundException e) {
                        System.out.println(e);
                    }
                } else if (choice == 4) {
                    System.out.println("Enter your card number: ");
                    String cardNumber = input.nextLine();
                    System.out.println("Enter the money you want to deposit into your account: ");
                    int depositAmount = Integer.parseInt(input.nextLine());
                    try {
                        manager.depositMoney(depositAmount, cardNumber);
                        System.out.println("Successfully deposited money");
                    } catch (InvalidTransactionException e) {
                        System.out.println(e);
                    } catch (AccountNotFoundException e) {
                        System.out.println(e);
                    }
                } else if (choice == 5) {
                    try {
                        manager.toWrite();
                    } catch (FileNotFoundException e) {
                        System.out.println(e);
                    } catch (IOException e) {
                        System.out.println(e);
                    }
                    input.close();
                    check = false;
                }

            } catch (NumberFormatException e) {
                System.out.println("Enter balance as integer");
                e.printStackTrace();
            }
        }
    }
}