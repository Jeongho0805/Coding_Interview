package lecture5;

/**
 * 정수 A와 B를 2진수로 표현할 때 A를 B로 바꾸기 위해 뒤집어야 하는 비트의 갯수를 구하는 함수 작성
 */
public class Problem5_6 {

    static int reverseCount = 0;
    public static int reverseCount(int input1, int input2) {
        String binary1 = Integer.toBinaryString(input1);
        String binary2 = Integer.toBinaryString(input2);

        // 자릿수가 다를 때는 넘어가는 자릿수의 숫자가 1이면 다 카운트 해줘야함 (적은수는 다 0이기때문에)
        if (binary1.length() > binary2.length()) {
            calReverseCount(binary1, binary2);
            return reverseCount;
        }
        calReverseCount(binary2, binary1);
        return reverseCount;
    }

    private static void calReverseCount(String longerBinary, String shorterBinary) {
        int extraDigit = longerBinary.length() - shorterBinary.length();
        for (int i=0; i<extraDigit; i++) {
            if (longerBinary.charAt(i) == '1') {
                reverseCount++;
            }
        }
        for (int i=extraDigit; i<longerBinary.length(); i++) {
            if (longerBinary.charAt(i) != shorterBinary.charAt(i - extraDigit)) {
                reverseCount++;
            }
        }
    }
}
