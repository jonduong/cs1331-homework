import java.util.ArrayList;

/**
 * This is the Self CheckoutMachine class.
 *
 * @author Jonathan Duong
 * @version 1.00
 */
public class CheckoutMachine {
    private String storeName;
    private ArrayList<Item> validItems;
    private ArrayList<Item> cart;

    /**
     * Creates a CheckoutMachine.
     * @param storeName is the name of the store
     */
    public CheckoutMachine(String storeName) throws WrongStoreError,
            ServerException {
        boolean retry = false;
        boolean rego = false;
        do {
            rego = false;
            try {
                boolean haha = Server.isStoreNameValid(storeName);
                if (!haha) {
                    throw new WrongStoreError("Wrong Store.");
                } else {
                    this.cart = new ArrayList<Item>();
                    this.storeName = storeName;
                    do {
                        retry = false;
                        try {
                            this.validItems = Server.getValidItems();
                            rego = true;
                            retry = true;
                        } catch (ServerException ex) {
                            System.out.print("");
                        }
                    } while (!retry);
                }
            } catch (ServerException qq) {
                System.out.print("");
            }
        } while (!rego);
    }

    /**
     * Scans item and checks to see if it is valid.
     * @param item thing being scanned
     */
    public void scan(Item item) throws InvalidItemException {
        int count = 0;
        for (Item items : validItems) {
            if (item.equals(items)) {
                Item thing = (Item) items;
                cart.add(thing);
                count++;
            }
        }
        if (count == 0) {
            throw new InvalidItemException("This item is not valid.");
        }
    }

    /**
     * This gets the total price.
     * @return the total price
     */
    public double getTotalPrice() {
        double total = 0;
        for (Item item : cart) {
            total = total + item.getPrice();
        }
        return total;
    }

    /**
     * This pays for stuff in cart.
     * @param method is the payment method
     */
    public void payForCart(PaymentMethod method) throws
            PaymentFailedException {
        double sum = getTotalPrice();
        method.pay(sum);
        cart.clear();
    }
}
