/**
 * This class represents a Jedi.
 *
 * @author Jonathan Duong
 * @version 1.00
 */
public class Jedi extends Soldier implements ForceSensitive {
    private int forceCount;

    /**
     * Creates a jedi object.
     *
     * @param health The jedi's health
     * @param attack The jedi's attack
     * @param defense The jedi's defense
     * @param identifier The jedi's identifier
     */
    public Jedi(double health, double attack,
            double defense, String identifier) {
        super(health, attack, defense, identifier);
        this.forceCount = 0;
    }

    /**
     * Overrides the abstract method useTheForce in interface.
     * Heals health by 1/4 attack, and boost defense by attack.
     * Adds to forceCount.
     */
    public void useTheForce() {
        double healed = this.getAttack() * .25;
        this.heal(healed);
        this.changeDefense(this.getAttack());
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
            this.changeDefense(this.getAttack() * -1);
            this.forceCount = 0;
        }
        return attack2;
    }

    /**
     * Return the Jedi's name.
     *
     * @return jedi's name with format Jedi identifier
     */
    @Override
    public String getName() {
        return "Jedi " + getIdentifier();
    }
}
