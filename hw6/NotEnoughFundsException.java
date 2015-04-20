/**
 * This is thrown when there isn't enough money.
 *
 * @author Jonathan Duong
 * @version 1.00
 */
public class NotEnoughFundsException extends PaymentFailedException {
    /**
     * Creates a new NotEnoughFundsException with the given message.
     * @param msg The message of the exception.
     */
    public NotEnoughFundsException(String msg) {
        super(msg);
    }

    /**
     * Creates a new PaymentFailedException.
     */
    public NotEnoughFundsException() {
        super();
    }
}
