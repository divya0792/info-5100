package DessertShop;

public class Cookie extends DessertItem{
    private final int number;
    private final int pricePerDozen;

    public Cookie(String name, int number, int pricePerDozen) {
        super(name);
        this.number = number;
        this.pricePerDozen = pricePerDozen;
    }
    @Override
    public int getCost() {
      return (int)Math.round(getNumber() / DessertShoppe.DOZEN * getPricePerDozen());
    }

    public int getNumber() {
        return number;
    }

    public int getPricePerDozen() {
        return pricePerDozen;
    }
}
