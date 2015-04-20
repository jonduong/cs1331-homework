/**
 * Payment method of cash.
 *
 * @author Jonathan Duong
 * @version 1.00
 */
public class Cash implements PaymentMethod {
    private double cashOnHand;

    /**
     * Creates an cash class that has amount of cashOnHand.
     * @param cashOnHand the amount of cash you have on hand
     */
    public Cash(double cashOnHand) {
        this.cashOnHand = Math.abs(cashOnHand);
    }

    /**
     * Pays the amount of cash on hand. Throws NotEnoughFundsException
     * if there isn't enough cash on hand.
     * @param amount total cash to be paid
     */
    public void pay(double amount) throws NotEnoughFundsException {
        if (amount > cashOnHand) {
            throw new NotEnoughFundsException("Not enough cash.");
        } else {
            this.cashOnHand = cashOnHand - amount;
        }
    }
}
