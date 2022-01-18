#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> countBits(int n) {
        vector<int> dp(n+1, 0);
        for(int i = 1; i <= n; i++) {
            dp[i] = dp[i>>1];
            if(i&1) ++dp[i];
        };
        return dp;
    }
};

// class Solution {
// public:
//     vector<int> countBits(int n) {
//         vector<int> ans;
//         int num;
//         for(int i = 0; i < n; i++) {
//             int temp = 0;
//             num = i;
//             while(num) {
//                 num = num&(num-1);
//                 temp++;
//             }
//             ans.emplace_back(temp);
//         }
//         return ans;
//     }
// };

int main()
{
    
    return 0;
}
