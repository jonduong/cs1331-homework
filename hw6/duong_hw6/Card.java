/**
 * Makes abstact class for payment methods of cards.
 *
 * @author Jonathan Duong
 * @version 1.00
 */
public abstract class Card implements PaymentMethod {
    protected String ownerName;
    protected double balance;

    /**
     * Makes a card object.
     * @param ownerName name of owner of card
     * @param balance total money on card
     */
    public Card(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }

    /**
     * Pays the amount. Throws NotEnoughFundsException if not enough money.
     * @param amount total to be paid
     */
    public void pay(double amount) throws NotEnoughFundsException,
            CardExpiredException {
        if (amount > balance) {
            throw new NotEnoughFundsException("Not enough in balance.");
        } else {
            this.balance = balance - amount;
        }
    }
}
