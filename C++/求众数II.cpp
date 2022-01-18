#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    vector<int> majorityElement(vector<int>& nums) {
        vector<int> ans;
        if(nums.empty())    return  ans;
        int cand1 = nums[0],cnt1 = 0;
        int cand2 = nums[0],cnt2 = 0;
        for(auto num : nums) {
            if(cand1 == num) {
                cnt1++;
                continue;
            }
            if(cand2 == num) {
                cnt2++;
                continue;
            }
            if(cnt1 == 0) {
                cand1 = num;
                cnt1++;
                continue;
            }
            if(cnt2 == 0) {
                cand2 = num;
                cnt2++;
                continue;
            }
            cnt1--;
            cnt2--;
        }
        cnt1 = 0;
        cnt2 = 0;
        for(auto num : nums) {
            if(cand1 == num)    cnt1++;
            else if(cand2 == num)    cnt2++;
        }
        if(cnt1 > nums.size()/3)    ans.push_back(cand1);
        if(cnt2 > nums.size()/3)    ans.push_back(cand2);
        return ans;
    }
};

int main()
{
    
    return 0;
}
