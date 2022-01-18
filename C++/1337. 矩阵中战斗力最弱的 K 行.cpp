#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    struct Node {
        int index;
        int num;
        bool operator < (const Node a) const {
            if(num == a.num)    return index < a.index;
            return num < a.num;
        }
    };
    int count(vector<int> vec) {    //该处可用二分
        int cnt = 0;
        for(auto v : vec) {
            if(v == 1)  cnt++;
        }
        return cnt;
    }
    vector<int> kWeakestRows(vector<vector<int>>& mat, int k) {
        vector<int> ans;
        int n = mat.size();
        Node nodes[n];
        for(int i = 0; i < n; i++) {
            nodes[i].index = i;
            nodes[i].num = count(mat[i]);
        }
        sort(nodes,nodes+n);
        for(int i = 0; i < k; i++) {
            ans.emplace_back(nodes[i].index);
        }
        return ans;
    }
};

int main()
{
    
    return 0;
}
