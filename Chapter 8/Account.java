import java.math.BigDecimal;

public class Account {
    private BigDecimal balance;

    public Account(BigDecimal initialBalance) {
        if (initialBalance.compareTo(BigDecimal.ZERO) > 0)
            balance = initialBalance;
    }

    public void credit(BigDecimal amount) {
        balance = balance.add(amount);
    }

    public BigDecimal getBalance() { return balance; }
}