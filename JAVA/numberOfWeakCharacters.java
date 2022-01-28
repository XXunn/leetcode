package leetcode;

import java.util.Arrays;

public class numberOfWeakCharacters {
    // 先按照攻击降序排列， 这样上面的肯定 >= 下面的
    // 按照防御升序排列, 这样如果上面的防御大于下面的, 那么攻击也一定大于下面的
    public int numberOfWeakCharacters(int[][] properties) {
        Arrays.sort(properties, (x1, x2) -> {
            return x1[0]==x2[0]?x1[1]-x2[1]:x2[0]-x1[0];
        });
        int defMax = properties[0][1], len = properties.length, ans = 0;
        for(int i = 1; i < len; i++) {
            if(properties[i][1] < defMax) {
                ans++;
            } else {
                defMax = properties[i][1];
            }
        }
        // for(int i = 0; i < properties.length; i++) {
        //     System.out.println(properties[i][0] +  "" + properties[i][1]);
        // }
        return ans;
    }
}
