// 8.6  
// Create class SavingsAccount with static annualInterestRate, instance savingsBalance, calculateMonthlyInterest, and static modifyInterestRate. Test with two accounts over 12 months at 4%, then one more month at 5%.


class SavingsAccount {
    private double savingsBalance;
    private static double annualInterestRate;
 
    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }
 
    public double calculateMonthlyInterest() {
        double interest = savingsBalance * (annualInterestRate / 12);
        savingsBalance += interest;
        return interest;
    }
 
    public static void modifyInterestRate(double newRate) {
        annualInterestRate = newRate;
    }
 
    public double getSavingsBalance() { return savingsBalance; }
}

