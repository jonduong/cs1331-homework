import java.util.Scanner;

/**
 * Battlefront simulation which has the main method and gets
 * all the information and runs it.
 *
 * @author Jonathan Duong
 * @version 1.00
 */
public class Battlefront {
    /**
     * The main method. It gets input from the user and runs the simulation.
     *
     * @param args Nothing really goes here, its part of the main method.
     */
    public static void main(String[] args) {
        System.out.println("+-------------------------------------------+");
        System.out.println("| Welcome to the Battlefront1331 Simulator! |");
        System.out.println("+-------------------------------------------+");
        Scanner input = new Scanner(System.in);
        System.out.println("How many Rebel Soldiers would you"
            + "like to include?");
        int numRebels = input.nextInt();
        System.out.println("How many Jedi would you like to include?");
        int numJedi = input.nextInt();
        System.out.println("How many Stormtroopers would you"
            + "like to include?");
        int numTroopers = input.nextInt();
        System.out.println("How many Sith would you like to include?");
        int numSith = input.nextInt();
        System.out.println("Press enter to begin the simulation");
        input.nextLine();
        input.nextLine();
        RetardRebel jim = new RetardRebel(100, 100, 100, "Yip");
        StupidSith rik = new StupidSith(100, 100, 100, "Mik");
        Simulation battle = new Simulation(numRebels, numJedi, numTroopers,
            numSith, jim, rik);
        boolean tim;

        do {
            tim = battle.simulateSkirmish(false);
            System.out.println("Press enter to continue the simluation");
            input.nextLine();
        } while (tim);

        System.out.println("Simulation Complete!");
        if (battle.getNumRebellionRemaining() > 0) {
            System.out.println("The Rebels won!");
        } else {
            System.out.println("The Empire won!");
        }
        System.out.println(battle.getNumRebelsRemaining() + " of "
            + numRebels + " Rebel Soldiers remain!");
        System.out.println(battle.getNumJediRemaining() + " of "
            + numJedi + " Jedi remain!");
        System.out.println(battle.getNumTroopersRemaining() + " of "
            + numTroopers + " Stormtroopers remain!");
        System.out.println(battle.getNumSithRemaining() + " of "
            + numSith + " Sith remain!");
    }
}
