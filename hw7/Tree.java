/**
 * Represents a the deck.
 *
 * @author Jonathan Duong
 * @version 1.00
 */
public class Tree extends Zone {
    /**
     * Creates a tree with a gnome and 9 keebles.
     */
    public Tree() {
        zone.add(new Gnome());
        zone.add(new Keeble());
        zone.add(new Keeble());
        zone.add(new Keeble());
        zone.add(new Keeble());
        zone.add(new Keeble());
        zone.add(new Keeble());
        zone.add(new Keeble());
        zone.add(new Keeble());
        zone.add(new Keeble());
    }
}
