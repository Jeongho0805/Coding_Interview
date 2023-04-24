package lecture1;

import java.util.Arrays;

/**
 * 문제 - 문자열 두 개가 주어졌을 때 이 두리 서로 순열 관계에 잇는지 확인하는 메서드를 작성해라
 * 순열 관계 뜻 : 두 문자열에서 사용된 문자는 같은데 문자의 순서만 다른 형태라는 것을 의미한다.
 */
public class Problem2 {
    public boolean checkPermutation(String word1, String word2) {
        if (word1.length() != word2.length()) { // 문자열 길이가 서로 다르면 순열 관계가 될 수 없다.
            return false;
        }
        char[] word1Array = word1.toCharArray();
        char[] word2Array = word2.toCharArray();
        Arrays.sort(word1Array);
        Arrays.sort(word2Array);

        for (int i=0; i<word1.length(); i++) {
            if (word1Array[i] != word2Array[i]) {
                return false;
            }
        }
        return true;
    }
}
