public class Dragon {
    private int hitPoints;
    private int damage;
    private int critChance; // int representation of percentage to crit

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
}
