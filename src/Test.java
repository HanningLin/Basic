import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Test {

    /**
     * Given an array of non-negative integers arr[].
     * The task is to find the largest number in the array which is palindrome.
     * If no such number exits then print -1.
     */
    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null)   return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();
                if (i == 0) {
                    res.add(cur.val);
                }
                if (cur.right != null) queue.offer(cur.right);
                if (cur.left != null) queue.offer(cur.left);
            }
        }
        return res;
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode left = root.left;
        TreeNode right = root.right;
        left.val = 2;
        right.val = 3;
        left.left = null;
        left.right.val = 5;
        right.left = null;
        right.right.val = 4;
        System.out.println(rightSideView(root));

    }
}
