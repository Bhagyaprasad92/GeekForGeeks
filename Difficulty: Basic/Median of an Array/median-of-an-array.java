class Solution {
    public double findMedian(int[] arr) {
        // Code here.
        int n = arr.length;
        Arrays.sort(arr);
        if(arr.length % 2 != 0) return (double) arr[n / 2];
        else {
            return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        }
    }
}
