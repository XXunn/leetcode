#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool containsNearbyAlmostDuplicate(vector<int>& nums, int k, int t) {
        set<long> s;
        int n = nums.size();
        for(int i = 0; i < n;i++) {
            auto lower = s.lower_bound(nums[i]);
            if(lower != s.end() && *lower - nums[i] <= t)   return true;
            auto upper = s.upper_bound(nums[i]);
            if(upper != s.begin() && nums[i] - *--upper <= t) return true;
            s.insert(nums[i]);
            if(s.size() > k)    s.erase(nums[i-k]);
        }
        return false;
    }
};

int main()
{
    
    return 0;
}
