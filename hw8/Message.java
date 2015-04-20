import java.time.LocalDateTime;
import java.util.ArrayList;
/**
 * This represents a message.
 *
 * @author Jonathan Duong
 * @version 1.00
 */
public class Message {
    protected Person sender;
    protected ArrayList<Person> recipients;
    protected String subject;
    protected LocalDateTime date;
    protected String body;
    /**
     * This creates the message.
     *
     * @param sender is the person sending the message
     * @param recipients is the people receiving the message
     * @param subject is the subject of the message
     * @param body is the body of the message
     */
    public Message(Person sender, ArrayList<Person> recipients, String subject,
            String body) {
        this.sender = sender;
        this.recipients = recipients;
        this.subject = subject;
        date = LocalDateTime.now();
        this.date = date;
        this.body = body;
    }

    /**
     * This returns the sender.
     *
     * @return sender is the person sending it
     */
    public Person getSender() {
        return sender;
    }

    /**
     * This returns the recipients.
     *
     * @return recipients is the people receiving the message
     */
    public ArrayList<Person> getRecipients() {
        return recipients;
    }

    /**
     * This returns the subject.
     *
     * @return subject is the subject of the message
     */
    public String getSubject() {
        return subject;
    }

    /**
     * This returns the date the message is sent.
     *
     * @return date is the date message is sent.
     */
    public LocalDateTime getDate() {
        return date;
    }

    /**
     * This sets the date at release.
     */
    public void setDate() {
        date = LocalDateTime.now();
    }

    /**
     * This returns the body of the message.
     *
     * @return body is the body of the message
     */
    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        return sender.getName() + "\n  " + subject;
    }
}
