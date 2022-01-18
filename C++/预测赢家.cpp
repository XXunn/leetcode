#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    bool PredictTheWinner(vector<int>& nums) {
        return findMax(nums,0,nums.size()-1,1) >= 0;
    }
    int findMax(vector<int> nums,int start,int end,int cur) {
        if(start==end)  return nums[start]*cur;
        int left = nums[start]*cur + findMax(nums,start+1,end,-cur);
        int right = nums[end]*cur + findMax(nums,start,end-1,-cur);
        return max(left*cur,right*cur)*cur;
    }
};

int main()
{
    
    return 0;
}
