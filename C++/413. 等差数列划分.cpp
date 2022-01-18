#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    int numberOfArithmeticSlices(vector<int>& nums) {
        int n = nums.size();
        int ans = 0;
        for(int i = 0; i < n - 2; i++) {
            int d = nums[i+1] - nums[i];
            for(int j = i + 1; j < n - 1; j++) {
                if(nums[j+1] - nums[j] == d) {
                    ans++;
                } else {
                    break;
                }
            }
        }
        return ans;
    }
};

int main()
{
    
    return 0;
}
