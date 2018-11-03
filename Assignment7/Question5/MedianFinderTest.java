package Question5;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MedianFinderTest {

    @Test
    public void findMedianSortedArrays() {
        int[] A = {1,3,5,7};
        int[] B = {2,4,6};
        MedianFinder medianFinder = new MedianFinder();
        double median = medianFinder.findMedianSortedArrays(A,B);
        Assert.assertEquals(4.0, median,0);
    }
}