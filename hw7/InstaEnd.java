/**
 * Represents an InstaEnd card.
 *
 * @author Jonathan Duong
 * @version 1.00
 */
public class InstaEnd extends Card {
    /**
     * Creates an InstaEnd Card.
     */
    public InstaEnd() {
        super("Instant End", "Play this card and you win.",
                "Only the lucky go after this card.", true, 10);
    }

    /**
     * Person who plays this automatically wins.
     *
     * @param p is game to be affected
     */
    public void play(PlasterClash p) {
        super.play(p);
        p.currentPlayer().getTrashHeap().add(new Gnome());
        p.currentPlayer().getTrashHeap().add(new Gnome());
        p.currentPlayer().getTrashHeap().add(new Gnome());
        p.currentPlayer().getTrashHeap().add(new Gnome());
        p.currentPlayer().getTrashHeap().add(new Gnome());
        p.currentPlayer().getTrashHeap().add(new Gnome());
        p.currentPlayer().getTrashHeap().add(new Gnome());
        p.currentPlayer().getTrashHeap().add(new Gnome());
        p.currentPlayer().getTrashHeap().add(new Gnome());
        p.currentPlayer().getTrashHeap().add(new Gnome());
        p.addGnomeCount(10);
    }
}
