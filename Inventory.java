import java.util.ArrayList;

/**
 * A class that manages a list of items belonging to a character
 */
public class Inventory {
    private ArrayList <Item> itemCatalogue ;
    private Character money;


    public Inventory(Character money) {
        itemCatalogue = new ArrayList<>();
        this.money = money;

    }

    // Getters
    public ArrayList<Item> getItemCatalogue() {
        return itemCatalogue;
    }

    public Character getMoney() {
        return money;
    }

    /**
     * A method to display the list of items within a characters inventory
     */
    public void displayInventory() {
        for (Item items : itemCatalogue) {
            items.itemDisplay();
        }}

    /**
     * A method to remove items from inventory list
     * @param item
     */
    public void removeItem (Item item) {
        if (itemCatalogue.contains(item)) {
            itemCatalogue.remove(item);
            System.out.println("Item" + item.getItemName() + "was successfully removed.");
        } else {
            System.out.println("Item not in your inventory.");
        }
    }

    /**
     * A method to add an item to inventory list
     * @param item
     */
    public void addItem (Item item) {
        if (itemCatalogue.contains(item)) {
            System.out.println("Item already in inventory");

        } else {
            itemCatalogue.add(item);
            System.out.println("Item added to inventory");
        }}

    /**
     * A method to sell an item from inventory list.
     *
     * @param item
     * @param money
     */
    public void sellItem(Item item, Character money) {
        double itemValue = item.getItemValue();
        double  cash = money.getCashMoney();
        if (itemCatalogue.contains(item) && item.getItemValue() > 0){
            itemCatalogue.remove(item);
            cash += itemValue;
            System.out.println("Item" +item.getItemName()+ "sold for:" +item.getItemValue());
            System.out.println("You now have: $" +cash);
        } else {
            System.out.println("Item" + item.getItemName()+"is not in your inventory!");
        }}


}

