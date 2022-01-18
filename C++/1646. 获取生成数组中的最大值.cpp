#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    int getMaximumGenerated(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        
        int dp[101] = {0};
        dp[0] = 0;
        dp[1] = 1;
        int max = 1;
        for (int i = 2; i <= n; i++) {
            int half = i >> 1;
            if (i % 2) {
                dp[i] = dp[half] + dp[half + 1];
            } else {
                dp[i] = dp[half];
            }
            max = (dp[i] > max) ? dp[i] : max;
        }
        return max;
    }
};
int main()
{
    
    return 0;
}
