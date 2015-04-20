/**
 * Represents a card.
 *
 * @author Jonathan Duong
 * @version 1.00
 */
public abstract class Card {
    protected String name;
    protected String description;
    protected String flavor;
    protected int cost;
    protected boolean gnome;

    /**
     * Makes a card.
     *
     * @param name the name of the card
     * @param description what the card does
     * @param flavor useless text
     * @param gnome tells to count as gnome or not
     * @param cost keeble cost of card
     */
    public Card(String name, String description, String flavor, boolean gnome,
            int cost) {
        this.name = name;
        this.description = description;
        this.flavor = flavor;
        this.gnome = gnome;
        this.cost = cost;
    }

    /**
     * Returns the name of card.
     *
     * @return name of card
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the description of card.
     *
     * @return description of card
     */
    public String getDescription() {
        return description;
    }

    /**
     * Returns the flavor text of card.
     *
     * @return flavor text of card
     */
    public String getFlavor() {
        return flavor;
    }

    /**
     * Returns whether of not the card is a gnome.
     *
     * @return gnome or not
     */
    public boolean isScorable() {
        return gnome;
    }

    /**
     * Returns the cost of card in keebles.
     *
     * @return cost of card in keebles
     */
    public int getCost() {
        return cost;
    }

    /**
     * Adds card to PlayZone.
     *
     * @param p is game to have card added in PlayZone
     */
    public void playToPlayZone(PlasterClash p) {
        p.getPlayZone().add(this);
    }

    /**
     * Removes card from hand.
     *
     * @param p is game to have currentPlayer remove card from hand
     */
    public void play(PlasterClash p) {
        p.currentPlayer().getHand().remove(this);
    }

    @Override
    public String toString() {
        return getName() + " (" + getCost() + ")";
    }
}
