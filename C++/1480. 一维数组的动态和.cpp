#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> runningSum(vector<int>& nums) {
        int n = nums.size();
        if(n == 0 || n == 1)    return nums;
        for(int i = 1; i < n; i++)  nums[i] += nums[i-1];
        return nums;
    }
};

int main()
{
    
    return 0;
}
