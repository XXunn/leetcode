#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int ans = 0;
        int maxn = -101;
        for(int i = 0; i < nums.size(); i++) {
            ans += nums[i];
            maxn = max(ans,maxn);
            if(ans < 0)     ans = 0;
        }
        return maxn;
    }
};

int main()
{
    
    return 0;
}
