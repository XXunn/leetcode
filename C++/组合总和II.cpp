#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<vector<int>> ans;
    vector<int> candidates;
    vector<int> temp;
    vector<vector<int>> combinationSum2(vector<int>& candidates, int target) {
        sort(candidates.begin(),candidates.end());
        this->candidates = candidates;
        dfs(0,target);
        return ans;
    }
   void dfs(int index,int target) {
       if(target == 0) {
           ans.emplace_back(temp);
           return;
       } else if(target < 0) {
           return;
       }
       for(int i = index;i < candidates.size();i++) {
           if(i!=index && candidates[i] == candidates[i-1])     continue;
           temp.emplace_back(candidates[i]);
           dfs(i + 1,target-candidates[i]);
           temp.pop_back();
       }
       return;
   }
};

int main()
{
    
    return 0;
}
