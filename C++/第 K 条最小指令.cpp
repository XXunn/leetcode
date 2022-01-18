#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    string kthSmallestPath(vector<int>& destination, int k) {
        int a = destination[0],b = destination[1];
        string s1(b,'H');
        string s2(a,'V');
        int num = com(a,a+b);
        
        // string s = s1+s2;
        
        
        return s;
    }
    int com(int n,int r) {
        int i,j,s=1;
        for(int i = 0,j = 1;i < r;i++) {
            s *= (n-i);
            for(;j <= r && s % j == 0; j++) {
                s /=j;
            }
        }
        return s;
    }
};

int main()
{
    Solution slt;
    cout << slt.com(15,10);
    return 0;
}
