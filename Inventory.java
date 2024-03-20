import java.util.List;
import java.util.ArrayList;
public class Inventory {
    private ArrayList <Item> itemCatalogue ;
    private Character money;


    public Inventory(Character money) {
        itemCatalogue = new ArrayList<>();
        this.money = money;

    }
    public ArrayList<Item> getItemCatalogue() {
        return itemCatalogue;
    }

    public Character getMoney() {
        return money;
    }

    public void displayInventory() {
        for (Item items : itemCatalogue) {
            items.itemDisplay();
        }}

    public void removeItem (Item item) {
        if (itemCatalogue.contains(item)) {
            itemCatalogue.remove(item);
            System.out.println("Item" + item.getItemName() + "was successfully removed.");
        } else {
            System.out.println("Item not in your inventory.");
        }
    }
    public void addItem (Item item) {
        if (itemCatalogue.contains(item)) {
            System.out.println("Item already in inventory");

        } else {
            itemCatalogue.add(item);
            System.out.println("Item added to inventory");
        }}
    public void sellItem(Item item, Character money, double counter) {
        counter = 0.0;
        if (itemCatalogue.contains(item) && item.getItemValue() > 0){
            itemCatalogue.remove(item);
            counter += item.getItemValue();
            System.out.println("Item" +item.getItemName()+ "sold for:" +item.getItemValue());
            System.out.print("");
            System.out.println("You now have: $" +counter);
        } else {
            System.out.println("Item" + item.getItemName()+"is not in your inventory!");
        }}




}

