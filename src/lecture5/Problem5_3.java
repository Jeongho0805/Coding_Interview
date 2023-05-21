package lecture5;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 어떤 정수의 비트 하나를 0에서 1로 바꿀 수 있다. 1이 연속으로 나올 수 있는 가장 긴 길이를 구해라
 */
public class Problem5_3 {
    public static int reverseInteger(int input) {
        String binary = Integer.toBinaryString(~input);
        StringTokenizer st = new StringTokenizer(binary, "1");

        List<Integer> lengthList = new ArrayList<>();
        while(st.hasMoreTokens()) {
            lengthList.add(st.nextToken().length());
        }

        int max = Integer.MIN_VALUE;
        for (int i=0; i<lengthList.size()-1; i++) {
            max = Math.max(max, lengthList.get(i) + lengthList.get(i+1));
        }
        return max + 1;
    }
}
