package lecture5;

import java.util.ArrayList;
import java.util.List;

/**
 * 명령어를 가능한 적게 사용하여 주어진 정수의 짝수번째 비트의 값과 홀수번째 비트의 값을
 * 바꾸는 프로그램을 작성해라 (짝은 같다는 가정하에 풀이 진행함 -> 홀수 일 경우 앞에 0 붙이기)
 */
public class Problem5_7 {
    public static String toSwitchBinary(int input) {
        String binary = Integer.toBinaryString(input);
        int length = binary.length();
        // 자릿수 홀수이면 앞에 1추가
        if (binary.length() % 2 != 0) {
            length++;
            binary = "1" + binary;
        }
        List<Character> odd = new ArrayList<>();
        List<Character> even = new ArrayList<>();
        for (int i=0; i<length; i++) {
            if (i % 2 == 0) {
                even.add(binary.charAt(i));
            } else {
                odd.add(binary.charAt(i));
            }
        }

        StringBuilder answer = new StringBuilder();
        for (int i=0; i<length/2; i++) {
            answer.append(odd.get(i));
            answer.append(even.get(i));
        }
        return answer.toString();
    }
}
