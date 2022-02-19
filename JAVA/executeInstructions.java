package leetcode;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/2/19 10:29
 **/
public class executeInstructions {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int l = s.length();
        int[] ans = new int[l];
        int i, j;
        for(i = 0; i < l; i++) {
            int nx = startPos[0];
            int ny = startPos[1];
            int temp = 0;
            for(j = i; j < l; j++) {
                if(s.charAt(j) == 'U') {
                    // 上
                    if(nx == 0) {
                        break;
                    } else {
                        nx--;
                        temp++;
                    }
                } else if(s.charAt(j) == 'D') {
                    // 下
                    if(nx == n-1) {
                        break;
                    } else {
                        nx++;
                        temp++;
                    }
                } else if(s.charAt(j) == 'L') {
                    // 左
                    if(ny == 0) {
                        break;
                    } else {
                        ny--;
                        temp++;
                    }
                } else {
                    // 右
                    if(ny == n-1) {
                        break;
                    } else {
                        ny++;
                        temp++;
                    }
                }
            }
            ans[i] = temp;
        }
        return ans;
    }
}
