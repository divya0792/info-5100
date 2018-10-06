package People;


public class PsychiatristDriver {

    public static void main(String[] args) {
        Psychiatrist psychiatrist = new Psychiatrist();
        Moody happy = new Happy();
        Moody sad = new Sad();

       diagnose(psychiatrist, happy);
       diagnose(psychiatrist, sad);
    }
    
    private static void diagnose(Psychiatrist psychiatrist, Moody moody) {
        psychiatrist.examine(moody);
        psychiatrist.observe(moody);
    }
}
