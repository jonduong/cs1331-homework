/**
 * This is thrown when the credit card is expired.
 *
 * @author Jonathan Duong
 * @version 1.00
 */
public class CardExpiredException extends PaymentFailedException {
    /**
     * Creates a new CardExpiredException with the given message.
     * @param msg The message of the exception.
     */
    public CardExpiredException(String msg) {
        super(msg);
    }

    /**
     * Creates a new CardExpiredException and prints date expired.
     */
    public CardExpiredException() {
        super();
    }
}
