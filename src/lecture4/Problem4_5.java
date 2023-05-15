package lecture4;

import structure.TreeNode;

/**
 * BST 검증하기
 */
public class Problem4_5 {
    static int prevNumber = Integer.MIN_VALUE;
    public boolean isBst(TreeNode root) {
        if (root == null) {
            return true;
        }

        if (!isBst(root.left)) {
            return false;
        }

        if (prevNumber != Integer.MIN_VALUE && root.val < prevNumber) {
            return false;
        }
        prevNumber = root.val;

        if (!isBst(root.right)) {
            return false;
        }

        return true;
    }
}
