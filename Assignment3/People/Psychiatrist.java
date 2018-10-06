package People;

public class Psychiatrist {

    public void examine(Moody moody) {
        if(moody == null) {
            throw new IllegalArgumentException("Moody cannot be null");
        }
        System.out.println("How are you feeling today?");
        System.out.println(moody.queryMood());
        System.out.println();
    }

    public void observe(Moody moody) {
        if(moody == null) {
            throw new IllegalArgumentException("Moody cannot be null");
        }
        moody.expressFeelings();
        System.out.println("Observation : " + moody);
        System.out.println();
    }
}
