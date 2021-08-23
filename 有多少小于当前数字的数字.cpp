#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> smallerNumbersThanCurrent(vector<int>& nums) {
        vector<int> ans;
        int n = nums.size();
        for(int i = 0; i < n; i++) {
            int temp_ans = 0;
            for(int j = 0; j < n; j++) {
                if(i == j)  continue;
                if(nums[i] > nums[j])   temp_ans++;
            }
            ans.emplace_back(temp_ans);
        }
        return ans;
    }
};

int main()
{
    
    return 0;
}
