package lecture3;

import java.util.ArrayList;
import java.util.List;

/**
 * 접시 무더기 문제
 * Stack 크기 3으로 가정
 */
public class Problem3_3 {
    public static void main(String[] args) {
        SetOfStack setOfStack = new SetOfStack();
        setOfStack.push(1);
        setOfStack.push(2);
        setOfStack.push(3);
        setOfStack.push(4);
        setOfStack.push(5);
        System.out.println(setOfStack.pop());
        System.out.println(setOfStack.pop());
        System.out.println(setOfStack.pop());
        System.out.println(setOfStack.pop());
        System.out.println(setOfStack.pop());

    }
}

class SetOfStack {
    List<int[]> stackSet;
    int listIdx;
    int top;

    public SetOfStack() {
        this.stackSet = new ArrayList<>();
        this.listIdx = -1;
        this.top = -1;
    }

    public void push(int input) {
        /* stackSet에 아무것도 없을 경우 */
        if (listIdx < 0) {
            int[] stack = new int[3];
            stack[++top] = input;
            stackSet.add(stack);
            listIdx++;
            return;
        }
        int[] stack = stackSet.get(listIdx);
        /* 하나의 stack이 가득 찰 경우 */
        if (top % 3 == 2) {
            int[] stackTemp = new int[3];
            stackTemp[0] = input;
            stackSet.add(stackTemp);
            listIdx++;
            top++;
        }
        /* stack이 가득 안찼을 경우 */
        else {
            ++top;
            stack[top % 3] = input;
        }
    }

    public int pop() {
        /* stackSet이 비어있는 경우 */
        if (listIdx < 0) {
            throw new IllegalArgumentException("스택에 요소가 없습니다.");
        }
        int[] stack = stackSet.get(listIdx);
        if (listIdx == 0 && top < 0) {
            throw new IllegalArgumentException("스택에 요소가 없습니다.");
        }
        int result = stack[top % 3];
        top--;
        if (top % 3 == 2) {
            listIdx--;
        }
        return result;
    }
}
