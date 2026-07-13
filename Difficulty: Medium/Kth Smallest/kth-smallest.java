class Solution {
    public int kthSmallest(int[] arr, int k) {
        // Code here
        Arrays.sort(arr);
        // for(int i = 0; i < arr.length; i++) {
        //     if(i == k) {
        //         return arr[i];
        //     }
        // }
        // System.out.println(Arrays.toString(arr));
        return arr[k-1];
    }
}
