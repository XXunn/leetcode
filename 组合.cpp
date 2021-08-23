#include <iostream>
#include <vector>
#include <map>
#include <bitset>
using namespace std;

class Solution {
public:
    vector<vector<int>> ans;
    vector<vector<int>> combine(int n, int k) {
        vector<int> temp;
        for(int i = 1;i <= n;i++)
            dfs(n,k,temp,i);
        return ans;
    }
    void dfs(int n,int k,vector<int> temp,int cur) {
        if(temp.size() == k) {
            ans.emplace_back(temp);
            return;
        }
        if(cur > n || temp.size() > k){
             return;
        } else {
            temp.emplace_back(cur);
            dfs(n,k,temp,cur+1);
            temp.pop_back();
            dfs(n,k,temp,cur+1);
        }
        return;
    }
};

int main()
{

    return 0;
}
