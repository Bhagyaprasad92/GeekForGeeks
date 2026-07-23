class Solution {
    public boolean checkDuplicates(int arr[]) {
        // Code here
        HashSet<Integer> seen = new HashSet<>();
        for(int i : arr) {
            if(seen.contains(i)) {
                return true;
            }
            seen.add(i);
        }
        return false;
    }
}