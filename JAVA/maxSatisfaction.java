package leetcode;

import java.util.Arrays;

public class maxSatisfaction {

    public int maxSatisfaction(int[] satisfaction) {
        int n = satisfaction.length, cur = 0;
        // 升序
        Arrays.sort(satisfaction);
        // ans为对应最终答案, cur为后缀和, temp为当指向i时,对应的花费
        int ans = 0, temp = 0;
        for(int i = n-1; i >= 0; i++) {
            cur += satisfaction[i];
            if(temp + cur > temp) {
                temp += cur;
            }
            ans = Math.max(ans, temp);
        }
        return ans;
    }

    //public int maxSatisfaction(int[] satisfaction) {
    //    int ans = 0, index = 0, sum = 0;
    //    int cnt = 1;
    //    int n = satisfaction.length;
    //    Arrays.sort(satisfaction);
    //    if(n == 0 || satisfaction[n-1] < 0) {
    //        return 0;
    //    }
    //    for(int i = 0; i < n; i++) {
    //        if(satisfaction[i] > 0) {
    //            index = i;
    //            while(i < n) {
    //                sum += satisfaction[i];
    //                i++;
    //            }
    //        }
    //    }
    //    index--;
    //    System.out.println("sum: " + sum +  " curIndex:" + index);
    //    while(index >= 0 && sum + satisfaction[index] > 0) {
    //        System.out.println(satisfaction[index]) ;
    //        index--;
    //    }
    //    index++;
    //    System.out.println("index: " + index);
    //    for(; index < n; index++) {
    //        System.out.print(satisfaction[index] + " ");
    //        ans += cnt*satisfaction[index];
    //        cnt++;
    //    }
    //    return ans;
    //}
}
