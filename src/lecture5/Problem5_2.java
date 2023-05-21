package lecture5;

/**
 * 0과 1사이의 수를 2진수 형태 문자열로 출력해라 (길이는 32이하)
 */
public class Problem5_2 {
    public static String toBinary(double input) {
        StringBuilder sb = new StringBuilder();
        int count = 32;
        sb.append("0.");

        while(count -- > 0) {
            input = input * 2;
            if (input  >= 1) {
                input -= 1;
                sb.append("1");
            } else {
                sb.append("0");
            }

            if (input % 1 == 0) {
                return sb.toString();
            }
        }
        return "ERROR";
    }

}
