package Question3;

public class Scissors extends Tool{

    Scissors(int strength) {
        super(strength, 's');
    }

    public boolean fight(Tool tool) {
        double tempStrength = this.getStrength();
        if(tool instanceof Paper) {
            tempStrength *= 2;
        } else if(tool instanceof Rock) {
            tempStrength /= 2;
        }
        return tempStrength > tool.getStrength();

    }
}
