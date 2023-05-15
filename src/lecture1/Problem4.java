package lecture1;

import java.util.ArrayList;

/**
 * 문제 - 주어진 문자열이 회문의 순열인지 아닌지 확인하는 함수를 작성해라
 * 회문이란? 아픙로 읽으나 뒤로 읽으나 같은 단어 혹은 구절, 순열이란 문자열의 재배치
 * 접근방식 - 소문자로 변경 후 공백 지우기 -> 문제 잘못 읽음
 *
 * -> 갯수 카운팅으로 풀 수 잇음(스터디)
 */
public class Problem4 {

    private static final char SPACE = ' ';
    private boolean answer = false;
    public boolean checkPalindrome(String input) {
        String newInput = input.toLowerCase().replaceAll("\\s", ""); // 소문자 변환 및 공백 제거
        ArrayList<String> list = new ArrayList<>();
        boolean[] visited = new boolean[input.length()];
        makePermutation(newInput.split(""), list, visited);
        return answer;
    }

    private void makePermutation(String[] newInput, ArrayList<String> list, boolean[] visited) {
        if (list.size() == newInput.length) {
            if (isPalindrome(list)) {
                answer = true;
            }
            return;
        }
        for (int i=0; i<newInput.length; i++) {
            if (visited[i]) {
                continue;
            }
            list.add(newInput[i]);
            visited[i] = true;
            makePermutation(newInput, list, visited);
            list.remove(list.size()-1);
            visited[i] = false;
        }
    }

    private boolean isPalindrome(ArrayList<String> list) {
        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            sb.append(s);
        }
        if (sb.toString().equals(sb.reverse().toString())) {
            return true;
        }
        return false;
    }
}
