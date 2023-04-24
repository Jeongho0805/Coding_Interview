package lecture1;

import java.util.Arrays;

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
