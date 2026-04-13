public class Main {


    public static void main(String[] args) {

        Dungeon.printTitle();


        // Hero setup
        Hero hero = Dungeon.setupHero();

        //Dragon set up
        Dragon[] dragons = Dungeon.createDragons();


        //Start the battle until all dragons are dead

        boolean heroWins = BattleEngine.runBattle(hero, dragons);

        //Battle outcome

        BattleEngine.printBattleOutcome(heroWins, dragons);

    }












}