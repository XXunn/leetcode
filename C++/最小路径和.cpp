#include<iostream>
#include<cstring>
#include<algorithm>
#include<vector>
using namespace std;

class Solution {
public:
    int minPathSum(vector<vector<int> >& grid) {
        int n = grid.size(),m = grid[0].size();
        int dp[n+1][m+1];
        memset(dp,0,sizeof(dp));
        dp[0][0] = grid[0][0];
        for(int i = 1;i < n;i++) 
            dp[i][0] = dp[i-1][0]+grid[i][0];
        for(int j = 1;j < m;j++)
            dp[0][j] = dp[0][j-1]+grid[0][j];
        for(int i = 1;i < n;i++) {
            for(int j = 1;j < m;j++) {
                dp[i][j] = grid[i][j] + min(dp[i-1][j],dp[i][j-1]);
            }
        }
        for(int i = 0;i < n;i++) {
            for(int j = 0;j < m;j++) {
                cout << dp[i][j] << " ";
            }
            cout << endl;
        }
        return dp[n-1][m-1];
    }
    
};

int main() {
    Solution slt;
    vector<vector<int> >vec;
    vector<int> tmp1,tmp2,tmp3;
    tmp1.push_back(1);tmp1.push_back(3);tmp1.push_back(1);
    tmp2.push_back(1);tmp2.push_back(5);tmp2.push_back(1);
    tmp3.push_back(4);tmp3.push_back(2);tmp3.push_back(1);
    vec.push_back(tmp1);
    vec.push_back(tmp2);
    vec.push_back(tmp3);
    slt.minPathSum(vec);
}