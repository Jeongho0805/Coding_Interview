package lecture1;

/**
 * 문제 - 문자열에 중복된 문자가 들어있는지 확인하는 알고리즘 작성 (자료구조 추가로 사용하지 않기)
 */
public class Problem1 {
    public boolean isDuplicated(String input) {
        StringBuilder sb = new StringBuilder();
        for (String alpha : input.split("")) {
            if (sb.toString().contains(alpha)) {
                return true;
            }
            sb.append(alpha);
        }
        return false;
    }
}
