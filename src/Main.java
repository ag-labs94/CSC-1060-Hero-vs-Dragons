import java.util.Random;
import java.util.Scanner;

public class Main {

    static Random rand = new Random();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //Title
        System.out.println("**************************");
        System.out.println("Welcome to Hero vs Dragon!");
        System.out.println("*************************");
        System.out.println();

        System.out.println("                    / \\  //\\\n" +
                "       |\\___/|      /   \\//  \\\\\n" +
                "       /O  O  \\__  /    //  | \\ \\    \n" +
                "      /     /  \\/_/    //   |  \\  \\  \n" +
                "      @_^_@'/   \\/_   //    |   \\   \\ \n" +
                "      //_^_/     \\/_ //     |    \\    \\\n" +
                "   ( //) |        \\///      |     \\     \\\n" +
                " ( / /) _|_ /   )  //       |      \\     _\\\n" +
                "( // /) '/,_ _ _/  ( ; -.   |    _ _\\.-~        .-~~~^-.\n" +
                "(( / / )) ,-{        _      `-.|.-~-.           .~         `.\n" +
                "(( // / ))  '/\\      /                 ~-. _ .-~      .-~^-.  \\\n" +
                "(( /// ))      `.   {            }                   /      \\  \\\n" +
                " (( / ))     .----~-.\\        \\-'                 .~         \\  `. \\^-.\n" +
                "            ///.----..>        \\             _ -~             `.  ^-`  ^-_\n" +
                "              ///-._ _ _ _ _ _ _}^ - - - - ~                     ~--,   .-~");

        System.out.println();

        //Grab user configuration data points
        System.out.print("Enter Hero hit points: ");
        int heroHP = scanner.nextInt();
        System.out.print("Enter Hero damage: ");
        int heroDamage = scanner.nextInt();

        Dragon[] dragons = new Dragon[3];
        dragons[0] = new Dragon(1000, 200);
        dragons[1] = new Dragon(1000, 200);
        dragons[2] = new Dragon(3000, 300);

        //Start the battle until all dragons are dead
        boolean heroWins = false;
        while (true) {
            System.out.println("Hero has " + heroHP + " hit points and " + heroDamage + " of damage!");

            printDragonStatus(dragons);

            //When hero hit points less than zero
            if (heroHP < 1) {
                heroWins = false;
                break;
            }

            //When all Dragons are dead
            if (dragons[0].getHitPoints() < 1 && dragons[1].getHitPoints() < 1 && dragons[2].getHitPoints() < 1) {
                heroWins = true;
                break;
            }

            heroAttacksDragon(dragons, heroDamage);
            heroHP = dragonsAttackHero(dragons, heroHP);
        }

        //Battle outcome
        System.out.println("Battle outcomes");
        System.out.println("---------------");
        printDragonStatus(dragons);

        if (!heroWins) {
            System.out.println("You were defeated!");
            System.out.println();
            System.out.println("     _____\n" +
                    "    / RIP \\\n" +
                    "   |       |\n" +
                    "   | HERO  |\n" +
                    "   |_______|");
        } else {
            System.out.println("       .-=========-.\n" +
                    "                 \\'-=======-'/\n" +
                    "                 _|   .=.   |_\n" +
                    "                ((|  LEGEND!  |))\n" +
                    "                 \\|   /|\\   |/\n" +
                    "                  \\__ '`' __/\n" +
                    "                    _`) (`_\n" +
                    "                  _/_______\\_\n" +
                    "                 /___________\\");
            System.out.println("You win!");
        }
    }

    private static void heroAttacksDragon(Dragon[] dragons, int heroDamage) {
        int dragonChoice = 0;
        while (dragonChoice < 1 || dragonChoice > 3) {
            System.out.println("Hero's turn to attack. Which dragon would you like to attack? (1, 2, 3)");
            dragonChoice = scanner.nextInt();
        }

        //Subtract one from user input to access actual dragon
        dragonChoice--;

        System.out.println("Attacking Dragon " + (dragonChoice + 1));

        if (dragons[dragonChoice].getHitPoints() < 1) {
            System.out.println("Dragon " + (dragonChoice + 1) + " is already dead!");
        } else {
            int heroHits = rand.nextInt(heroDamage);
            dragons[dragonChoice].setHitPoints(dragons[dragonChoice].getHitPoints() - heroHits);
        }
    }

    private static int dragonsAttackHero(Dragon[] dragons, int heroHP) {
        for (int i = 0; i < dragons.length; i++) {
            if (dragons[i].getHitPoints() > 0) {
                int dragonHits = rand.nextInt(dragons[i].getDamage());
                heroHP -= dragonHits;
            }
        }
        return heroHP;
    }

    private static void printDragonStatus(Dragon[] dragons) {
        System.out.println("Dragons Status");
        System.out.println("--------------");
        for (int i = 0; i < dragons.length; i++) {
            System.out.println("Dragon " + (i + 1) + " " + dragons[i].getHitPoints() + " HP and deals " + dragons[i].getDamage() + " points of damage");
        }
    }
}