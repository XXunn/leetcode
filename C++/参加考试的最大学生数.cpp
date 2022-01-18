#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    int dir[2][5] = {
        {-1,0,1,1,-1},
        {1,1,1,0,0}
    };
    vector<vector<int>> vis;
    int n,m;
    int ans = 0;
    int maxStudents(vector<vector<char>>& seats) {
        n = seats.size();
        m = seats[0].size();
        vis = vector<vector<int>>(n,vector<int>(m));
        dfs(seats,vis,0);
        return ans;
    }
    bool judge(int x,int y) {
        for(int i = 0;i < 5;i++) {
            int tempx = x + dir[0][i];
            int tempy = y + dir[1][i];
            if(tempx >= 0 && tempx < n && tempy >= 0 && tempy < m) {
                if(vis[tempx][tempy]) {
                    return false;
                }
            }
        }
        return true;
    }
    void dfs(vector<vector<char>>& seats,vector<vector<int>>& vis,int cur) {
        ans = max(ans,cur);
        for(int i = 0;i < n;i++) {
            for(int j = 0;j < m;j++) {
                if(seats[i][j] != '#' && !vis[i][j] && judge(i,j)) {
                    vis[i][j] = 1;
                    dfs(seats,vis,cur+1);
                    vis[i][j] = 0;
                    dfs(seats,vis,cur);
                } 
            }
        }
        return;
    }
};

int main()
{
    
    return 0;
}
