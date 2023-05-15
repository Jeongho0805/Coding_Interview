package structure;

public class Node {
    private int val;
    private Node nextNode;

    public Node() {
    }

    public Node(int val, Node nextNode) {
        this.val = val;
        this.nextNode = nextNode;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public Node getNext() {
        return this.nextNode;
    }

    public int getVal() {
        return this.val;
    }
}
