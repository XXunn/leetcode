#include <iostream>
#include <vector>
#include <queue>
#include <map>
#include <algorithm>
using namespace std;
class Solution {
public:
    vector<string>ans;
    map<string,priority_queue<string,vector<string>,greater<string>>>vec;
    void dfs(string cur) {
        while(vec.count(cur)&&vec[cur].size()>0) {
            string temp = vec[cur].top();
            vec[cur].pop();
            dfs(move(temp));
        }
        ans.push_back(cur);
    }
    vector<string> findItinerary(vector<vector<string>>& tickets) {
        for(auto x:tickets) {
            vec[x[0]].emplace(x[1]);
        }
        dfs("JFK");
        reverse(ans.begin(),ans.end());
        return ans;
    }
};
int main()
{
    
    return 0;
}
