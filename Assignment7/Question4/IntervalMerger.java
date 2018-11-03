package Question4;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class IntervalMerger {
    static class Interval {
        int start;
        int end;
        Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }

    }

    private class IntervalComparator implements Comparator<Interval> {
        public int compare(Interval firstInterval, Interval secondInterval) {
            if(firstInterval.start > secondInterval.start) {
                return 1;
            } else if(firstInterval.start < secondInterval.start) {
                return -1;
            } else {
                return firstInterval.end - secondInterval.end;
            }
        }
    }

    public List<Interval> merge(List<Interval> intervals) {
        if (intervals == null || intervals.size() < 2) {
            return intervals;
        }
        intervals.sort(new IntervalComparator());
        List<Interval> result = new ArrayList<>();
        result.add(intervals.get(0));
        int counter = 0;
        for (int i = 1; i < intervals.size(); i++) {
            if (result.get(counter).end >= intervals.get(i).start) {
                if (result.get(counter).end < intervals.get(i).end) {
                    result.get(counter).end = intervals.get(i).end;
                }
            } else {
                result.add(intervals.get(i));
                counter++;
            }
        }
        return result;
    }
}
