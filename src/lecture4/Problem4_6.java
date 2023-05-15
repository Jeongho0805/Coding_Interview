package lecture4;

import structure.TreeNode;

/**
 * 중위 순회 기준 다음 노드 찾기
 */
public class Problem4_6 {
    public TreeNode findNextNode(TreeNode node) {
        if (node.right != null) {
            return findLeftEndNod(node.right);
        }
        TreeNode cur = node;
        TreeNode parent = node.parent;
        while (parent != null && parent.left != cur) {
            cur = parent;
            parent = parent.parent;
        }
        return parent;
    }

    private TreeNode findLeftEndNod(TreeNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }
}
