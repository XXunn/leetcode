#include <iostream>
#include <vector>
using namespace std;
class Solution {
public:
    // void moveZeroes(vector<int>& nums) {
    //     int i,j;
    //     i = j = 0;
    //     int n = nums.size();
    //     for(;i < n;i++) {
    //         if(nums[i]==0) {
    //             continue;
    //         } else {
    //             nums[j++]=nums[i];
    //         }
    //     }
    //     for(j;j < n;j++) {
    //         nums[j] = 0;
    //     }
    // }
    void moveZeroes(vector<int>& nums) {
        for (int lastNonZeroFoundAt = 0, cur = 0; cur < nums.size(); cur++) {
            if (nums[cur] != 0) {
                swap(nums[lastNonZeroFoundAt++], nums[cur]);
            }
        }
    }

};
int main()
{
    
    return 0;
}
