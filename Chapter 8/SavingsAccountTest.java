public class SavingsAccountTest {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);
 
        SavingsAccount.modifyInterestRate(0.04);
        for (int month = 1; month <= 12; month++) {
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
        }
        System.out.printf("After 12 months at 4%%: saver1=$%.2f saver2=$%.2f%n",
            saver1.getSavingsBalance(), saver2.getSavingsBalance());
 
        SavingsAccount.modifyInterestRate(0.05);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.printf("After 1 more month at 5%%: saver1=$%.2f saver2=$%.2f%n",
            saver1.getSavingsBalance(), saver2.getSavingsBalance());
    }
}
 