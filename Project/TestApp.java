package Project;

public class TestApp {

    static class Account {
        // Data Security
        private double balance;

        // Method to deposit money with authentication
        public void setBalance(double balance) {
            boolean result = validate("ravi", "ravi123");

            if (result) {
                this.balance += balance;
                System.out.println("Credited to the account: " + balance);
            } else {
                System.out.println("Invalid username and password. Try again...");
            }
        }

        // Method to withdraw money with authentication
        public double getBalance(double amount) {
            boolean result = validate("ravi", "ravi123");

            if (result) {
                if (balance >= amount) {
                    balance -= amount;
                    System.out.println("Withdrawing " + amount + " Amount");
                    return amount;
                } else {
                    System.out.println("Insufficient balance.");
                    return 0.0;
                }
            } else {
                System.out.println("Invalid username and password. Try again...");
                return 0.0;
            }
        }

        // Private method for validation
        private boolean validate(String userName, String password) {
            return userName.equalsIgnoreCase("ravi") && password.equals("ravi123");
        }
    }

    public static void main(String[] args) {
        Account ac = new Account();

        ac.setBalance(1000.0); // Deposit money
        double withdrawn = ac.getBalance(500.0); // Withdraw money
        System.out.println("Amount withdrawn: " + withdrawn);
    }
}
