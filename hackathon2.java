import java.util.*;
    class Bankaccount {
        private String accountNumber;
        private String accountHolderName;
        private double balance;
        public Bankaccount(String accountNumber, String accountHolderName, double balance) {
            this.accountNumber= accountNumber;
            this.accountHolderName= accountHolderName;
            this.balance= balance;
        }
        public void deposit(double amount) {
            if (amount > 0) {
                balance +=amount;
                System.out.println("Successfully deposited : " +amount);
            }
            else {
                System.out.println("Invalid deposit!");
            }
        }
        public void withdraw(double amount) {
            if (amount>0 && amount<= balance) {
                balance -= amount;
                System.out.println("Successfully withdrawn : " +amount);
            }
            else {
                System.out.println("Insufficient fund!");
            }
        }
        public void checkBalance() {
            System.out.println("Current balance : " +balance);
        }
        public void displayAccount() {
            System.out.println("Account Number : " +accountNumber);
            System.out.println("Account Holder Name : " +accountHolderName);
            System.out.println("Balance : " +balance);
        }
    }
    public class hackathon2 {
        public static void perfromDeposit(Bankaccount account, Scanner obj1) {
            System.out.println("Enter amount to deposit : ");
            double amount = obj1.nextDouble();
            account.deposit(amount);
        }
        public static void performWithdrawl(Bankaccount account, Scanner obj1) {
            System.out.println("Enter amount to withdraw : ");
            double amount = obj1.nextDouble();
            account.withdraw(amount);
        }
        public static void main(String[] args) {
            Scanner obj1 = new Scanner(System.in);
            System.out.println("Enter account number : ");
            String accountNumber = obj1.nextLine();
            System.out.println("Enter account holder name : ");
            String accountHolderName = obj1.nextLine();
            System.out.println("Enter initial balance : ");
            double balance = obj1.nextDouble();
            Bankaccount account = new Bankaccount(accountNumber, accountHolderName, balance);
            while (true) {
                System.out.println("\n1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Check Balance");
                System.out.println("4. Display Account Details");
                System.out.println("5. Exit");
                System.out.print("Enter your choice : ");
                int choice = obj1.nextInt();
                switch (choice) {
                    case 1:
                        perfromDeposit(account, obj1);
                        break;
                    case 2:
                        performWithdrawl(account, obj1);
                        break;
                    case 3:
                        account.checkBalance();
                        break;
                    case 4:
                        account.displayAccount();
                        break;
                    case 5:
                        System.out.println("You chose to Exit");
                        return;
                    default:
                        System.out.println("Invalid choice!");
                }
            }
        }
    }
