class Solution {
    public void sortArrayList(ArrayList<Integer> nums) {
        // code here
        ArrayList<Integer> temp = new ArrayList<>(nums.size());
        for(int i = 0; i < nums.size(); i++) {
            temp.add(0);
        }
        mergeSort(nums, temp, 0, nums.size() - 1);
        
    }
    private void mergeSort(ArrayList<Integer> nums, ArrayList<Integer> temp, int l, int r) {
        if(l < r) {
            int mid = l + (r - l) / 2;
            mergeSort(nums, temp, l, mid);
            mergeSort(nums, temp, mid + 1, r);
            merge(nums, temp, l, mid, r);
        }
    }
    private void merge(ArrayList<Integer> nums, ArrayList<Integer> temp, int l, int m, int r) {
        for(int i = l; i <= r; i++) {
            temp.set(i, nums.get(i));
        }
        int i = l, j = m + 1, k = l;
        while(i <= m && j <= r) {
            if(temp.get(i) <= temp.get(j)) {
                nums.set(k++, temp.get(i++));
            } else {
                nums.set(k++, temp.get(j++));
            }
        }
        while(i <= m) {
            nums.set(k++, temp.get(i++));
        }
    }
}
