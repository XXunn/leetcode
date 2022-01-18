#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<vector<int>> ans;
    vector<int> st;
    void dfs(vector<vector<int>>& graph, int cur, int end) {
        if(cur == end) {
            ans.emplace_back(st);
            return;
        }
        for(auto& x : graph[cur]) {
            st.emplace_back(x);
            dfs(graph, x, end);
            st.pop_back();
        }
    }
    vector<vector<int>> allPathsSourceTarget(vector<vector<int>>& graph) {
        st.emplace_back(0);
        dfs(graph, 0, graph.size()-1);
        return ans;
    }
};

int main()
{
    
    return 0;
}
