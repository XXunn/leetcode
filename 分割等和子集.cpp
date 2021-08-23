#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    int flag = 0;
    int n;
    bool canPartition(vector<int>& nums) {
        int sum = 0;    n = nums.size();
        for(auto num : nums)    sum += num;
        if(sum & 1) return false;
        dfs(nums, 0, sum/2);
        return flag == 1;
    }
    void dfs(vector<int> nums, int cur, int sum) {
        if(sum == 0) {
            flag = 1;
            return ;
        }
        if(cur == n)    return;
        for(int i = cur; i < n; i++) {
            dfs(nums, cur+1, sum-nums[i]);
            dfs(nums, cur+1, sum);
        }
    }
};

int main()
{
    
    return 0;
}
