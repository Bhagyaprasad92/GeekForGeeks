class Solution {
    public String longestCommonPrefix(String arr[]) {
        // code here
        String base = arr[0];
        for(int i = 0; i < base.length(); i++) {
            char curr = base.charAt(i);
            for(int j = 1; j < arr.length; j++) {
                if(i == arr[j].length() || curr != arr[j].charAt(i)) {
                    return base.substring(0, i);
                }
            }
        }
        return base;
    }
}