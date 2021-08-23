#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    int singleNumber(vector<int>& nums) {
        map<int,int> mp;
        int ans;
        for(auto num: nums) {
            mp[num]++;
        }
        for(auto m : mp) {
            if(m.second == 1) {
                ans = m.first;
            }
        }
        return ans;
    }
};

int main()
{
    
    return 0;
}
