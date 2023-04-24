package lecture1;

/**
 * 문제 - 문자열에 들어 있는 모든 공백을 %20으로 바꿔주는 메서드를 작성해라. 자바로 구현한다면 배열안에서 작업할 수 있도록
 * CharacterArray를 사용해라!
 */
public class Problem3 {
    private static final char[] URL = {'%','2','0'};

    public String toUrl(String input, final int length)  {
        int spcaeCount = 0;
        for (int i=0; i<input.length(); i++) {
            if (input.charAt(i) == ' ') {
                spcaeCount++;
            }
        }
        char[] temp = new char[length - spcaeCount + spcaeCount * 3];
        int idx = 0;
        for (int i=0; i<input.length(); i++) {
            if (input.charAt(i) != ' ') {
                temp[idx] = input.charAt(i);
                idx++;
            } else {
                for (int j=0; j<URL.length; j++) {
                    temp[idx] = URL[j];
                    idx++;
                }
            }
        }
        return String.valueOf(temp);
    }
}
