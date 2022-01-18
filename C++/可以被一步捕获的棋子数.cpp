#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    int numRookCaptures(vector<vector<char>>& board) {
        int n = board.size(), m = board[0].size();
        int x,y;
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(board[i][j] == 'R') {
                    x = i;
                    y = j;
                    break;
                }
            }
        }
        // Down
        for(int i = x+1; i < n; i++) {
            if(board[i][y] == 'p') {
                cnt++;break;
            }  
            else if(board[i][y] == '.') continue;
            else    break;
        }
        // Up
        for(int i = x-1; i >= 0; i--) {
            if(board[i][y] == 'p') {
                cnt++;break;
            }  
            else if(board[i][y] == '.') continue;
            else    break;
        }
        // Right
        for(int i = y+1; i < m; i++) {
            if(board[x][i] == 'p') {
                cnt++;break;
            }  
            else if(board[x][i] == '.') continue;
            else    break;
        }
        // Left
        for(int i = y-1; i >= 0; i--) {
            if(board[x][i] == 'p') {
                cnt++;break;
            }  
            else if(board[x][i] == '.') continue;
            else    break;
        }
        return cnt;
    }
    
};

int main()
{
    
    return 0;
}
