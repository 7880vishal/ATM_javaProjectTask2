
    import java.util.*;
public class ATM {
    public static void main(String args[]) {
        int balance = 1000, withdraw, deposit;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Automated Teller Machine");
          System.out.println("Choose 1 for withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for check balance");
            System.out.println("Choose 4 for exit");
            System.out.println("Choose the operation you want to perform:");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("enter money to be withdraw:");
                    withdraw = sc.nextInt();
                    if (balance >= withdraw) {
                        balance = balance - withdraw;
                        System.out.println("please collect your money");
                    } else {
                        System.out.println("insufficient balance");
                    }
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println("enter money to be  deposited:");
                    deposit = sc.nextInt();
                    balance = balance + deposit;
                    System.out.println("your money has been successfully deposited");
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println("balance : " + balance);
                    System.out.println(" ");
                    break;
                case 4:
                    System.exit(0);


            }
        }
    }
}