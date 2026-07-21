class Solution {
    int[] sortArray(int arr[]) {
        // Code Here
        int n = arr.length;
        int[] res = new int[n];
        for(int i = 1; i <= n; i++) {
            res[i - 1] = i;
        }
        return res;
    }
}