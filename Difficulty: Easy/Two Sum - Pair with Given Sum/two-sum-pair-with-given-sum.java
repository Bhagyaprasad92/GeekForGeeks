class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        HashMap<Integer, Integer> seen = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            int diff = target - arr[i];
            if(seen.containsKey(diff)) {
                return true;
            }
            seen.put(arr[i], i);
        }
        return false;
    }
}