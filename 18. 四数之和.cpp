#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<vector<int>> ans;
    set<vector<int>> tempans;
    vector<vector<int>> fourSum(vector<int>& nums, int target) {
        sort(nums.begin(),nums.end());
        vector<int> temp;
        dfs(0,nums,temp,0,0,target);
        for(auto x:tempans) ans.emplace_back(x);
        return ans;
    }
    void dfs(int step, vector<int> nums, vector<int> temp, int cur, int sum, int target) {
        if(step == 4) {
            if(sum == target)   tempans.insert(temp);
                //ans.emplace_back(temp);
            return ;
        }
        if(cur >= nums.size())   return;
        if(nums[cur] = nums[cur-1]) return;
        dfs(step,nums,temp,cur+1,sum,target);
        temp.emplace_back(nums[cur]);
        dfs(step+1,nums,temp,cur+1,sum+nums[cur],target);
    }
};

int main()
{
    
    return 0;
}
