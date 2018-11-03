package Question3;

public class Paper extends Tool{
    Paper(int strength) {
        super(strength,'p');
    }

    public boolean fight(Tool tool) {
        double tempStrength = this.getStrength();
        if(tool instanceof Rock) {
            tempStrength *= 2;
        } else if(tool instanceof Scissors) {
            tempStrength /= 2;
        }
        return tempStrength > tool.getStrength();

    }
}
