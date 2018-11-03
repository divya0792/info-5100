package Question5;

public class MedianFinder {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = nums1.length - 1;
        int k = 0;
        int l = nums2.length - 1;
        int total = nums1.length + nums2.length;

        while (i + 1 < j && k + 1 < l) {
            int middle1 = (i + j) / 2;
            int middle2 = (k + l) / 2;
            if (nums1[middle1] < nums2[middle2]) {
                i = middle1;
                l = middle2;
            } else {
                j = middle1;
                k = middle2;
            }
        }
        if ((nums1.length + nums2.length) % 2 == 1) {
            if (nums1[j] > nums2[l]) {
                return nums2[l];
            } else {
                return nums1[j];
            }
        } else {
            if (nums1[i] > nums2[l]) {
                return (nums2[l] + nums2[k]) / 2.0;
            } else if (nums1[j] < nums2[k]) {
                return (nums1[i] + nums1[j]) / 2.0;
            } else if (nums1[j] > nums2[k]) {
                return (nums1[i] + nums2[k]) / 2.0;
            } else {
                return (nums1[j] + nums2[k]) / 2.0;
            }
        }

    }
}
