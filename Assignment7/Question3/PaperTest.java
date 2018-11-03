package Question3;


import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class PaperTest {

    @Test
    public void fight() {
        //Arrange
        Rock rock = new Rock(15);
        Paper paper = new Paper(7);
        Scissors scissors = new Scissors(5);

        assertFalse(paper.fight(rock));
        assertFalse(paper.fight(scissors));
    }
}
