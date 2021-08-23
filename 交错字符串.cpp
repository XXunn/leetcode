#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    bool isInterleave(string s1, string s2, string s3) {
        int l1 = s1.size(), l2 = s2.size(), l3 = s3.size();
        if(l1+l2!=l3)   return false;
        auto dp = vector<vector<int>>(l1+1,vector<int>(l2+1,false));
        dp[0][0] = 1;
        for(int i = 0;i <= l1+1;i++) {
            for(int j = 0;j <= l2+1;j++) {
                if(i>0) dp[i][j] |= (dp[i-1][j] && s3[i+j]==s1[i]);
                if(j>0) dp[i][j] |= (dp[i][j-1] && s3[i+j]==s2[j]);
            }
        }
        return dp[l1][l2];
    }
};

int main()
{
    
    return 0;
}
