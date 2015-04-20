import java.util.ArrayList;
import java.util.Collections;
/**
 * This represents a zone of play.
 *
 * @author Jonathan Duong
 * @version 1.00
 */
public class Zone {
    protected ArrayList<Card> zone;
    /**
     * This constucts the zone.
     */
    public Zone() {
        zone = new ArrayList<Card>();
        this.zone = zone;
    }

    /**
     * Shuffles the deck.
     */
    public void shuffle() {
        Collections.shuffle(zone);
    }

    /**
     * Returns the number of Gnomes.
     *
     * @return gnomeCount as number
     */
    public int numGnomes() {
        int gnomeCount = 0;
        for (Card card : zone) {
            if (card.isScorable()) {
                gnomeCount++;
            }
        }
        return gnomeCount;
    }

    /**
     * Returns the size of the zone.
     *
     * @return number of cards in zone.
     */
    public int size() {
        return zone.size();
    }

    /**
     * Removes a card based on index and returns the card.
     *
     * @param index the index of the card
     * @return card being removed
     */
    public Card remove(int index) {
        Card toAdd = zone.get(index);
        zone.remove(index);
        return toAdd;
    }

    /**
     * Removes a card based on the card.
     *
     * @param card is card to be removed
     */
    public void remove(Card card) {
        int index = zone.indexOf(card);
        zone.remove(index);
    }

    /**
     * Adds a card to zone.
     *
     * @param card to be added
     */
    public void add(Card card) {
        zone.add(card);
    }

    /**
     * Tells if card is in zone or not.
     *
     * @param card to be checked
     * @return if card is in zone or not
     */
    public boolean contains(Card card) {
        boolean thing = false;
        for (Card selc : zone) {
            if (card.getName() == selc.getName()) {
                thing = true;
            }
        }
        return thing;
    }

    /**
     * Gets card based on index.
     *
     * @param indx to be checked
     * @return card at index
     */
    public Card get(int indx) {
        return zone.get(indx);
    }

    /**
     * Moves cards to target zone.
     *
     * @param place zone for cards to be transferred to
     */
    public void moveCardsTo(Zone place) {
        for (Card card : zone) {
            place.add(card);
        }
        zone.clear();
    }

    /**
     * Discards the cards in zone and returns the ArrayList of cards.
     *
     * @return ArrayList of cards discarded
     */
    public ArrayList<Card> discardAll() {
        ArrayList<Card> zoneCopy = new ArrayList<Card>();
        for (Card card : zone) {
            zoneCopy.add(card);
        }
        zone.clear();
        return zoneCopy;
    }

    @Override
    public String toString() {
        String result = "";
        for (int ind = 0; ind < zone.size(); ind++) {
            result += ind + ": " + zone.get(ind) + "\n";
        }
        return result;
    }
}
