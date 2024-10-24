class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0, j=0, k=0, n = nums1.length + nums2.length;
        int[] arr = new int[n];
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                arr[k++] = nums1[i++]; 
            } else {
                arr[k++] = nums2[j++];
            }
        }
        while(i < nums1.length){
            arr[k++] = nums1[i++];
        }
        while(j < nums2.length){
            arr[k++] = nums2[j++];
        }

        if(n%2 != 0){
            return arr[n/2];
        } else {
            return (double)(arr[n/2] + arr[n/2-1]) / 2;
        }
    }
}
