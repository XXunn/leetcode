#include <iostream>
#include <vector>
#include <map>
#include <algorithm>
using namespace std;

class Solution {
public:
    static bool cmp(pair<int,int> a,pair<int,int> b) {
        return a.second > b.second;
    }
    vector<int> topKFrequent(vector<int>& nums, int k) {
        vector<int> ans;
        vector<pair<int,int>>temp;
        map<int,int>mp;
        for(int i = 0;i < nums.size(); i++)     mp[nums[i]]++;
        for(auto &num:mp) {
            temp.emplace_back(num.first,num.second);
        }
        sort(temp.begin(),temp.end(),cmp);
        for(int i = 0;i < k;i++)    ans.emplace_back(temp[i].first);
        return ans;
    }
};

int main()
{
    Solution slt;
    
    return 0;
}
