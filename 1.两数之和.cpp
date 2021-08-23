#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    map<int,int> mp;
    vector<int> ans;
    vector<int> twoSum(vector<int>& nums, int target) {
        int n = nums.size();
        mp.clear();
        for(int i = 0;i < n;i++) {
            if(mp.find(target-nums[i])!=mp.end()) {  
                ans.emplace_back(mp[target-nums[i]]);
                ans.emplace_back(i);
                return ans;
            } else {
                mp[nums[i]]=i;
            }
        }
        return ans;
    }
};

int main()
{
    
    return 0;
}
