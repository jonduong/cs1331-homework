/**
 * This is thrown when the item is not valid.
 *
 * @author Jonathan Duong
 * @version 1.00
 */
public class InvalidItemException extends Exception {
    /**
     * Creates a new InvalidItemException with the given message.
     * @param msg The message of the exception.
     */
    public InvalidItemException(String msg) {
        super(msg);
    }

    /**
     * Creates a new InvalidItemException.
     */
    public InvalidItemException() {
        super();
    }
}
