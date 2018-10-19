package DessertShop;

public class DessertShoppe {
    public final static double TAX_RATE = 5;
    public final static String STORE_NAME = "DELICIOUS DESSERTS";
    public final static int MAXIMUM_ITEM_NAME_SIZE = 30;
    public final static int COST_WIDTH = 4;
    public final static float DOZEN = 12.0f;
    public final static int BILL_WIDTH = 30;


    public static String cents2dollarsAndCents(int cents) {
        String formattedPrice = "";

        int dollars = cents / 100;
        cents = cents % 100;

        if (dollars > 0) {
            formattedPrice += dollars;
        }

        formattedPrice += ".";

        if (cents < 10) {
            formattedPrice += "0";
        }

        formattedPrice += cents;

        return formattedPrice;
    }

}
