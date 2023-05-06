package lecture1;

import java.util.Arrays;

/**
 * 문제 - 문자열에 중복된 문자가 들어있는지 확인하는 알고리즘 작성 (자료구조 추가로 사용하지 않기)
 * 시간복잡도 - O(N^2)
 * 공간복잡도 - O(1)
 */
public class Problem1 {
    public boolean isDuplicated(String input) {
        for (int i=0; i<input.length(); i++) {
            char alpha = input.charAt(i);
            for (int j=i+1; j<input.length(); j++) {
                if (alpha == input.charAt(j)) {
                    return true;
                }
            }
        }
        return false;
    }
}

/**
 * 정렬 후 검사
 * 시간 복잡도 O(NlogN)
 * 공간 복잡도 O(N)
 */

class Problem1Answer {
    public boolean isDuplicated(String input) {
        String[] words = input.split("");
        Arrays.sort(words);
        for (int i=0; i<words.length-1; i++) {
            if (words[i].equals(words[i+1])) {
                return false;
            }
        }
        return true;
    }
}
