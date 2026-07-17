class Solution {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        // code here
        Arrays.sort(arr);
        int i = 0, j = arr.length - 1;
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        while(i < j) {
            int sum = arr[i] + arr[j];
            if(sum == 0) {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(arr[i]);
                pair.add(arr[j]);
                res.add(pair);
                int currLeft = arr[i];
                while(i < j && arr[i] == currLeft) {
                    i++;
                }
                int currRight = arr[j];
                while(i < j && arr[j] == currRight) {
                    j--;
                }
            } else if(sum < 0) {
                i++;
            } else {
                j--;
            }
        }
        return res;
    }
}
