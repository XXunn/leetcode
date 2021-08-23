#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    int triangleNumber(vector<int>& nums) {
        if(nums.size()<3) return 0;
        int ans = 0;
        sort(nums.begin(), nums.end());
        for(int i = nums.size()-1; i>=2; --i){
            int j=0;
            int k=i-1;
            while(j < k){
                if(nums[j]+nums[k]>nums[i]){
                    ans += k-j;
                    --k;
                } else {
                    ++j;
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
