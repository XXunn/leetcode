#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<vector<int>> ans;
    vector<vector<int>> combinationSum(vector<int>& candidates, int target) {
        vector<int>temp;
        sort(candidates.begin(),candidates.end());
        dfs(candidates,temp,target,target,0);
        return ans;
    }
    void dfs(vector<int> candidates,vector<int> temp,int curValue,int target,int cur) {
        if(curValue == 0) {
            ans.emplace_back(temp);
            return;
        } else if(curValue < 0) {
            return;
        } else {
            for(int i = cur;i < candidates.size();i++) {
                temp.emplace_back(candidates[i]);
                curValue -= candidates[i];
                if(curValue < 0)    return;
                dfs(candidates,temp,curValue,target,i);
                temp.pop_back();
                curValue += candidates[i];
            }
        }
        return;
    }
};

int main()
{
    
    return 0;
}
