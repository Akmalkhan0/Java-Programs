import java.util.*;
import java.util.concurrent.locks.*;

class Account {
    private String name;
    private String username;
    private String password;
    private double balance;
    private List<String> miniStatement;
    private final Lock lock = new ReentrantLock(); // for deposit/withdraw synchronization

    public Account(String name, String username, String password, double initialBalance) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.balance = initialBalance;
        this.miniStatement = new ArrayList<>();
        miniStatement.add("Account created with balance: " + initialBalance);
    }

    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getName() { return name; }

    // Only ONE thread can deposit/withdraw at a time
    public void deposit(double amount) {
        lock.lock();
        try {
            balance += amount;
            miniStatement.add("Deposited: " + amount + " | Balance: " + balance);
            System.out.println("Deposited " + amount + ". New Balance: " + balance);
        } finally {
            lock.unlock();
        }
    }

    public void withdraw(double amount) {
        lock.lock();
        try {
            if (balance >= amount) {
                balance -= amount;
                miniStatement.add("Withdrew: " + amount + " | Balance: " + balance);
                System.out.println("Withdrew " + amount + ". New Balance: " + balance);
            } else {
                System.out.println("Insufficient balance!");
            }
        } finally {
            lock.unlock();
        }
    }

    // Multiple threads can call these safely
    public synchronized void showBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public synchronized void showMiniStatement() {
        System.out.println("----- Mini Statement for " + name + " -----");
        for (String entry : miniStatement) {
            System.out.println(entry);
        }
    }

    public synchronized void viewProfile() {
        System.out.println("Name: " + name);
        System.out.println("Username: " + username);
        System.out.println("Balance: " + balance);
    }
}

public class Bank {
    private static Map<String, Account> accounts = new HashMap<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n==== Welcome to Bank Management System ====");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: register(); break;
                case 2: login(); break;
                case 3: System.out.println("Thank you for using the system!"); return;
                default: System.out.println("Invalid choice!");
            }
        }
    }

    private static void register() {
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Username: ");
        String username = sc.nextLine();
        if (accounts.containsKey(username)) {
            System.out.println("Username already exists!");
            return;
        }
        System.out.print("Enter Password: ");
        String password = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        accounts.put(username, new Account(name, username, password, balance));
        System.out.println("Account registered successfully!");
    }

    private static void login() {
        System.out.print("Enter Username: ");
        String username = sc.nextLine();
        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        Account acc = accounts.get(username);
        if (acc != null && acc.getPassword().equals(password)) {
            System.out.println("Login successful! Welcome " + acc.getName());
            accountMenu(acc);
        } else {
            System.out.println("Invalid username or password!");
        }
    }

    private static void accountMenu(Account acc) {
        while (true) {
            System.out.println("\n--- Account Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Show Balance");
            System.out.println("4. Mini Statement");
            System.out.println("5. View Profile");
            System.out.println("6. Logout");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: 
                    System.out.print("Enter amount to deposit: ");
                    double dep = sc.nextDouble();
                    new Thread(() -> acc.deposit(dep)).start(); // simulate parallel users
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double wit = sc.nextDouble();
                    new Thread(() -> acc.withdraw(wit)).start();
                    break;
                case 3: new Thread(acc::showBalance).start(); break;
                case 4: new Thread(acc::showMiniStatement).start(); break;
                case 5: new Thread(acc::viewProfile).start(); break;
                case 6: System.out.println("Logging out..."); return;
                default: System.out.println("Invalid choice!");
            }
        }
    }
}
