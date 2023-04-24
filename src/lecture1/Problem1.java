package lecture1;

/**
 * 문제 - 문자열에 중복된 문자가 들어있는지 확인하는 알고리즘 작성 (자료구조 추가로 사용하지 않기)
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
