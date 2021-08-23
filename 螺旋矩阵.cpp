#include <iostream>
#include <vector>
using namespace std;


class Solution {
public:
    vector<vector<int>> ans;
    vector<int>temp;
    int cal(int n,int i,int j) {
        if(i == 1)  return j;
        if(j == n)  return n+i-1;
        if(i == n)  return 3*n-2-j+1;
        if(j == 1)  return 4*n-3-i+1;
        return cal(n-2,i-1,j-1)+4*(n-1);
    }
    vector<vector<int>> generateMatrix(int n) {   
        for(int i = 0;i < n;i++) {
            for(int j = 0;j < n;j++) {
                temp.push_back(cal(n,i+1,j+1));
            }
            ans.push_back(temp);
            temp.clear();
        }
        return ans;
    }
};
int main()
{
    
    return 0;
}
