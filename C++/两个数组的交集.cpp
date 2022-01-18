#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
        vector<int> ans;
        set<int> Tempans;
        map<int, int> mp;
        int n1 = nums1.size(), n2 = nums2.size();
        if (n1 > n2) {
            for(auto num : nums2) {
                mp[num]++;
            }
            for(auto num : nums1) {
                if(mp.count(num) > 0) {
                    Tempans.insert(num);
                }
            }
        } else {
            for(auto num : nums1) {
                mp[num]++;
            }
            for(auto num : nums2) {
                if(mp.count(num) > 0) {
                    Tempans.insert(num);
                }
            }
        }
        for(auto x : Tempans) {
            ans.emplace_back(x);
        }
        return ans;
    }
};

int main()
{
    
    return 0;
}
