import structure.TreeNode;

/**
 * 4-4 : 이진 트리가 균형이 잡혀 있는지 확인하는 함수 작성
 */
public class Problem4_4 {

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int heightDiff = calHeight(root.left) - calHeight(root.right);
        if (Math.abs(heightDiff ) > 1) {
            return false;
        } else {
            return isBalanced(root.right) && isBalanced(root.right);
        }
    }

    private int calHeight(TreeNode root) {
        if (root == null) {
            return -1;
        }
        return Math.max(calHeight(root.left), calHeight(root.right)) + 1;
    }
}
