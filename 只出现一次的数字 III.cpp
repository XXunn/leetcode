#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
    vector<int> singleNumber(vector<int>& nums) {
        int x_or = 0;
        for (int num : nums) {
            x_or ^= num;
        } 
        int mask = x_or & (-x_or);
        vector<int> ans(2,0);
        for (int num : nums) {
            if ( (num & mask) == 0) {
                ans[0] ^= num;
            } else {
                ans[1] ^= num;
            }
        }
        return ans;
    }
};


// class Solution {
// public:
//     vector<int> singleNumber(vector<int>& nums) {
//         int n = nums.size();
//         vector<int> vis(n, 0);
//         vector<int> ans;
//         for(int i = 0; i < n; i += 2) {
//             if(nums[i] == nums[i+1]) {
//                 vis[nums[i]] = vis[nums[i+1]] = 2;
//             } else {
//                 vis[nums[i]]++;
//                 vis[nums[i+1]]++;
//             }
//         }
//         for(int i = 0; i < n; i++) {
//             if(vis[i] == 1) ans.emplace_back(nums[i]);
//         }
//         return ans;
//     }
// };



// class Solution {
// public:
//     vector<int> singleNumber(vector<int>& nums) {
//         int n = nums.size();
//         unordered_map<int, int> mp;
//         vector<int> ans;
//         if(n == 2)  return nums;
//         for(int i = 0; i < n; i += 2) {
//             if(nums[i] == nums[i+1]) {
//                 mp[nums[i]] += 2;
//             } else {
//                 mp[nums[i]] += 1;
//                 mp[nums[i+1]] += 1;
//             }
//         }
//         for(auto x:mp) {
//             cout << x.first << " " << x.second << endl;
//             if(x.second == 1) {
//                 ans.emplace_back(x.first);
//             }
//         }
//         return ans;
//     }
// };


// class Solution {
// public:
//     vector<int> singleNumber(vector<int>& nums) {
//         sort(nums.begin(), nums.end());
//         int n = nums.size();
//         vector<int> ans;
//         if(nums[0] != nums[1])  ans.emplace_back(nums[0]);
//         if(nums[n-1] != nums[n-2])  ans.emplace_back(nums[n-1]);
//         for(int i = 1; i < n-1; i++) {
//             if(nums[i] != nums[i+1] || nums[i] != nums[i-1]) 
//                 ans.emplace_back(nums[i]);
//         }
//         return ans;
//     }
// };

int main()
{

    return 0;
}