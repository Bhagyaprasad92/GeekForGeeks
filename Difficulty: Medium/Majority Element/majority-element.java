class Solution {
    int majorityElement(int arr[]) {
        // code here
        int max = 0;
        for(int i : arr) {
            if(i > max) max = i;
        }
        int[] freq = new int[max + 1];
        for(int i : arr) {
            freq[i]++;
        }
        for(int i = 0; i < freq.length; i++) {
            if(freq[i] > arr.length / 2) {
                return i;
            }
        }
        return -1;
    }
}