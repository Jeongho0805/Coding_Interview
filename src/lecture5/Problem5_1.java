package lecture5;

public class Problem5_1 {
    
    public int insertBit(int bit1, int bit2, int i, int j) {
        int afterMoveNumber2 = bit2 << i;
        return bit1 | afterMoveNumber2;
    }
}
