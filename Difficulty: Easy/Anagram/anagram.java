class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        Map<Character, Integer> sMap1 = new HashMap<>();
        Map<Character, Integer> sMap2 = new HashMap<>();
        for(char c : s1.toCharArray()) {
            sMap1.put(c, sMap1.getOrDefault(c, 0) + 1);
        }
        for(char c : s2.toCharArray()) {
            sMap2.put(c, sMap2.getOrDefault(c, 0) + 1);
        }
        // System.out.println(sMap1);
        // System.out.println(sMap2);
        if(!sMap1.equals(sMap2)) {
            return false;   
        }
        return true;
    }
}