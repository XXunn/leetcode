#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    int minimumOperations(string leaves) {
        vector<vector<int>> dp(3,vector<int>(leaves.size(),0));
        for(int i = 0;i < leaves.size();i++) {
            if(i < 1) {
                dp[0][i] = (leaves[i]!='r');
            } else {
                dp[0][i] = dp[0][i-1] + (leaves[i]!='r') ;
            }
            if(i < 1) {
                dp[1][i] = dp[0][i];
            } else {
                dp[1][i] = min(dp[0][i-1],dp[1][i-1]) + (leaves[i]!='y');
            }
            if(i < 2) {
                dp[2][i] = dp[1][i];
            } else {
                dp[2][i] = min(dp[1][i-1],dp[2][i-1]) + (leaves[i]!='r');
            }
        }
        return dp[2].back();
    }
};

int main()
{
    
    return 0;
}
