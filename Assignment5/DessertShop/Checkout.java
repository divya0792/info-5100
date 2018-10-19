package DessertShop;

import java.util.Vector;

class Checkout {
   private Vector<DessertItem> dessertItems;


    public Checkout() {
        dessertItems = new Vector<>();
    }

    public int numberOfItems() {
        return dessertItems.size();
    }

    public void enterItem(DessertItem item) {
        dessertItems.add(item);
    }

    public void clear() {
        dessertItems = new Vector<>();
    }

    public int totalCost() {
        int totalCost = 0;
        for(DessertItem item : dessertItems) {
            totalCost += item.getCost();
        }
        return totalCost;
    }

    public int totalTax() {
        return (int)Math.round(this.totalCost() * DessertShoppe.TAX_RATE / 100.00);
    }

    private void generateBillString(StringBuilder dessert, String dessertCost, StringBuilder bill) {
        while (dessert.length() < DessertShoppe.BILL_WIDTH - dessertCost.length()) {
            dessert.append(" ");
        }
        bill.append(dessert).append(dessertCost).append("\n");
    }

    @Override
    public String toString() {
        StringBuilder bill = new StringBuilder();

        bill.append("    " + DessertShoppe.STORE_NAME + "\n");
        bill.append("    " + "------------------" + "\n");

        for(int j = 0; j < dessertItems.size(); j++) {

            StringBuilder dessert = new StringBuilder(dessertItems.get(j).getName());
            String dessertCost = DessertShoppe.cents2dollarsAndCents(dessertItems.get(j).getCost());

            if (dessertCost.length() > DessertShoppe.COST_WIDTH) {
                dessertCost = dessertCost.substring(0, DessertShoppe.COST_WIDTH);
            }


            if (dessertItems.get(j) instanceof Candy) {
                bill.append(((Candy) dessertItems.get(j)).getWeight()).append(" lbs @ ").append(DessertShoppe.cents2dollarsAndCents(((Candy) dessertItems.get(j)).getPricePerPound())).append(" /lb.\n");
                generateBillString(dessert, dessertCost, bill);

            } else if (dessertItems.get(j) instanceof IceCream) {
                generateBillString(dessert, dessertCost, bill);

            } else if (dessertItems.get(j) instanceof Sundae) {
                bill.append(((Sundae) dessertItems.get(j)).getToppingName()).append(" Sundae with\n");
                generateBillString(dessert, dessertCost, bill);

            }  else if (dessertItems.get(j) instanceof Cookie){
                bill.append(((Cookie) dessertItems.get(j)).getNumber()).append(" @ ").append(DessertShoppe.cents2dollarsAndCents(((Cookie) dessertItems.get(j)).getPricePerDozen())).append(" /dz\n");
                generateBillString(dessert, dessertCost, bill);
            }
        }
        //Tax

        StringBuilder line = new StringBuilder("\nTax");
        String tax = DessertShoppe.cents2dollarsAndCents(this.totalTax());
        while(line.length() <= DessertShoppe.BILL_WIDTH - tax.length())
            line.append(" ");
        bill.append(line).append(tax);

        //Total cost

        String totalCost = DessertShoppe.cents2dollarsAndCents(this.totalCost() + this.totalTax());
        line = new StringBuilder("\nTotal Cost");
        while(line.length() <= DessertShoppe.BILL_WIDTH - totalCost.length())
            line.append(" ");
        bill.append(line).append(totalCost);

        return bill.toString();

    }
}