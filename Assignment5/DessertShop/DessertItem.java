package DessertShop;

public abstract class DessertItem {

    private String name;

    public DessertItem() {
    }

    public DessertItem(String name) {
        if(name.length() > DessertShoppe.MAXIMUM_ITEM_NAME_SIZE) {
           throw new IllegalArgumentException("name is greater than the limit");
        }
        this.name = name;
    }

    protected final String getName() {
        return name;
    }

    public abstract int getCost();
}
