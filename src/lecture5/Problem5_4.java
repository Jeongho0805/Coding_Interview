package lecture5;

/**
 * 양의 정수가 하나 주어졌을 때, 이 숫자를 2진수로 표기하였을 때 1비트의 갯수가 같은
 * 숫자 중에서 가장 작은 수와 가장 큰수를 구해라.
 */
public class Problem5_4 {
    public static int[] CalMinMax(int input) {
        String binary = Integer.toBinaryString(input);
        int length = binary.length();

        int count = 0;
        for (int i=0; i<length; i++) {
            if (binary.charAt(i) == '1') {
                count++;
            }
        }
        int countForMin = count;
        StringBuilder sb = new StringBuilder();
        while (length-- > 0) {
            if (count != 0) {
                sb.append("1");
                count--;
            } else {
                sb.append("0");
            }
        }
        int max = Integer.parseInt(sb.toString(), 2);
        sb = new StringBuilder();
        while (countForMin-- > 0) {
            sb.append("1");
        }
        int min = Integer.parseInt(sb.toString(), 2);
        return new int[]{min, max};
    }
}
