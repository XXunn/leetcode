#include <iostream>
#include <vector>
#include <queue>
using namespace std;

class Solution {
public:
    int dir[2][4] = {
        // 方向
        {0,0,1,-1},
        {1,-1,0,0}
    };

    vector<vector<int>> updateMatrix(vector<vector<int>>& matrix) {
        int n = matrix.size();
        int m = matrix[0].size();
        vector<vector<int>> dis(n,vector<int>(m));
        vector<vector<int>> vis(n,vector<int>(m));
        queue<pair<int,int>> que;
        for(int i = 0;i < n;i++) {
            for(int j = 0;j < m;j++) {
                if(matrix[i][j] == 0) {
                    que.emplace(i,j);       // Woc !
                    vis[i][j] = 1;
                }
            }
        }
        while(!que.empty()) {
            auto [x,y] = que.front();
            que.pop();
            for(int i = 0;i < 4;i++) {
                int tempx = x + dir[0][i];
                int tempy = y + dir[1][i];
                if(tempx >=0 && tempx < n && tempy >= 0 && tempy < m && !vis[tempx][tempy]) {
                    vis[tempx][tempy] = 1;
                    dis[tempx][tempy] = dis[x][y] + 1;
                    que.emplace(tempx,tempy);
                }
            }
        }
        return dis;
    }
};

int main()
{
    
    return 0;
}
