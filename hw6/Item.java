/**
 * Item class represents an item, having name, weight, price, and barcode.
 * @author Alex Epifano & Thomas Shields
 * @version 1.0
 */
public class Item {

    private String name;
    private double weight;
    private double price;
    private long barcode;

    /**
     * Creates a new item with the specified weight and barcode. Initializes
     * name as null and price as 0.0.
     * @param  weight  The weight in grams of the item.
     * @param  barcode The barcode of the item.
     */
    public Item(double weight, long barcode) {
        this.name = null;
        this.weight = weight;
        this.price = 0.0;
        this.barcode = barcode;
    }

    /**
     * Create new item with the specified properties.
     * @param  name    The name of the item.
     * @param  weight  The weight of the item in grams.
     * @param  price   The price of the item in USD.
     * @param  barcode The barcode of the item.
     */
    public Item(String name, double weight, double price, long barcode) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.barcode = barcode;
    }

    /**
     * Checks if item is same with weight and barcode.
     * @param other is an object to compare
     * @return if item is same or not
     */
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || (this.getClass() != other.getClass())) {
            return false;
        }
        Item that = (Item) other;
        return ((Double) this.weight != null && this.weight == that.weight)
            && ((Long) this.barcode != null && this.barcode == that.barcode);
    }

    /**
     * Gets hashcode for object.
     * @return the hashcode
     */
    public int hashCode() {
        return (int) this.weight * (int) this.barcode;
    }

    /**
     * Returns the price.
     * @return price
     */
    public double getPrice() {
        return price;
    }
}
