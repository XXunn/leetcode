#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    int pos[100010];
    int neg[100010];
    int ans = 0;
    int getMaxLen(vector<int>& nums) {
        pos[0] = neg[0] = 0;
        int n = nums.size();
        for(int i = 0;i < n;i++) {
            if(nums[i] == 0) {
                pos[i+1] = neg[i+1] = 0;
            } else if(nums[i] > 0) {
                pos[i+1] = pos[i] + 1;
                neg[i+1] = (neg[i]?neg[i]+1:0);
            } else {
                pos[i+1] = (neg[i]?neg[i]+1:0);
                neg[i+1] = pos[i] + 1;
            }
            ans = max(ans,pos[i+1]);
        }
        return ans;
    }
};

int main()
{
    
    return 0;
}
