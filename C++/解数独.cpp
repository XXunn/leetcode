#include <bits/stdc++.h>

using namespace std;
class Solution {
public:
    bitset<9> getPossibleStatus(int x, int y) {
        // 位运算 对 点(x,y) 所在的行和列和格子进行压缩  返回所得可能填的值
        // 注意取反
        return ~(rows[x] | cols[y] | cells[x / 3][y / 3]);  
    }

    vector<int> getNext(vector<vector<char>>& board) {
        //  每次都使用都选择能填的数字最少的格子开始填
        vector<int> ret;
        int minCnt = 10;
        for (int i = 0; i < board.size(); i++) {
            for (int j = 0; j < board[i].size(); j++) {
                // 不是要填的直接continue
                if (board[i][j] != '.') continue;
                // 当前点能填的状态的压缩
                auto cur = getPossibleStatus(i, j);
                // 要找到状态最少的哪个
                if (cur.count() >= minCnt) continue;
                ret = { i, j };
                minCnt = cur.count();
            }
        }
        // 返回的是一个点
        return ret;
    }

    void fillNum(int x, int y, int n, bool fillFlag) {
        // 根据fillFlag 将n填入点(x,y)
        // fillFlag为true为填入 ,, fillFlag为false为消除(回溯)
        rows[x][n] = (fillFlag) ? 1 : 0;
        cols[y][n] = (fillFlag) ? 1 : 0;
        cells[x/3][y/3][n] = (fillFlag) ? 1: 0;
    }
    
    bool dfs(vector<vector<char>>& board, int cnt) {
        // cnt为0时，所有的 . 都已经填完
        if (cnt == 0) return true;
        // 寻找最优状态准备填入
        auto next = getNext(board);
        // 解出所有可能状态
        auto bits = getPossibleStatus(next[0], next[1]);
        for (int n = 0; n < bits.size(); n++) {
            // 对所有可能状态进行尝试
            // 为0说明该位已被填入   不做考虑
            // bitset::test()是C++ STL中的一个内置函数，用于测试是否设置了给定索引处的位。
            if (!bits.test(n)) continue;
            // 测试 将 n 填入填入点(next[0], next[1])
            fillNum(next[0], next[1], n, true);
            board[next[0]][next[1]] = n + '1';  // n 取值为0-8  
            // dfs
            if (dfs(board, cnt - 1)) return true;
            // 回溯
            board[next[0]][next[1]] = '.';
            fillNum(next[0], next[1], n, false);
        }
        return false;
    }

    void solveSudoku(vector<vector<char>>& board) {
        // 行对应的状态
        rows = vector<bitset<9>>(9, bitset<9>());
        // 列对应的状态
        cols = vector<bitset<9>>(9, bitset<9>());
        // 3x3 方格对应的状态
        cells = vector<vector<bitset<9>>>(3, vector<bitset<9>>(3, bitset<9>()));
        // cnt为要填的总数
        int cnt = 0;
        for (int i = 0; i < board.size(); i++) {
            for (int j = 0; j < board[i].size(); j++) {
                cnt += (board[i][j] == '.');
                if (board[i][j] == '.') continue;
                // 为何 减去 1?   如果例如board[i][j]为 '1' 那么减去 '1' 即为 整型0 对应着第一位(一共九位),即不用移动,表示1
                int n = board[i][j] - '1';
                // 索引零对应的是存储的最后一位，cout输出和按照索引输出会得到互为倒序的结果~
                rows[i] |= (1 << n);
                cols[j] |= (1 << n);
                cells[i / 3][j / 3] |= (1 << n);
            }
        }
        dfs(board, cnt);
    }
private:
    vector<bitset<9>> rows;
    vector<bitset<9>> cols;
    vector<vector<bitset<9>>> cells;
};

int main()
{
    bitset<9> temp;
    temp[0] |= (1<<4);
    cout << temp << endl;
    return 0;
}
