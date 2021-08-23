#include <iostream>
#include <vector>
#include <cstring>
using namespace std;

class Solution {
public:
    int dir[2][4] = {   //direction
        {0,0,1,-1},
        {1,-1,0,0}
    };
    bool vis[55][55];
    int n,m;
    vector<vector<int>> floodFill(vector<vector<int>>& image, int sr, int sc, int newColor) {
        memset(vis,0,sizeof(vis));
        n = image.size(),m = image[0].size();
        dfs(image,sr,sc,newColor);
        return image;
    }
    void dfs(vector<vector<int>>& image, int x, int y, int newColor) {
        int original = image[x][y];
        image[x][y] = newColor;
        for(int i = 0;i < 4;i++) {
            int tempx = x + dir[0][i];
            int tempy = y + dir[1][i];
            if(vis[tempx][tempy] || tempx < 0 || tempx >= n || tempy < 0 || tempy >= m)   continue;
            dfs(image,tempx,tempy,newColor);
        }
    }
};

int main()
{
    
    return 0;
}
