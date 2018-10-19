package tst.DessertShop;

import DessertShop.DessertShoppe;
import org.junit.Test;

import static org.junit.Assert.*;

public class DessertShoppeTest {

    @Test
    public void cents2dollarsAndCents() {
        assertEquals("5.45", DessertShoppe.cents2dollarsAndCents(545));
    }
}