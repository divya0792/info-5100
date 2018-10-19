package DessertShop;

public class Sundae extends IceCream{
    private final String toppingName;
    private final int toppingPrice;

    public Sundae(String iceCreamName, int iceCreamCost, String toppingName, int toppingPrice) {
        super(iceCreamName, iceCreamCost);
        this.toppingName = toppingName;
        this.toppingPrice = toppingPrice;
    }

    public int getCost() {
        return getToppingPrice() + super.getCost();
    }

    public String getToppingName() {
        return toppingName;
    }

    public int getToppingPrice() {
        return toppingPrice;
    }

}
