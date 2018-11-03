package Question3;

public class RockPaperScissorsGame {
    public static void main(String[] args) {
        Scissors scissors = new Scissors(5);
        Paper paper = new Paper(7);
        Rock rock = new Rock(15);
        System.out.println(scissors.fight(paper) + " , "+ paper.fight(scissors) );
        System.out.println(paper.fight(rock) + " , "+ rock.fight(paper) );
        System.out.println(rock.fight(scissors) + " , "+ scissors.fight(rock) );
    }
}
