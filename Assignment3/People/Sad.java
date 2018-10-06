package People;

public class Sad extends Moody {
    @Override
    protected String getMood() {
        return "sad";
    }
    @Override
    public void expressFeelings() {
        System.out.println("weep sob weep sob");
    }
    @Override
    public String toString() {
        return "Subject cries a lot";
    }
}
