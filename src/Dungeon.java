import java.util.Random;
import java.util.Scanner;

public class Dungeon {
    static Random rand = new Random();
    static Scanner scanner = new Scanner(System.in);

    public static void printTitle() {
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
    }

    public static Dragon[] createDragons() {
        Dragon[] dragons = new Dragon[3];
        dragons[0] = new Dragon(1000, 200, 10);
        dragons[1] = new Dragon(1000, 200, 10);
        dragons[2] = new Dragon(3000, 300, 40);
        return dragons;
    }

    public static Hero setupHero() {
        //Grab user configuration data points
        System.out.print("Enter Hero hit points: ");
        int hitPoints = scanner.nextInt();

        System.out.print("Enter Hero damage: ");
        int damage = scanner.nextInt();
        return new Hero(hitPoints, damage);

    }
}
