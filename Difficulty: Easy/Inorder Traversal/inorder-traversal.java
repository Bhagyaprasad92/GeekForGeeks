/* Structure of Binary Tree Node
class Node {
	int data;
	Node left, right;
	Node(int item) {
		data = item;
		left = right = null;
	}
} */

class Solution {
	private ArrayList<Integer> res = new ArrayList<>();
	
	public ArrayList<Integer> inOrder(Node root) {
		// code here
		if (root == null)
			return new ArrayList<>();
		
		inOrder(root.left);
		res.add(root.data);
		inOrder(root.right);
		return res;
	}
}
