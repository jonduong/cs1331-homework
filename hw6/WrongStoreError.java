/**
 * This is thrown when a store other than ours tries to use the program.
 *
 * @author Jonathan Duong
 * @version 1.00
 */
public class WrongStoreError extends RuntimeException {
    /**
     * Creates a new WrongStoreError with the given message.
     * @param  msg The message of the exception.
     */
    public WrongStoreError(String msg) {
        super(msg);
    }

    /**
     * Creates a new ServerException.
     */
    public WrongStoreError() {
        super();
    }
}
