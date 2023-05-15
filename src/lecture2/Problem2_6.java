package lecture2;

import structure.Node;

import java.util.Currency;
import java.util.Stack;

/**
 * 단방향 연결리스트 가정 (커스텀 자료구조 활용)
 */



public class Problem2_6 {
    public static void main(String[] args) {
        Node node1 = new Node(1, new Node(2, new Node(3, null)));
        Node reverseNode = getReverseNode(node1);
        while(reverseNode.getNext() != null) {
            System.out.print(reverseNode.getVal());
            reverseNode = reverseNode.getNext();
        }

    }
    public boolean isPalindrome(Node node) {
        Node node1 = new Node(1, new Node(2, new Node(3, null)));
        Node reverseNode = getReverseNode(node1);
        while(reverseNode.getNext() != null) {
            System.out.print(reverseNode.getVal() + " ");
            reverseNode = reverseNode.getNext();
        }
        return true;
    }

    private static Node getReverseNode(Node node) {
        Node nextNode = null;
        Node curNode = new Node(node.getVal(), nextNode);
        nextNode = curNode;
        node = node.getNext();

        while(true) {
            curNode = new Node(node.getVal(), nextNode);
            nextNode = curNode;
            node = node.getNext();
            if (node == null) {
                break;
            }
        }
        return curNode;
    }
}

