#include <bits/stdc++.h>

using namespace std;
class Solution {
public:
    vector<int> nums;
    vector<int> temp;
    vector<vector<int>> ans;
    int k;
    vector<vector<int>> combinationSum3(int k, int n) {
        this->k = k;
        for(int i = 1;i <= 9;i++)
            nums.emplace_back(i);
        dfs(0,n,0);
        return ans;
    }
    void dfs(int curIndex,int value,int cnt) {
        if(value == 0 && cnt == k) {
            ans.emplace_back(temp);
            return;
        } else if(value < 0 || curIndex >= nums.size() || cnt > k) {
            return;
        } else {
            temp.emplace_back(nums[curIndex]);
            dfs(curIndex+1,value-nums[curIndex],cnt+1);
            temp.pop_back();
            dfs(curIndex+1,value,cnt);
        }
    }
};
int main()
{
    
    return 0;
}
