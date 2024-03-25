/**
 * A Class to store information of the Weapon Item.
 *
 */

public class Weapon extends Item {
    protected int ammo;
    protected int damage;

    public Weapon(String itemName,
                  int itemQuantity,
                  int itemValue,
                  int ammo,
                  int damage){

        super(itemName, itemQuantity, itemValue); // Call the constructor of the superclass (Item)
        this.ammo = ammo;
        this.damage = damage;
    }

    //Getters and setters
    public int getAmmo() {
        return ammo;
    }

    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}