import java.util.ArrayList;
/**
 * This represents a gnome card.
 *
 * @author Jonathan Duong
 * @version 1.00
 */
public class Gnome extends Card {
    /**
     * This makes the card.
     */
    public Gnome() {
        super("Gnome", "Worth points in the tree. Play: Everyone discards a"
                + "card at random, and gnome removed from play.",
                "Dumb worthless creatures", true, 3);
    }

    /**
     * Makes everyone else discard at random.
     *
     * @param p is game to be affected
     */
    public void play(PlasterClash p) {
        super.play(p);
        ArrayList<Player> guys = p.opponents();
        for (Player guy : guys) {
            guy.discardRandom();
        }
    }
}
