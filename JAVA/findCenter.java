package leetcode;

/**
 * @author szx
 * @version 1.0
 * @description: TODO
 * @date 2022/2/19 9:41
 **/
public class findCenter {
    /**
     * 如果一个点是中心，那么在所有的edge中都会出现，其他点则只会出现一次
     * @param edges
     * @return
     */
    public int findCenter(int[][] edges) {
        return edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1] ? edges[0][0] : edges[0][1];
    }

    // public int findCenter(int[][] edges) {
    //     int n = edges.length, ans=0;
    //     int[] cnt = new int[n+2];
    //     for(int i = 0; i < n; i++) {
    //         cnt[edges[i][0]]++;
    //         cnt[edges[i][1]]++;
    //     }
    //     for(int i = 1; i <= n+1; i++) {
    //         if(cnt[i] == n) {
    //             ans = i;
    //             break;
    //         }
    //     }
    //     return ans;
    // }
}
