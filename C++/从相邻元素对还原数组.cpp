#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> restoreArray(vector<vector<int>>& adjacentPairs) {
        unordered_map<int, vector<int>> mp;
        unordered_map<int, vector<int>>::iterator it;
        for(auto ajacentPair: adjacentPairs) {
            mp[ajacentPair[0]].emplace_back(ajacentPair[1]);
            mp[ajacentPair[1]].emplace_back(ajacentPair[0]);
        }
        vector<int> ans(adjacentPairs.size()+1);
        for(it = mp.begin(); it != mp.end(); it++) {
            if(it->second.size() == 1) {
                ans[0] = it->first;
                break;
            }
        }
        ans[1] = mp[ans[0]][0];
        for(int i = 2; i <= adjacentPairs.size(); i++) {
            ans[i] = (ans[i-2]==mp[ans[i-1]][0]?mp[ans[i-1]][1]:mp[ans[i-1]][0]);
        }
        return ans;
    }
};

int main()
{
    
    return 0;
}
