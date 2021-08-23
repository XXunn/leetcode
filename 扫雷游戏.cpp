#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    int dir[2][8] = {
        {0,0,1,1,1,-1,-1,-1},
        {1,-1,1,0,-1,1,0,-1}
    };
    int n,m;
    vector<vector<char>> updateBoard(vector<vector<char>>& board, vector<int>& click) {
        n = board.size(),m = board[0].size();
        int x = click[0],y = click[1];
        if(board[x][y]=='M') {
            board[x][y] = 'X';
            return board;
        }
        dfs(x,y,board);
        return board;
    }
    void dfs(int x,int y,vector<vector<char>>& board) {
        int tempx,tempy;
        int cnt = countBomb(x,y,board);
        if(cnt!=0) {
            board[x][y] = cnt+'0';
            return;
        } else {
            board[x][y] = 'B';
        }
        for(int i = 0;i < 8;i++) {
            tempx = x + dir[0][i];
            tempy = y + dir[1][i];
            if(tempx < 0 || tempx >= n || tempy < 0 || tempy >= m)      continue;
            if(board[tempx][tempy]=='E') {
                dfs(tempx,tempy,board);
            }
        }
    }
    int countBomb(int x,int y,vector<vector<char>>& board) {
        int cnt = 0;
        int tempx,tempy;
        for(int i = 0;i < 8;i++) {
            tempx = x + dir[0][i];
            tempy = y + dir[1][i];
            if(tempx < 0 || tempx >= n || tempy < 0 || tempy >= m)      continue;
            if(board[tempx][tempy]=='M')    cnt++;
        }
        return cnt;
    }
};

int main()
{
    
    return 0;
}
