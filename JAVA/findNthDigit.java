package leetcode;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/3/9 23:04
 **/
public class findNthDigit {
    public int findNthDigit(int n) {
        long st = 1,  cnt = 9;
        int digit = 1;
        while(n > cnt) {
            n-=cnt;
            st*=10;
            digit++;
            cnt = 9*st*digit;
        }
        long num = st + (n-1)/digit;
        return Long.toString(num).charAt((n-1)%digit)-'0';
    }
}
