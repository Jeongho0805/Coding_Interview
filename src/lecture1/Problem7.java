package lecture1;

//public class Problem7 {
//    public int[][] rotation(int[][] map) {
//
//        int n = map.length;
//        int plus = n % 2;
//        int r = n / 2;
//
//
//        int startRow = 0;
//        int startCol = 0;
//        int lastRow = n-1;
//        int lastCol = n-1;
//        int startCount = n-1;
//        while (r-- > 0) {
//            if (startCount == 1) {
//                break;
//            }
//            int row = startRow;
//            int col = startCol;
//            int tempStart = map[row][col];
//            int temp;
//            for (int i=0; i<startCount; i++) {
//                row = row+i;
//                col = col+i;
//                while(true) {
//                    int nextRow = lastRow - row;
//                    int nextCol = lastCol - col;
//                }
//            }
//
//            startCount -= 2;
//        }
//    }
//}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 2 => 1   / 회전 사이즈
 * 3 => 1
 * 4 => 2   / 3, 1
 * 5 => 2   / 4, 2
 * 6 => 3   / 5, 3, 1
 * 7 => 3
 *
 *
 *
 *
 */

public class Problem7 {
    public static void main(String args[]) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        //N
        int N=Integer.parseInt(stringTokenizer.nextToken());
        int[][] map=new int[N][N];
        for(int i=0;i<N;i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for(int j=0;j<N;j++){
                map[i][j]=Integer.parseInt(stringTokenizer.nextToken());

            }

        }
        for(int i=0;i<N/2;i++){
            for(int j=i;j<N-i-1;j++){
                //temp에저장
                int temp=map[j][N-1-i];
                map[j][N-1-i]=map[i][j];
                map[i][j]=map[N-1-j][i];
                map[N-1-j][i]=map[N-1-i][N-1-j];
                map[N-1-i][N-1-j]=temp;
            }
        }
        System.out.println();
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print(map[i][j]+"d ");
            }
            System.out.println();
        }
    }
}
