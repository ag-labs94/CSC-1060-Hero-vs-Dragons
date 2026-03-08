import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

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

        //Splash page
        String splashScreen = "";
        System.out.println(splashScreen);
        System.out.println();

        //Grab user configuration data points
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Hero hit points: ");
        int heroHP = scanner.nextInt();
        System.out.print("Enter Hero damage: ");
        int heroDamage = scanner.nextInt();


        int dragon1HP = 100;
        int dragon1Damage = 20;
        int dragon2HP = 100;
        int dragon2Damage = 20;
        int dragon3HP = 100;
        int dragon3Damage = 20;



        //Start the battle until all dragons are dead
        boolean heroWins = false;
        while(true) {
            System.out.print("Hero has " + heroHP + " hit points and " + heroDamage + " of damage!");
            System.out.println();

            System.out.print("Dragon status: ");
            System.out.println("Dragon 1 " + dragon1HP + "HP and deals " + dragon1Damage + " points of damage!");
            System.out.println("Dragon 2 " + dragon2HP + "HP and deals " + dragon2Damage + " points of damage!");
            System.out.println("Dragon 3 " + dragon3HP + "HP and deals " + dragon3Damage + " points of damage!");

            //When hero hit points less than zero all have died

            if(heroHP < 1){
                heroWins = false;
                break;
            }

            //When all Dragons are dead
            if(dragon1HP < 1 && dragon2HP < 1 && dragon3HP < 1) {
                heroWins = true;
                break;
            }
            //Get user input on which dragon
            int dragonChoice = 0;
            while(dragonChoice < 1 || dragonChoice > 3) {
                System.out.println("Hero's turn to attack. Which dragon would you like to attack? (1, 2 ,3)");
                dragonChoice = scanner.nextInt();
            }
            System.out.println("Attacking Dragon " + dragonChoice);

            if(dragonChoice == 1) {
                if(dragon1HP < 1){
                    System.out.println("Dragon 1 is dead!");
                } else {
                    int heroHits = rand.nextInt(heroDamage);
                    dragon1HP = dragon1HP - heroHits;
            }

            }else if(dragonChoice == 2) {
                if(dragon2HP < 1){
                System.out.println("Dragon 2 is dead!");
                }else {
                    int heroHits = rand.nextInt(heroDamage);
                    dragon2HP = dragon2HP - heroHits;}
            }
            else if(dragonChoice == 3) {
                if(dragon3HP < 1){
                    System.out.println("Dragon 3 is dead!");
                } else {
                    int heroHits = rand.nextInt(heroDamage);
                    dragon3HP = dragon3HP - heroHits;}
            }

            // Dragons attack here
            if(dragon1HP > 0) {
                int dragonHits = rand.nextInt(dragon1Damage);
                heroHP = heroHP - dragonHits;
            }

            if(dragon2HP > 0) {
                int dragonHits = rand.nextInt(dragon2Damage);
                heroHP = heroHP - dragonHits;

            }

            if(dragon3HP > 0) {
                int dragonHits = rand.nextInt(dragon3Damage);
                heroHP = heroHP - dragonHits;
            }

            }



        System.out.println("Battle outcomes");
        System.out.println("---------------");
        if(heroWins == false){
            System.out.println("You were defeated!");
            System.out.println();
            System.out.println("     _____\n" +
                    "    / RIP \\\n" +
                    "   |       |\n" +
                    "   | HERO  |\n" +
                    "   |_______|");
            System.out.print("Hero has " + heroHP + " hit points and " + heroDamage + " of damage!");
            System.out.println();
            System.out.println("Dragon 1 " + dragon1HP + "HP and deals " + dragon1Damage + " points of damage!");
            System.out.println("Dragon 2 " + dragon2HP + "HP and deals " + dragon2Damage + " points of damage!");
            System.out.println("Dragon 3 " + dragon3HP + "HP and deals " + dragon3Damage + " points of damage!");
        }
        else{
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
            System.out.println();
            System.out.print("Hero has " + heroHP + " hit points and " + heroDamage + " of damage!");
            System.out.println();
            System.out.println("Dragon 1 " + dragon1HP + "HP and deals " + dragon1Damage + " points of damage!");
            System.out.println("Dragon 2 " + dragon2HP + "HP and deals " + dragon2Damage + " points of damage!");
            System.out.println("Dragon 3 " + dragon3HP + "HP and deals " + dragon3Damage + " points of damage!");
        }

        }




    }

