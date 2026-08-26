class Solution {
    public void rotate(int[] arr) {
        // code here
        int n = arr.length;
        for(int i = 0; i < n - 1; i++) {
            int t = arr[n - 1 - i];
            arr[n - 1 - i] = arr[n - 2 - i];
            arr[n - 2 - i] = t;
        }
    }
}