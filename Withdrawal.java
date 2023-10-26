public class Withdrawal {
    private int accountNumber;
    private double amount;
    private Date date;

    public Withdrawal(int accountNumber, double amount, Date date) {
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.date = date;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
