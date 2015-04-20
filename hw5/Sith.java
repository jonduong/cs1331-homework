/**
 * This class represents a Sith.
 *
 * @author Jonathan Duong
 * @version 1.00
 */
public class Sith extends Soldier implements ForceSensitive {
    private int forceCount;

    /**
     * Creates a sith object.
     *
     * @param health The sith's health
     * @param attack The sith's attack
     * @param defense The sith's defense
     * @param identifier The sith's identifier
     */
    public Sith(double health, double attack,
            double defense, String identifier) {
        super(health, attack, defense, identifier);
        this.forceCount = 0;
    }

    /**
     * Overrides the abstract method useTheForce in interface.
     * Hurts by 1/10 attack, and boost attack by attack.
     * Adds to forceCount.
     */
    public void useTheForce() {
        double hurted = this.getAttack() * .10;
        this.hurt(hurted);
        this.changeAttack(this.getAttack());
        this.forceCount++;
    }

    /**
     * Overrides the abstract method attack in parent.
     * Always hits and no multiplier. Reverts useTheForce effects if done.
     *
     * @param target is the target of attack
     * @return the damage dealt
     */
    public double attack(Soldier target) {
        double attack2 = this.getAttack();
        target.hurt(attack2);
        if (this.forceCount == 1) {
            this.changeAttack(this.getAttack() * -1);
            this.forceCount = 0;
        }
        return attack2;
    }

    /**
     * Return the Sith's name.
     *
     * @return soldier's name with format Sith identifier
     */
    @Override
    public String getName() {
        return "Sith " + getIdentifier();
    }
}
