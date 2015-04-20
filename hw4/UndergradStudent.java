/**
 * This class represents an undergraduate student.
 * @author Jonathan Duong
 * @version 1.00
 */
public class UndergradStudent extends Student {
    protected int hope;
    protected int pizza;

    /**
     * This creates an undergraduate student object.
     * @param firstName is the first name of the undergraduate student
     * @param lastName is the last name of the undergraduate student
     * @param username is the username of the undergraduate student
     */
    public UndergradStudent(String firstName, String lastName,
        String username) {
        super(firstName, lastName, username);
        this.hope = 100;
        this.pizza = 0;
    }

    /**
     * Returns the undergraduate student's hope.
     * @return hope
     */
    public int getHope() {
        return hope;
    }

    /**
     * Subtracts from the undergraduate student's hope.
     * @param hopeLoss amount of hope to be lost
     */
    public void loseHope(int hopeLoss) {
        if (this.hope - Math.abs(hopeLoss) < 0) {
            this.hope = 0;
        } else {
            this.hope -= Math.abs(hopeLoss);
        }
    }

    /**
     * Returns the amount of pizza consumed.
     * @return pizza consumed
     */
    public int getPizza() {
        return pizza;
    }

    /**
     * Adds to the amount of pizza consumed.
     * @param pizzas the amount of pizzas to be consumed
     */
    public void eatPizza(int pizzas) {
        this.pizza += Math.abs(pizzas);
    }
}
