package People;

public class Happy extends Moody {

    @Override
    protected String getMood() {
        return "happy";
    }
    @Override
    public void expressFeelings() {
        System.out.println("haha hehe haha hehe");
    }
    @Override
    public String toString() {
        return "Subject laughs a lot";
    }
}
