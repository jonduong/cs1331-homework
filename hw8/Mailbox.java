import java.util.HashSet;
import java.util.Set;
/**
 * This represents a mailbox class.
 *
 * @author Jonathan Duong
 * @version 1.00
 */
public class Mailbox {
    protected String name;
    protected Set<Message> messages;
    /**
     * This created the mailbox.
     *
     * @param name is the name of the mailbox
     */
    public Mailbox(String name) {
        this.name = name;
        messages = new HashSet<Message>();
        this.messages = messages;
    }

    /**
     * This returns the name of the mailbox.
     *
     * @return name is the name of the mailbox
     */
    public String getName() {
        return name;
    }

    /**
     * This returns the set of messages.
     *
     * @return messages is the set of messages in the mailbox
     */
    public Set<Message> getMessages() {
        return messages;
    }

    /**
     * This adds the message to the mailbox.
     *
     * @param message is message to be added
     */
    public void add(Message message) {
        messages.add(message);
    }

    /**
     * This removes the message from the mailbox.
     *
     * @param message is message to be removed
     */
    public void remove(Message message) {
        messages.remove(message);
    }

    /**
     * This checks if the message is in the mailbox or not.
     *
     * @param message to be checked
     * @return true if message is in, false otherwise
     */
    public boolean isIn(Message message) {
        for (Message messen : messages) {
            if (messen == message) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return name;
    }
}
