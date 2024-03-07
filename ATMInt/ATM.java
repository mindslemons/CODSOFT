
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 1000000, deposit, withdraw;

        while (true) {
            System.out.println("Choose 1 for Deposit:");
            System.out.println("Choose 2 for Withdrawal:");
            System.out.println("Choose 3 for Balance:");
            System.out.println("Choose 4 for Exit:");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter amount to deposit:");
                    deposit = sc.nextInt();

                    balance = balance + deposit;
                    System.out.println("Your new balance is: " + balance);
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Enter amount to withdraw:");
                    withdraw = sc.nextInt();
                    if (balance >= withdraw) {
                        balance = balance - withdraw;
                        System.out.println("Your new balance is: " + balance);
                    } else {
                        System.out.println("Insufficient funds");
                    }
                    break;

                case 3:
                    System.out.println("Your balance is: " + balance);
                    System.out.println();
                    break;

                case 4:
                    sc.close(); // Close the Scanner before exiting
                    System.exit(0);
            }
        }
    }
}

