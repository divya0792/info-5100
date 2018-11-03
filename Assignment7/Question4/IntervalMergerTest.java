package Question4;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class IntervalMergerTest {

    @Test
    public void merge() {
        IntervalMerger.Interval i1 = new IntervalMerger.Interval(1,3);
        IntervalMerger.Interval i2 = new IntervalMerger.Interval(2,6);
        IntervalMerger.Interval i3 = new IntervalMerger.Interval(8,12);
        IntervalMerger.Interval i4 = new IntervalMerger.Interval(18,24);

        List<IntervalMerger.Interval> list = new ArrayList<>();
        list.add(i1);
        list.add(i2);
        list.add(i3);
        list.add(i4);

        IntervalMerger merger = new IntervalMerger();
        int count = merger.merge(list).size();
        Assert.assertEquals(3, count);


    }
}