package Question3;


import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class RockTest {

    @Test
    public void fight() {
        //Arrange
        Rock rock = new Rock(15);
        Paper paper = new Paper(7);
        Scissors scissors = new Scissors(5);

        assertTrue(rock.fight(paper));
        assertTrue(rock.fight(scissors));
    }
}
