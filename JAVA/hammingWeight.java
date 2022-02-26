package leetcode;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/2/26 10:59
 **/
public class hammingWeight {
    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
        int x = n;
        int ans = 0;
        while(x != 0) {
            x &= (x-1);
            ans++;
        }
        // for(int i = 0; i < 32; i++) {
        //     if((x & 1) == 1) {
        //         ans++;
        //     }
        //     x >>= 1;
        // }

        // 如果用下面这个循环，则传入负数的时候通不过
        // while(x != 0) {
        //     System.out.println(x);
        //     if((x & 1) == 1) {
        //         ans++;
        //     }
        //     x >>= 1;
        // }
        return ans;
    }

    public static void main(String[] args) {
        hammingWeight(-3);
    }
}
