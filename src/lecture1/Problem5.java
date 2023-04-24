package lecture1;

import java.util.ArrayList;
import java.util.List;

/**
 * 문제 - 문자 삽입, 문자 삭제, 문자 교체를 통해 문자 2개를 같게 만들기 위한 편집 횟수가 1회 이내인지 확인하는 함수를 작성하라
 */
public class Problem5 {
    private boolean answer = false;
    public boolean isPossibleToEditAtOneTime(String input1, String input2) {
        String longWord;
        String shortWord;
        if (input1.length() >= input2.length()) {
            longWord = input1;
            shortWord = input2;
        } else {
            shortWord = input1;
            longWord = input2;
        }
        checkInsert(longWord, shortWord);
        checkDelete(longWord, shortWord);
        checkChange(longWord, shortWord);
        return answer;
    }

    private void checkChange(String longWord, String shortWord) {
        if (longWord.length() != shortWord.length()) { // 길이가 다르면 서로 교체를 못하므로 중단
            return;
        }
        char[] longWords = longWord.toCharArray();
        char[] shortWords = shortWord.toCharArray();
        List<Integer> missIdx = new ArrayList<>();
        for (int i=0; i<longWords.length; i++) {
            if (longWords[i] != shortWords[i]) {
                missIdx.add(i);
            }
        }
        if (missIdx.size() <= 1) {
            answer = true;
        }
    }

    private void checkDelete(String longWord, String shortWord) {
        if (longWord.length() != shortWord.length()+1) { // 길이가 longWord가 1개 더많지 않으면 삭제를 못하므로 중단
            return;
        }
        int missCount = calMissCount(longWord, shortWord);
        if (missCount<=1) {
            answer = true;
        }
    }

    private void checkInsert(String longWord, String shortWord) {
        if (longWord.length() == shortWord.length()) { // 문자열 길이가 같으면 삽입을 못하므로 중단
            return;
        }
        int missCount = calMissCount(longWord, shortWord);
        if (missCount <= 1) {
            answer = true;
        }
    }

    private int calMissCount(String longWord, String shortWord) {
        int missCount = 0;
        int idx = 0;
        for (int i=0; i<longWord.length(); i++) {
            if (longWord.charAt(i) != shortWord.charAt(idx)) {
                missCount++;
                idx--;
            }
            idx++;
            if (idx == shortWord.length()) {
                break;
            }
        }
        return missCount;
    }
}
