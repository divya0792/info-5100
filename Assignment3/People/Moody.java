package People;

public abstract class Moody {
    protected abstract String getMood();

    protected abstract void expressFeelings();

    public String queryMood() {
        return "I feel " + getMood() + " today.";
    }
}
