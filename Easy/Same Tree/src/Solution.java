import java.util.Stack;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;

        Stack<TreeNode> toVisitP = new Stack<>();
        Stack<TreeNode> toVisitQ = new Stack<>();
        toVisitP.push(p);
        toVisitQ.push(q);

        while (!toVisitP.isEmpty() && !toVisitQ.isEmpty()) {
            TreeNode pNode = toVisitP.pop();
            TreeNode qNode = toVisitQ.pop();

            if (pNode != null && qNode != null) {
                if (pNode.val != qNode.val)
                    return false;
            } else if (!(qNode == null && pNode == null)) {
                return false;
            }
            if (pNode != null) {
                toVisitP.push(pNode.left);
                toVisitP.push(pNode.right);
            }
            if (qNode != null) {
                toVisitQ.push(qNode.left);
                toVisitQ.push(qNode.right);
            }
        }

        return toVisitP.isEmpty() && toVisitQ.isEmpty();
    }
}