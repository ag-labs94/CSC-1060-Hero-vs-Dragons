import java.util.ArrayList;

public class Inventory {
    private String weaponName;
    private int weaponDamage;
    private String armorName;
    private int armorReduction;
    private ArrayList<Item> loot;

    public Inventory(String weaponName, int weaponDamage,
                     String armorName, int armorReduction) {
        this.weaponName = weaponName;
        this.weaponDamage = weaponDamage;
        this.armorName = armorName;
        this.armorReduction = armorReduction;
        this.loot = new ArrayList<>();
    }

    // allows loot to be added
    public void addLoot(Item itemName) {
        loot.add(itemName);
    }

    // equip the weapon
    public void equipWeapon(String newWeapon, int newWeaponDamage) {
        System.out.println("Swapped " + weaponName + " for " + newWeapon + "!");
        this.weaponName = newWeapon;
        this.weaponDamage = newWeaponDamage;
    }

    // equip the armor
    public void equipArmor(String newArmor, int newArmorReduction) {
        System.out.println("Swapped " + armorName + " for " + newArmor + "!");
        this.armorName = newArmor;
        this.armorReduction = newArmorReduction;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public int getWeaponDamage() {
        return weaponDamage;
    }

    public String getArmorName() {
        return armorName;
    }

    public int getArmorReduction() {
        return armorReduction;
    }

    public ArrayList<Item> getLoot() {
        return loot;
    }

    // equip different items
    public void equipLoot(int index) {
        if (index < 0 || index >= loot.size()) {
            System.out.println("Invalid choice!");
            return;
        }
        Item item = loot.get(index);

        if (item.getDescription().equals("weapon")) {
            equipWeapon(item.getName(), item.getValue());
        } else if (item.getDescription().equals("armor")) {
            equipArmor(item.getName(), item.getValue());
        } else  {
            System.out.println("Invalid choice!");
        }
        loot.remove(index);
    }
}
