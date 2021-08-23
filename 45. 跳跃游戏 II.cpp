#include<iostream>
#include<vector>
using namespace std;

class Solution {
public:
    int jump(vector<int>& nums) {
        int len = nums.size();
        int* dp = new int[len]();
        for(int i = 1,j = 0; i < len; i++) {
            while(j + nums[j] < i)  ++j;
            dp[i] = dp[j] + 1;
        }
        int ans = dp[len-1];
        delete[] dp;
        return ans;
    }
};

int main()
{

    return 0;
}