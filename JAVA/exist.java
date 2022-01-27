package leetcode;

public class exist {
    // n为行, m为列
    int n, m, len;
    // 四个方向
    int[][] Ori = new int[][] {
            {1, -1, 0, 0},
            {0, 0, 1, -1}
    };
    public boolean exist(char[][] board, String word) {
        n = board.length;
        m = board[0].length;
        len = word.length();
        int i, j;
        for(i = 0; i < n; i++) {
            for(j = 0; j < m; j++) {
                if(dfs(board, word, i, j, 0) == true) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][] board, String word, int x, int y, int cur) {
        if(x < 0 || x >= n || y < 0 || y >= m || board[x][y] != word.charAt(cur)) {
            return false;
        }
        if(cur == len-1) {
            return true;
        }
        // 这里做了优化, 直接改动 board, 让他当前 board[x][y] 不满足条件, 不能被后续的 dfs 用到
        board[x][y] = '\0';
        boolean flag = false;
        int tempx, tempy;
        for(int i = 0; i < 4; i++) {
            tempx = x + Ori[0][i];
            tempy = y + Ori[1][i];
            flag |= dfs(board, word, tempx, tempy, cur+1);
            if(flag == true) {
                break;
            }
        }
        board[x][y] = word.charAt(cur);
        return flag;
    }

    /***
     *
     *  这个可以过， 但是可以优化， 不用 vis 数组
    boolean vis[][];
    int n, m, len, ans;

    public boolean exist(char[][] board, String word) {
        // n 为行, m 为列
        n = board.length;
        m = board[0].length;
        vis = new boolean[n][m];
        len = word.length();
        int i, j;
        for(i = 0; i < n; i++) {
            for(j = 0; j < m; j++) {
                if(dfs(board, word, i, j, 0)==true) {
                    return true;
                }
            }
        }
        return false;
    }

    // 当前访问到 board[x][y], word 进行到判断 word[cur]
    public boolean dfs(char[][] board, String word, int x, int y, int cur) {
        // 如果越界, 或者不相等, 或者被标记过访问, 直接跳过
        if(x < 0 || x >= n || y < 0 || y >= m || vis[x][y] == true || board[x][y] != word.charAt(cur)) {
            return false;
        }
        // 访问到最后了就说明已经找到了
        if(cur == len-1) {
            return true;
        }
        vis[x][y] = true;
        boolean temp = dfs(board, word, x+1, y, cur+1) || dfs(board, word, x-1, y, cur+1)
                || dfs(board, word, x, y+1, cur+1) || dfs(board, word, x, y-1, cur+1);
        // 这里要回溯
        vis[x][y] = false;
        return temp;
    }
     */

//    下面的代码 TLE， 因为dfs的过程中， 没有返回值， 他会一直走完
//    int[][] Ori = new int[][] {
//            {1, -1, 0, 0},
//            {0, 0, 1, -1}
//    };
//    boolean vis[][];
//    int n, m, len, ans;
//    // DFS
//    public boolean exist(char[][] board, String word) {
//        len = word.length();
//        n = board.length;
//        m = board[0].length;
//        vis = new boolean[n][m];
//        int i, j;
//        for(i = 0; i < n; i++) {
//            for(j = 0; j < m; j++) {
//                if(word.charAt(0) == board[i][j]) {
//                    vis[i][j] = true;
//                    dfs(board, word, 1, i, j);
//                    vis[i][j] = false;
//                    if(ans == 1) {
//                        return true;
//                    }
//                }
//            }
//        }
//        return false;
//    }
//    public void dfs(char[][] board, String word, int cur, int x, int y) {
//        // System.out.println(cur);
//        if(cur == len) {
//            ans = 1;
//            return;
//        }
//        for(int i = 0; i < 4; i++) {
//            int tempx = x + Ori[0][i];
//            int tempy = y + Ori[1][i];
//            if(tempx < 0 || tempx >= n || tempy < 0 || tempy >= m || vis[tempx][tempy] == true) {
//                continue;
//            } else {
//                if(word.charAt(cur) == board[tempx][tempy]) {
//                    vis[tempx][tempy] = true;
//                    dfs(board, word, cur+1, tempx, tempy);
//                    vis[tempx][tempy] = false;
//                } else {
//                    continue;
//                }
//            }
//        }
//    }

//    //[["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]]
//    //"ABCCED"
//    public static void main(String[] args) {
//        char[][] x = new char[][]{
//                {'A', 'B', 'C', 'E'},
//                {'S', 'F', 'C', 'S'},
//                {'A', 'D', 'E', 'E'}
//        };
//        exist(x, "ABCCED");
//    }
}
