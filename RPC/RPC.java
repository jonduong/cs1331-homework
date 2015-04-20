import java.util.Scanner;
public class RPC {


    public static void main(String[] args) {
        Scanner socks = new Scanner(System.in);

        System.out.println("Player 1: Choose your weapon.");
        String entry1 = socks.next();
        while (!isChoice(entry1)) {
            System.out.println("That's not valid. Try again.");
            entry1 = socks.next();
        }

        System.out.println("Player 2: Choose your weapon.");
        String entry2 = socks.next();
        while (!isChoice(entry2)) {
            System.out.println("That's not valid. Try again.");
            entry2 = socks.next();
        }
        /*
        if (entry1 = "r") {
            if (entry2 = "r") {
                System.out.println("Tie.");
            } else if (entry2 = "p") {
                System.out.println("Paper beat rock. Player 2 wins.");
            } else if (entry2 = "s") {
                System.out.println("Rock beats scic. Player 1 wins.");
            }
        }*/
    }
    public static boolean isChoice(String choice) {
        return(choice.equalsIgnoreCase("r"))
        || (choice.equalsIgnoreCase("p"))
        || (choice.equalsIgnoreCase("s"));
    }
}
