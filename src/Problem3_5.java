import java.util.Stack;

public class Problem3_5 {
    public static void main(String[] args) {
        MinSortStack stack = new MinSortStack();
        stack.push(1);
        stack.push(5);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
    }
}


class MinSortStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> stackForSort = new Stack<>();
    int min = Integer.MAX_VALUE;

    public void push(int input) {
        stack.push(input);
        move();
        min = Integer.MAX_VALUE;
    }

    public int pop() {
        if (stack.isEmpty()) {
            throw new IllegalArgumentException("스택에 요소가 없습니다.");
        }
        int result = stack.pop();
        min = Integer.MAX_VALUE;
        move();
        return result;
    }

    public int peek() {
        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    private void move() {
        while (!stack.isEmpty()) {
            int value = stack.pop();
            min = Math.min(min, value);
            stackForSort.push(value);
        }

        while (!stackForSort.isEmpty()) {
            int value = stackForSort.pop();
            if (value == min) {
                continue;
            }
            stack.push(value);
        }
        if (min != Integer.MAX_VALUE) {
            stack.push(min);
        }
    }
}