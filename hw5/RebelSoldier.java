/**
 * This class represents a rebel soldier.
 *
 * @author Jonathan Duong
 * @version 1.00
 */
public class RebelSoldier extends Soldier {

    /**
     * Creates a Rebel soldier object.
     *
     * @param health The rebel soldier's health
     * @param attack The rebel soldier's attack
     * @param defense The rebel soldier's defense
     * @param identifier The rebel's soldier's identifier
     */
    public RebelSoldier(double health, double attack,
            double defense, String identifier) {
        super(health, attack, defense, identifier);
    }

    /**
     * Overrides the abstrct method attack in parent.
     * Has 80% chance of attacking and no multiplier.
     *
     * @param target is the target of attack
     * @return the damage dealt
     */
    public double attack(Soldier target) {
        double chance = Math.random();
        double attack1 = this.getAttack();
        if (chance <= .80) {
            target.hurt(attack1);
        }
        return attack1;
    }

    /**
     * Return the rebel soldier's name.
     *
     * @return soldier's name with format Rebel Soldier identifier
     */
    @Override
    public String getName() {
        return "Rebel Soldier " + getIdentifier();
    }
}
