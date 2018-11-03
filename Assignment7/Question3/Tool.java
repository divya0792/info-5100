package Question3;

public class Tool {
    private int strength;
    private char type;

    Tool(int strength, char type) {
        this.strength = strength;
        this.type = type;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return this.strength;
    }
}
