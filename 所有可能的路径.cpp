#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<vector<int>> ans;
    vector<vector<int>>& graph;
    int nodeNum;
    vector<vector<int>> allPathsSourceTarget(vector<vector<int>>& graph) {
        this->graph = graph;
        nodeNum = graph.size();
        vector<int> vis(nodeNum,0);
        vector<int> stepRec;
        stepRec.emplace_back(0);
        dfs(0, vis, stepRec);
        return ans;
    }
    void dfs(int cur,vector<int> vis,vector<int> stepRec) {
        if(cur == nodeNum-1) {
            ans.emplace_back(stepRec);
            return;
        }
        for(int i = 0; i < graph[cur].size();i++) {
            if(!vis[graph[cur][i]]) {
                vis[graph[cur][i]] = 1;
                stepRec.emplace_back(graph[cur][i]);
                dfs(graph[cur][i],vis,stepRec);
                vis[graph[cur][i]] = 0;
                stepRec.pop_back();
            }
        }
    }
};

int main()
{
    
    return 0;
}
