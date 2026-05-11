public class Hero {
    private int hitPoints;
    private int damage;
    private int maxHitPoints;
    private Inventory inventory;
    private int gold;
    private int healsRemaining;

    public Hero(int hitPoints, int damage) {
        this.hitPoints = hitPoints;
        this.damage = damage;
        this.maxHitPoints = hitPoints;
        this.inventory = new Inventory("Iron Sword", 15, "Leather Armor", 2 );
        this.gold = 0;
        this.healsRemaining = 2;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getDamage() {
        return damage + inventory.getWeaponDamage();
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    // Healing ability adding the Math.min function to make sure the healing does not go above the max health
    public void heal() {
        if (healsRemaining > 0) {
            hitPoints = Math.min(hitPoints +50, maxHitPoints);
            healsRemaining--;
            System.out.println("You healed! HP: " + hitPoints + " (" + healsRemaining + " heals left)");

        } else  {
            System.out.println("You can't heal anymore!");
        }
    }
    // gold looting
    public void addGold(int goldAmount) {
        this.gold += goldAmount;
        System.out.println("Gold: " + goldAmount + " (Total: " + gold + ")");
    }

    public Inventory getInventory() {
        return inventory;
    }

    public int getGold(){
        return gold;
    }

    public int getHealsRemaining() {
        return healsRemaining;
    }

    public int getMaxHitPoints() {
        return maxHitPoints;
    }
}
