package Question3;

public class Rock extends Tool {
    Rock(int strength) {
        super(strength, 'r');
    }

    public boolean fight(Tool tool) {
        double tempStrength = this.getStrength();
        if(tool instanceof Scissors) {
            tempStrength *= 2;
        } else if(tool instanceof Paper) {
            tempStrength /= 2;
        }
        return tempStrength > tool.getStrength();
    }
}
