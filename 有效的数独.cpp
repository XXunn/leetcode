#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    map<char,int> row[9],col[9],grid[9];
    bool isValidSudoku(vector<vector<char>>& board) {
        // row ---
        for(int i = 0;i < board.size();i++) {
            for(int j = 0;j < board[0].size();j++) {
                row[i][board[i][j]]++;
            }
        }
        // col |||
        for(int j = 0;j < board[0].size();j++) {
            for(int i = 0;i < board.size();i++) {
                col[j][board[i][j]]++;
            }
        }
        // grid - | 
        int cnt = 0;
        for(int i = 0;i <= 2;i++) {
            for(int j = 0;j <= 2;j++) {
                int tempx = i*3;
                int tempy = j*3;
                for(int k = tempx;k < tempx+3;k++) {
                    for(int z = tempy;z < tempy + 3;z++) {
                        grid[cnt][board[k][z]]++;
                    }
                }
                cnt++;
            }
        }
        for(int i = 0;i < 9;i++) {
            for(auto x:row[i]) {
                if(x.second > 1 && x.first != '.')
                    return false;
            }
            for(auto x:col[i]) {
                if(x.second > 1 && x.first != '.')
                    return false;
            }
            for(auto x:grid[i]) {
                if(x.second > 1 && x.first != '.')
                    return false;
            }
        }
        return true;
    }
};

int main()
{
    
    return 0;
}
