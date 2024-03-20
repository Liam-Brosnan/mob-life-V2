public class Item {
    protected String itemName;
    protected int itemQuantity;
    protected int itemValue;

    public Item(String itemName, int itemQuantity, int itemValue) {
        this.itemName = itemName;
        this.itemQuantity = itemQuantity;
        this.itemValue = itemValue;

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
