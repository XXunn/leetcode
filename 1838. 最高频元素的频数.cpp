#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    int maxFrequency(vector<int>& nums, int k) {
        int len = nums.size();
        int res = 1;
        int sum = 0;
        int l,r;
        sort(nums.begin(), nums.end());
        for(l = 0, r = 1; r < len ; r++) {
            sum += (nums[r] - nums[r-1]) * (r - l);
            while(sum > k) {
                sum -= nums[r] - nums[l];
                l++;
            }
            res = max(res, r - l + 1);
        }
        return res;
    }
};

int main()
{
    
    return 0;
}
