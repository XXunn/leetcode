#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    int dir[2][8] = {
        {1,1,1,0,0,-1,-1,-1},
        {1,0,-1,1,-1,1,0,-1}
    };
    queue<pair<int,int>> q;
    bool vis[105][105];
    int shortestPathBinaryMatrix(vector<vector<int>>& grid) {
		memset(vis,0,sizeof(vis));
        int ans = 0;
        pair<int,int> flag(-1,-1);
        pair<int,int> temp;
        q.emplace(0,0);
        q.emplace(flag);
        while(q.size()>1) {
			// cout << "This" << endl;
            temp = q.front();
            q.pop();	// cout << temp.first << " " << temp.second << endl;
            if(temp.first==grid.size()-1&&temp.second==grid[0].size()-1) {
				return ans+1;
			}    
			// cout << success << endl;
			
            if(temp == flag) {
                ans++;
                q.emplace(flag);
            } else {
				// cout << "T" << endl;
				// cout << ans << endl;
                int x = temp.first;
                int y = temp.second;
                if(grid[x][y] == 0 && !vis[x][y]) {
					vis[x][y] = 1;
                    for(int i = 0;i < 8;i++) {
                        int tempx = x + dir[0][i];
                        int tempy = y + dir[1][i];
                        if(tempx >= 0 && tempx < grid.size() && tempy >= 0 && tempy < grid[0].size() && grid[tempx][tempy] == 0 && !vis[tempx][tempy]) {
                            q.emplace(tempx,tempy);
                        }
                    }
                }
            }
        }
        return -1;
    }
};
int main()
{
	Solution slt;
	vector<vector<int>> grid;
	vector<int> temp;
	temp.emplace_back(0);
	temp.emplace_back(1);
	grid.emplace_back(temp);
	temp.clear();
	temp.emplace_back(1);
	temp.emplace_back(0);
	grid.emplace_back(temp);
	cout << slt.shortestPathBinaryMatrix(grid) << endl;
    return 0;
}
