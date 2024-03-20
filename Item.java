import java.util.ArrayList;
import java.util.List;
public class Item {
    protected String itemName;
    protected int itemQuantity;
    protected int itemValue;

    public Item() {
        itemName = "";
        itemQuantity = 0;
        itemValue = 0;

    }

    public String getItemName() {
        return itemName;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public int getItemValue() {
        return itemValue;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public void setItemValue(int itemValue) {
        this.itemValue = itemValue;
    }

    public void itemDisplay() {
        System.out.println("Item:" +itemName);
        System.out.println("Quantity:" +itemQuantity);
        System.out.println("Value:" +itemValue);

    }
}
