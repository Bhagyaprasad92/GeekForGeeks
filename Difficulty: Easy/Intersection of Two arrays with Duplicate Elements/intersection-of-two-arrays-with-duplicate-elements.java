class Solution {
    public ArrayList<Integer> intersect(int[] a, int[] b) {
        HashSet<Integer> a1 = new HashSet<>();
        for(int i : a) {
            a1.add(i);
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(int i : b) {
            if(a1.contains(i)) {
                res.add(i);
                a1.remove(i);
            }
        }
        return res;
    }
}