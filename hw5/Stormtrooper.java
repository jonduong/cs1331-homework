/**
 * This class represents a stormtrooper.
 *
 * @author Jonathan Duong
 * @version 1.00
 */
public class Stormtrooper extends Soldier {

    /**
     * Creates a stormtrooper object.
     *
     * @param health The stormtrooper's health
     * @param attack The stormtrooper's attack
     * @param defense The stormtrooper's defense
     * @param identifier The stormtrooper's identifier
     */
    public Stormtrooper(double health, double attack,
            double defense, String identifier) {
        super(health, attack, defense, identifier);
    }

    /**
     * Overrides the abstrct method attack in parent.
     * Has 60% chance of attacking and 25% multiplier.
     *
     * @param target is the target of attack
     * @return the damage dealt
     */
    public double attack(Soldier target) {
        double chance = Math.random();
        double attack1 = this.getAttack() * 1.25;
        if (chance <= .60) {
            target.hurt(attack1);
        }
        return attack1;
    }

    /**
     * Returns the name of storm trooper.
     *
     * @return soldier's name with format Stormtrooper identifier
     */
    @Override
    public String getName() {
        return "Stormtrooper " + getIdentifier();
    }
}
