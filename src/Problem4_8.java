import structure.TreeNode;

/**
 * 첫번째 공통 조상 찾기
 */
public class Problem4_8 {
    public TreeNode findCommonParentNode(TreeNode node1, TreeNode node2) {
        int node1Depth = calDepth(node1);
        int node2Depth = calDepth(node2);

        int depthDiff = Math.abs(node1Depth - node2Depth);
        if (node1Depth > node2Depth) {
            node1 = bringUpNode(node1, depthDiff);
        }
        if (node1Depth < node2Depth) {
            node2 = bringUpNode(node2, depthDiff);
        }

        while (node1 != node2) {
            node1 = node1.parent;
            node2 = node2.parent;
        }
        return node1;
    }

    private TreeNode bringUpNode(TreeNode node, int diff) {
        while (diff > 0) {
            node = node.parent;
            diff--;
        }
        return node;
    }

    private int calDepth(TreeNode node) {
        int depth = 0;
        while (node.parent != null) {
            depth++;
            node = node.parent;
        }
        return depth;
    }
}
