package Reverse;

import Reverse.ReverseSentence;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ReverseSentenceTest {

    @Test
    public void reverseSentenceTest() {
        ReverseSentence reverseSentence = new ReverseSentence();
        String str = "    the   sky is    blue   ";
        assertThat(reverseSentence.reverse(str), is("blue is sky the"));
    }
}
