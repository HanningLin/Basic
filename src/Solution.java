

public class Solution {
    public static TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        if (root == null)   return null;
        TreeNode res = null;
        while (root != null) {
            if (root.val <= p.val) {
                root = root.right;
            } else {
                res = root;
                root = root.right;
            }
        }
        return res;
    }



    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left = new TreeNode(1);

        TreeNode p = new TreeNode(2);
        System.out.println(inorderSuccessor(root, p));
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
