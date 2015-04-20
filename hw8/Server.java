import java.util.Collections;
import java.util.ArrayList;
/**
 * This represents a server class.
 *
 * @author Jonathan Duong
 * @version 1.00
 */
public class Server {
    protected ArrayList<Message> server;
    /**
     * This creates a server.
     */
    public Server() {
        Person sam = new Person("Sam", "sammy@gmail.com");
        Person mike = new Person("Mike", "likemike@gmail.com");
        Person jim = new Person("Jim", "jimster@gmail.com");
        Person me = new Person("Jon", "diehardslacker@gmail.com");
        Person dr = new Person("Kagami", "kagami@gmail.com");
        ArrayList<Person> combo1 = new ArrayList<Person>();
        combo1.add(sam);
        combo1.add(mike);
        combo1.add(me);
        ArrayList<Person> combo2 = new ArrayList<Person>();
        combo2.add(sam);
        combo2.add(jim);
        combo2.add(me);
        ArrayList<Person> combo3 = new ArrayList<Person>();
        combo3.add(mike);
        combo3.add(jim);
        combo3.add(me);
        ArrayList<Person> combo4 = new ArrayList<Person>();
        combo4.add(mike);
        combo4.add(jim);
        combo4.add(sam);
        combo4.add(me);
        server = new ArrayList<Message>();
        server.add(new Message(sam, combo3, "Finishing Homework",
                "SOOOOO....How bout that study group :P"));
        server.add(new Message(jim, combo1, "Study Group Activities",
                "Never, under any circumstances will I ever do another study"
                + " group with sam."));
        server.add(new Message(mike, combo2, "Check this out",
                "[insert lame link here]"));
        server.add(new Message(dr, combo4, "Your Homework is due tomorrow",
                "[useless information that may or may not relate to school]"));
        //4 emails should be enough...
        this.server = server;
    }

    /**
     * This selects a random message and removes it while returning the email.
     *
     * @return toReturn is the message to be returned and removed
     */
    public Message newMail() {
        Collections.shuffle(server);
        Message toReturn = server.get(0);
        toReturn.setDate();
        server.remove(0);
        return toReturn;
    }
}
