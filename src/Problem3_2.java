/**
 * 스택 Min : 기본적인 push와 pop 기능이 구현된 스택에서 최솟값을 반환하는 min 함수를 추가하려고 한다
 * 어떻게 설계할 수 있나? push, pop, min 함수 모두 시간 복잡도 O(1) 안에 동작해야 한다.
 */

public class Problem3_2 {
    public static void main(String[] args) {
        CustomStack stack = new CustomStack();
        stack.push(5);
        stack.push(7);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack.min());
    }
}

class CustomStack {
    private int top;
    private int[] content;
    private int minTop;
    private int[] min;

    public CustomStack() {
        this.top = -1;
        this.content = new int[100];
        this.minTop = -1;
        this.min = new int[100];
    }

    public void push(int input) {
        content[++top] = input;
        if (minTop < 0) {
            min[++minTop] = input;
        } else {
            if (min[minTop] > input) {
                min[++minTop] = input;
            }
        }
    }

    public int pop() {
        if (top >= 0) {
            if (content[top] == min[minTop]) {
                minTop--;
            }
            return content[top--];
        }
        throw new IllegalArgumentException("스택에 요소가 없습니다.");
    }

    public int min() {
        if (minTop < 0) {
            throw new IllegalArgumentException("스택에 요소가 없습니다.");
        }
        return min[minTop];
    }
}

