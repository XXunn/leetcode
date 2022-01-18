#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    int dir[2][4] = {
        {0,0,-1,1},
        {1,-1,0,0}
    //  上,下,左右
    };
    int n,m;
    vector<vector<int>> vis;
    int flag;
    bool hasValidPath(vector<vector<int>>& grid) {
        this->flag = 0;
        this->n = grid.size();
        this->m = grid[0].size();
        vector<vector<int>> Tvis(n, vector<int>(m));
        this->vis = Tvis;
        
    }
    void dfs(int x, int y, vector<vector<int>> grid) {
        if(x == n-1 && y == m-1) {
            this->flag = 1;
            return;
        }
        for(int i = 0; i < 4; i++) {
            int tempx = dir[0][i];
            int tempy = dir[1][i];
            if(!vis[tempx][tempy] tempx < n && tempy < m && tempx >= 0 && tempy >= 0) {
                if(grid[x][y] == 1) {
                    if(i == 2) {    //左
                        if(grid[tempx][tempy] == 1 || grid[tempx][tempy] == 4 || grid[tempx][tempy] == 6) {
                            dfs(tempx, tempy, grid);
                        }
                    } else if(i == 3) { //右

                    }
                }
            }
            
        }
    }
    //  1 == > 左为146,右为135
    //  2 == > 上为234,下为256
    //  3 == > 左为146,下为256
    //  4 == > 右为125,下为256
    //  5 == > 左为146,上为234
    //  6 == > 上为234,右为135

};

int main()
{
    
    return 0;
}
