package PartA;

import org.junit.Test;

import static org.junit.Assert.*;

public class MreviewTest {

    @Test
    public void testMreview() {
        //Arrange
        Mreview mreview = new Mreview("superman", 3);
        mreview.addRating(2);
        mreview.addRating(4);
        mreview.addRating(2);

        System.out.println(mreview.toString());

    }

}