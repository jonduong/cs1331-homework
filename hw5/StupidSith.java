/**
 * This class represents an empire soldier.
 *
 * @author Jonathan Duong
 * @version 1.00
 */
public class StupidSith extends Stormtrooper {

    /**
     * Creates a custom stupid sith object.
     *
     * @param health The stupid sith's health
     * @param attack The stupid sith's attack
     * @param defense The stupid sith's defense
     * @param identifier The stupid sith's identifier
     */

    public StupidSith(double health, double attack,
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
     * @return soldier's name with format Stupid Sith identifier
     */
    @Override
    public String getName() {
        return "Stupid Sith " + getIdentifier();
    }
}
