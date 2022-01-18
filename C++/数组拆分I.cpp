#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

class Solution {
public:
    int arrayPairSum(vector<int>& nums) {
        int sum = 0;int len = nums.size();
        sort(nums.begin(),nums.end());
        for(int i = 0;i < len;i+=2) {
            sum += nums[i];
        }
        return sum;
    }
};

int main()
{
    Solution slt;
    return 0;
}
