/**
 * This class represents a rebel.
 *
 * @author Jonathan Duong
 * @version 1.00
 */
public class RetardRebel extends RebelSoldier {

    /**
     * Creates a custom rebel object.
     *
     * @param health The rebel soldier's health
     * @param attack The rebel soldier's attack
     * @param defense The rebel soldier's defense
     * @param identifier The rebel's soldier's identifier
     */

    public RetardRebel(double health, double attack,
            double defense, String identifier) {
        super(health, attack, defense, identifier);
    }

    /**
     * Overrides the attack and gives him a one-shot low-percentage crit.
     * His normal attacks are super weak.
     *
     * @param target the target of attack.
     */
    @Override
    public double attack(Soldier target) {
        double chance = Math.random();
        double attack3 = this.getAttack() * 100;
        double attack4 = this.getAttack() / 100;
        if (chance <= .05) {
            target.hurt(attack3);
            return attack3;
        } else {
            target.hurt(attack4);
            return attack4;
        }
    }

    /**
     * Return the retard rebel's name.
     *
     * @return soldier's name with format Retard Rebel identifier
     */
    @Override
    public String getName() {
        return "Retard Rebel " + getIdentifier();
    }
}
