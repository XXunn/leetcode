#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool isStraight(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        int zero = 0;
        for (int i = 0; i < 4; i ++) {
            if (nums[i] == 0) {
                zero++;
                continue;
            } 
            if (nums[i] == nums[i+1]) {
                return false;
            }
            zero -= nums[i+1]-nums[i] - 1;
        }
        return zero >= 0;
    }
};

int main()
{
    
    return 0;
}
