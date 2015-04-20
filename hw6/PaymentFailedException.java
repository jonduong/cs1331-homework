/**
 * This is thrown when somethings goes wrong with payment.
 *
 * @author Jonathan Duong
 * @version 1.00
 */
public class PaymentFailedException extends Exception {
    /**
     * Creates a new PaymentFailedException with the given message.
     * @param msg The message of the exception.
     */
    public PaymentFailedException(String msg) {
        super(msg);
    }

    /**
     * Creates a new PaymentFailedException.
     */
    public PaymentFailedException() {
        super();
    }
}
