#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    int dir[2][4] = {
        {0,0,-1,1},
        {1,-1,0,0}
    };
    void solve(vector<vector<char>>& board) {
        if(board.size()==0) return;
        int n = board.size();
        int m = board[0].size();
        for(int i = 0;i < n;i++) {
            if(board[i][0]=='O')    dfs(board,i,0);
            if(board[i][m-1]=='O')  dfs(board,i,m-1);
        }
        for(int i = 0;i < m;i++) {
            if(board[0][i]=='O')    dfs(board,0,i);
            if(board[n-1][i]=='O')  dfs(board,n-1,i);
        }
        for(int i = 0;i < n;i++) {
            for(int j = 0;j < m;j++) {
                if(board[i][j]=='O')    board[i][j] = 'X';
                if(board[i][j]=='S')    board[i][j] = 'O';
            }
        }
        for(int i = 0;i < n;i++) {
            for(int j = 0;j < m;j++) {
                cout << board[i][j] << " ";
            }
            cout << endl;
        }
    }
    void dfs(vector<vector<char>>& board,int x,int y) {
        if(board[x][y]!='O')    return;
        board[x][y] = 'S';
        for(int i = 0;i < 4;i++) {
            int tempx = x+dir[0][i];
            int tempy = y+dir[1][i];
            if(tempx<0||tempx>=board.size()||tempy<0||tempy>=board[0].size())   continue;
            dfs(board,tempx,tempy);
        }
        return;
    }
};
int main()
{
    vector<vector<char>> vec;
    vector<char> tempvec;

    tempvec.push_back('X');
    tempvec.push_back('X');
    tempvec.push_back('X');
    tempvec.push_back('X');
    vec.push_back(tempvec);
    tempvec.clear();

    tempvec.push_back('X');
    tempvec.push_back('O');
    tempvec.push_back('O');
    tempvec.push_back('X');
    vec.push_back(tempvec);
    tempvec.clear();

    tempvec.push_back('X');
    tempvec.push_back('X');
    tempvec.push_back('O');
    tempvec.push_back('X');
    vec.push_back(tempvec);
    tempvec.clear();
    
    tempvec.push_back('X');
    tempvec.push_back('O');
    tempvec.push_back('O');
    tempvec.push_back('X');
    vec.push_back(tempvec);

    Solution slt;
    slt.solve(vec);
    return 0;
}
