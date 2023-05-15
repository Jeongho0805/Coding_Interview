package lecture3;

import java.util.Stack;

/**
 * 스택 두개로 큐 하나를 구현한 myQueue 클래스를 구현하라
 */
public class Problem3_4 {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(queue.poll());
        queue.add(4);
        queue.add(5);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}

class MyQueue {
    Stack<Integer> inStack = new Stack<>();
    Stack<Integer> outStack = new Stack<>();

    public void add(int input) {
        inStack.push(input);
    }

    public int poll() {
        if (!outStack.isEmpty()) {
            return outStack.pop();
        }
        if (inStack.isEmpty()) {
            throw new IllegalArgumentException("큐 안에 요소가 없습니다.");
        }
        while (!inStack.isEmpty()) {
            outStack.push(inStack.pop());
        }
        return outStack.pop();
    }
}
