#include <iostream>
#include <map>
#include <cstring>
#include <algorithm>
using namespace std;
class Solution {
public:
    map<int,int> mp;
    // int minDays(int n) {     //这种方法可能会超时
    //     if(n == 0) return 0;
    //     if(n == 1) return 1;
    //     if(n == 2) return 1;
    //     int dp[n+1];
    //     dp[0] = 0;
    //     dp[1] = dp[2] = 1;
    //     for(int i = 3;i <= n;i++) {
    //         dp[i] = min({dp[i/3]+dp[i%3]+1,dp[i/2]+dp[i%2]+1,i});
    //     }
    //     for(int i = 0;i <= n;i++) {
    //         cout << "dp[" << i << "]: " << dp[i] << endl;
    //     }
    //     return dp[n];
    //     //return dfs(n);
    // }
    int minDays(int n) {
        return dfs(n);
    }
    int dfs(int x) {
        if(x==0)    return 0;
        if(x==1)    return 1;
        if(x==2)    return 2;
        if(mp.count(x)) return mp[x];
        //return mp[x]=min({1+x%2+dfs(x/2),1+x%3+dfs(x/3),x});
        return mp[x] = min(dfs(x/2)+dfs(x%2)+1,dfs(x/3)+dfs(x%3)+1);
    }
};
int main()
{
    Solution slt;
    slt.minDays(6);
    return 0;
}
