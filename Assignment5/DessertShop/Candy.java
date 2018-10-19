package DessertShop;

public class Candy extends DessertItem {
    private final double weight;
    private final int pricePerPound;

    public Candy(String name, double weight, int pricePerPound) {
        super(name);
        this.pricePerPound = pricePerPound;
        this.weight = weight;
    }

    @Override
    public int getCost() {
        return (int)Math.round(getWeight() * getPricePerPound());
    }

    public int getPricePerPound() {
        return pricePerPound;
    }

    public double getWeight() {
        return weight;
    }
}
