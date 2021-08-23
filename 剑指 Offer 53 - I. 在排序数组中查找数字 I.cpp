#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    map<int, int> mp;
    int search(vector<int>& nums, int target) {
        for(auto num : nums) {
            mp[num]++;
        }
        return mp[target];
    }
};

int main()
{
    
    return 0;
}
