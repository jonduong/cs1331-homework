import java.util.ArrayList;
import java.util.HashMap;
/**
 * Represents a Field class.
 *
 * @author Jonathan Duong
 * @version 1.00
 */
public class Field {
    private ArrayList<Card> field;
    private HashMap<String, Integer> pool;

    /**
     * Creates the Field.
     */
    public Field() {
        field = new ArrayList<Card>();
        field.add(new Gnome());
        field.add(new GardenBread());
        field.add(new InstaEnd());
        this.field = field;
        pool = new HashMap<String, Integer>();
        pool.put("Gnome", 10);
        pool.put("Garden Bread", 1);
        pool.put("Instant End", 1);
    }

    /**
     * Decreases mapped value of card unless it is Garden Bread.
     *
     * @param card to have map value decreased
     */
    public void buyCard(Card card) {
        if (!card.getName().equals("Garden Bread")) {
            int left = pool.get(card.getName());
            if (left > 1) {
                pool.put(card.getName(), left - 1);
            } else {
                field.remove(card);
            }
        }
    }

    /**
     * Returns ArrayList of cards in field.
     *
     * @return ArrayList of vards in field
     */
    public ArrayList<Card> cards() {
        return field;
    }
}
