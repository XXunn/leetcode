#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    int minPairSum(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        int len = nums.size();
        int res = 0;
        for(int i = 0, j = len - 1; i < j; i++,j--) {
            res = max(res, nums[i]+nums[j]);
        }
        return res;
    }
};

int main()
{
    

    return 0;
}
