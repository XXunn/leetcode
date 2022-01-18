#include <iostream>
#include <cstring>
#include <vector>
using namespace std;  
vector<int>vec;
//dp[l][r][k]=max(dp[l][r][k],dp[i+1][r-1][0]+dp[l][i][k+1])
class Solution {
public:
    int dp[100][100][100];      //dp[l][r][k]表示l-r区间,且之后有k个和boxes[r]相同的值,所获得的最大收获
    int removeBoxes(vector<int>& boxes) {
        memset(dp,0,sizeof(dp));
        int len = boxes.size()-1;
        return getdp(0,len,0,boxes);    //注意这里不能先递归后返回dp[0][len][k],因为所对应的len会在递归中进行改变
    }
    int getdp(int l,int r,int k,vector<int>& boxes) {
        if(l>r) return 0;
        if(dp[l][r][k]) return dp[l][r][k];
        while(l < r && boxes[r]==boxes[r-1]) {  //找寻与最右侧相同的连在一起的数字
            r--;k++;
        }
        dp[l][r][k] = getdp(l,r-1,0,boxes) + (k+1)*(k+1);
        for(int i = l;i < r;i++) {
            //在boxes[l]~boxes[r-1]中也存在和boxes[r]相同值的元素
            if(boxes[i]==boxes[r]) {
                dp[l][r][k] = max(dp[l][r][k],getdp(i+1,r-1,0,boxes)+getdp(l,i,k+1,boxes));
            }
        }
        return dp[l][r][k];
    }
};
int main()
{

    vec.push_back(1);
    vec.push_back(1);
    vec.push_back(1);
    Solution slt;
    cout << slt.removeBoxes(vec) << endl;
    cout << slt.dp[0][8][0] << endl;
    return 0;
}
