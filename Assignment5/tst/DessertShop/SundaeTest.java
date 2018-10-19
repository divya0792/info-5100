package tst.DessertShop;

import DessertShop.Sundae;
import org.junit.Test;

import static org.junit.Assert.*;

public class SundaeTest {
    @Test
    public void testSundae() {
        Sundae sundae = new Sundae("vanilla", 230, "chocolate", 120);
        assertEquals("chocolate", sundae.getToppingName());
        assertEquals(230+120, sundae.getCost());
    }


}