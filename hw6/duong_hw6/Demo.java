import java.time.LocalDate;

/**
 * Class for demonstrating the stuff.
 *
 * @author Jonathan Duong
 * @version 1.00
 */
public class Demo {
    /**
     * Main method.
     * @param args the arguments
     */
    public static void main(String[] args) throws CardExpiredException,
            NotEnoughFundsException, InvalidItemException, WrongStoreError {

        LocalDate dt = LocalDate.of(2020, 10, 10);
        LocalDate df = LocalDate.of(2000, 10, 10);
        Cash cashG = new Cash(100.00);
        CreditCard cardG = new CreditCard("Jon", 100.00, dt);
        BuzzCard buzzG = new BuzzCard("Jon", 100.00);
        Cash cashB = new Cash(0.0);
        CreditCard cardB = new CreditCard("Jon", 0.0, dt);
        BuzzCard buzzB = new BuzzCard("Jon", 0.0);
        CreditCard cardE = new CreditCard("Jon", 0.0, df);
        Item drinkG = new Item(546.86, 550759400L);
        Item drinkB = new Item(546.86, 550758401L);
        Item coffee = new Item(961.05, 9220570L);

        System.out.println("BEGINNING DEMO");
        System.out.println("Good Run: Cash");
        try {
            CheckoutMachine store = new CheckoutMachine("TechConvenience");

            store.scan(coffee);
            System.out.println("Coffee");
            store.scan(drinkG);
            System.out.println("Energy Drink");
            store.payForCart(cashG);

        } catch (ServerException r) {
            r.printStackTrace();
        } catch (WrongStoreError w) {
            System.out.println(w.getMessage());
        } catch (InvalidItemException z) {
            System.out.println(z.getMessage());
        } catch (PaymentFailedException y) {
            System.out.println(y.getMessage());
        }

        System.out.println();
        System.out.println("Bad Run: Cash");
        try {
            CheckoutMachine store = new CheckoutMachine("TechConvenience");

            store.scan(coffee);
            System.out.println("Coffee");
            store.scan(drinkG);
            System.out.println("Energy Drink");
            store.payForCart(cashB);

        } catch (ServerException r) {
            r.printStackTrace();
        } catch (WrongStoreError w) {
            System.out.println(w.getMessage());
        } catch (InvalidItemException z) {
            System.out.println(z.getMessage());
        } catch (PaymentFailedException y) {
            System.out.println(y.getMessage());
        }

        System.out.println();
        System.out.println("Good Run: BuzzCard");
        try {
            CheckoutMachine store = new CheckoutMachine("TechConvenience");

            store.scan(coffee);
            System.out.println("Coffee");
            store.scan(drinkG);
            System.out.println("Energy Drink");
            store.payForCart(buzzG);

        } catch (ServerException r) {
            r.printStackTrace();
        } catch (WrongStoreError w) {
            System.out.println(w.getMessage());
        } catch (InvalidItemException z) {
            System.out.println(z.getMessage());
        } catch (PaymentFailedException y) {
            System.out.println(y.getMessage());
        }

        System.out.println();
        System.out.println("Bad Run: BuzzCard");
        try {
            CheckoutMachine store = new CheckoutMachine("TechConvenience");

            store.scan(coffee);
            System.out.println("Coffee");
            store.scan(drinkG);
            System.out.println("Energy Drink");
            store.payForCart(buzzB);

        } catch (ServerException r) {
            r.printStackTrace();
        } catch (WrongStoreError w) {
            System.out.println(w.getMessage());
        } catch (InvalidItemException z) {
            System.out.println(z.getMessage());
        } catch (PaymentFailedException y) {
            System.out.println(y.getMessage());
        }

        System.out.println();
        System.out.println("Good Run: CreditCard");
        try {
            CheckoutMachine store = new CheckoutMachine("TechConvenience");

            store.scan(coffee);
            System.out.println("Coffee");
            store.scan(drinkG);
            System.out.println("Energy Drink");
            store.payForCart(cardG);

        } catch (ServerException r) {
            r.printStackTrace();
        } catch (WrongStoreError w) {
            System.out.println(w.getMessage());
        } catch (InvalidItemException z) {
            System.out.println(z.getMessage());
        } catch (PaymentFailedException y) {
            System.out.println(y.getMessage());
        }

        System.out.println();
        System.out.println("Bad Run: CreditCard");
        try {
            CheckoutMachine store = new CheckoutMachine("TechConvenience");

            store.scan(coffee);
            System.out.println("Coffee");
            store.scan(drinkG);
            System.out.println("Energy Drink");
            store.payForCart(cardB);

        } catch (ServerException r) {
            r.printStackTrace();
        } catch (WrongStoreError w) {
            System.out.println(w.getMessage());
        } catch (InvalidItemException z) {
            System.out.println(z.getMessage());
        } catch (PaymentFailedException y) {
            System.out.println(y.getMessage());
        }

        System.out.println();
        System.out.println("Bad Run: Expired Card");
        try {
            CheckoutMachine store = new CheckoutMachine("TechConvenience");

            store.scan(coffee);
            System.out.println("Coffee");
            store.scan(drinkG);
            System.out.println("Energy Drink");
            store.payForCart(cardE);

        } catch (ServerException r) {
            r.printStackTrace();
        } catch (WrongStoreError w) {
            System.out.println(w.getMessage());
        } catch (InvalidItemException z) {
            System.out.println(z.getMessage());
        } catch (PaymentFailedException y) {
            System.out.println(y.getMessage());
        }

        System.out.println();
        System.out.println("Bad Run: Bad Item");
        try {
            CheckoutMachine store = new CheckoutMachine("TechConvenience");

            store.scan(coffee);
            System.out.println("Coffee");
            store.scan(drinkG);
            System.out.println("Energy Drink");
            System.out.println("Bad Drink");
            store.scan(drinkB);
            store.payForCart(cashG);

        } catch (ServerException r) {
            r.printStackTrace();
        } catch (WrongStoreError w) {
            System.out.println(w.getMessage());
        } catch (InvalidItemException z) {
            System.out.println(z.getMessage());
        } catch (PaymentFailedException y) {
            System.out.println(y.getMessage());
        }
        System.out.println();
        System.out.println("Bad Store:");
        try {
            CheckoutMachine bad = new CheckoutMachine("Tool");
        } catch (ServerException r) {
            r.printStackTrace();
        } catch (WrongStoreError w) {
            System.out.println(w.getMessage());
        }
    }
}
