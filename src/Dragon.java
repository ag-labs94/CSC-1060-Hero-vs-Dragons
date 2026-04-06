public class Dragon {
    private int hitPoints;
    private int damage;

    public Dragon(int hitPoints, int damage) {
        this.hitPoints = hitPoints;
        this.damage = damage;
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
