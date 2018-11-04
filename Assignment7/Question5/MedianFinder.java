package Question5;

public class MedianFinder {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums2.length < nums1.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;
        int low = 0;
        int high = nums1.length;

        while (low <= high) {

            int firstPartition = (high + low) / 2;
            int secondPartition = ((m + n + 1) / 2) - firstPartition;

            int firstLeftMax = firstPartition <= 0 ? Integer.MIN_VALUE : nums1[firstPartition - 1];
            int secondLeftMax = secondPartition <= 0 ? Integer.MIN_VALUE : nums2[secondPartition - 1];

            int firstRightMin = firstPartition >= m ? Integer.MAX_VALUE : nums1[firstPartition];
            int secondRightMin = secondPartition >= n ? Integer.MAX_VALUE : nums2[secondPartition];

            int leftMax = Math.max(firstLeftMax, secondLeftMax);
            int rightMin = Math.min(firstRightMin, secondRightMin);

            if (leftMax <= rightMin) {
                if ((m + n) % 2 == 0) {
                    return (leftMax + rightMin) / 2.0;

                } else {
                    return leftMax;
                }
            } else if (firstLeftMax > secondRightMin) {
                high = firstPartition - 1;

            } else {
                low = firstPartition + 1;
            }

        }
        return -1;

    }

}
