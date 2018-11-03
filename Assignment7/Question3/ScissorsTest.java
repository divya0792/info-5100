package Question3;


import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ScissorsTest {

    @Test
    public void fight() {
        //Arrange
        Rock rock = new Rock(15);
        Paper paper = new Paper(7);
        Scissors scissors = new Scissors(5);

        assertFalse(scissors.fight(rock));
        assertTrue(scissors.fight(paper));
    }
}