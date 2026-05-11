import java.util.Random;

public class Dragon {
    private int hitPoints;
    private int damage;
    private int critChance; // int representation of percentage to crit
    private static Random rand = new Random();

    public int getCritChance() {
        return critChance;
    }

    public void setCritChance(int critChance) {
        this.critChance = critChance;
    }

    public Dragon(int hitPoints, int damage, int critChance) {
        this.hitPoints = hitPoints;
        this.damage = damage;
        this.critChance = critChance;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    //Loot drop gold and items

    public void dropLoot(Hero hero) {
        int gold = rand.nextInt(101) + 20;
        hero.addGold(gold);

        int lootChance = rand.nextInt(100);

        if (lootChance <= 5) {
            Item[] legendary = {
                    new Item("Dragon Slayer", "weapon", 100),
                    new Item("Dragon Armor", "armor", 30)

            };
            Item droppedLegend = legendary[rand.nextInt(legendary.length)];
            System.out.println("Rare Drop!");
            hero.getInventory().addLoot(droppedLegend);
            System.out.println("Dragon dropped: " + droppedLegend.getName());
        }
    }

}
;;