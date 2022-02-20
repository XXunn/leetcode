package leetcode;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/2/20 10:28
 **/
public class isOneBitCharacter {
    public boolean isOneBitCharacter(int[] bits) {
        int n = bits.length, i;
        for(i = 0; i < n-1; ) {
            if(bits[i] == 0) {
                i++;
            } else {
                i+=2;
            }
        }
        return i==n-1;
    }
}
