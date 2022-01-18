#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    vector<int> vec[200500];
    vector<int> ans;
    vector<int> findDiagonalOrder(vector<vector<int>>& nums) {
        for(int i = 0;i < nums.size();i++) {
            for(int j = 0;j < nums[i].size();j++) {
                vec[i+j].push_back(nums[i][j]);
            }
        }
        for(int i = 0;i <= 200000;i++) {
            if(vec[i].size()==0)    continue;
            for(int j = vec[i].size()-1;j >= 0;j--) {
                ans.push_back(vec[i][j]);
            }
        }
        return ans;
    }
};

// class Solution {
// public:
//     vector<int> findDiagonalOrder(vector<vector<int>>& nums) {
//         vector<int>ans;
//         int maxn = nums.size();
//         for(int i = 0;i < nums.size();i++) {
//             if(maxn < nums[i].size()) {
//                 maxn = nums[i].size();
//             }
//         }
//         for(int k = 0;k < 2*maxn-1;k++) {
//             int l = k,r = 0;
//             while(l>=0) {
//                 if(l>=nums.size() || r>=nums[l].size()) {
//                     l--;
//                     r++;
//                 } else {
//                     ans.push_back(nums[l][r]);
//                     l--;
//                     r++;
//                 }
//             }
//         }
//         return ans;
//     }
// };

int main()
{
    Solution slt;
    vector<int>v;vector<int>vv;vector<int>vvv;
    vector<vector<int>> nums;
    v.push_back(1);
    v.push_back(2);
    v.push_back(3);
    nums.push_back(v);
    vv.push_back(4);
    vv.push_back(5);
    vv.push_back(6);
    nums.push_back(vv);
    vvv.push_back(7);
    vvv.push_back(8);
    vvv.push_back(9);
    nums.push_back(vvv);
    slt.findDiagonalOrder(nums);

    return 0;
}
