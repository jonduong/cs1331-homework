import java.time.LocalDate;

/**
 * Card that has additional attribute of expirationDate.
 *
 * @author Jonathan Duong
 * @version 1.00
 */
public class CreditCard extends Card {
    private LocalDate expirationDate;

    /**
     * Creates a credit card with attribute of expirationDate.
     * @param ownerName is the owner's name
     * @param balance is the total money on card
     * @param expirationDate is date the card expires
     */
    public CreditCard(String ownerName, double balance,
            LocalDate expirationDate) {
        super(ownerName, balance);
        this.expirationDate = expirationDate;
    }

    /**
     * Overrides pay from Card and adds expirationDate check.
     * @param amount total to be paid
     */
    public void pay(double amount) throws CardExpiredException,
            NotEnoughFundsException {
        if (LocalDate.now().isAfter(this.expirationDate)) {
            throw new CardExpiredException("Card expired on "
                + this.expirationDate + ".");
        } else {
            super.pay(amount);
        }
    }
}
