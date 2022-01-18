#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    int numSubmat(vector<vector<int>>& mat) {
        int row = mat.size(), col = mat[0].size();
        int ans = 0;
        for(int i = 0;i < row;i++) {
            for(int j = i;j < row;j++) {
                int now = 0;
                for(int k = 0;k < col;k++) {
                    now = mat[j][k]==0?0:(k==0?mat[j][k]:now+1);
                    ans += now;
                }
            }
            for(int j = row-1;j > i;j--) {
                for(int k = 0;k < col;k++){
                    mat[j][k] &= mat[j-1][k];
                }
            }
        }
        return ans;
    }
};

int main()
{
    
    return 0;
}
