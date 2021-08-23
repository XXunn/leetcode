#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    int paintingPlan(int n, int k) {
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                int sum = (i+j)*n - i*j;
                if(sum == k) {
                    ans += (Cnm(n,i)*Cnm(n,j));
                }
            }
        }
        return ans;
    }
    int Cnm(int n, int m) {
        int res = 1;
        for(int i = n-m; i <= n; i++)   res *= i;
        for(int i = 1; i <= m; i++)     res /= i;
        return res;
    }
};

int main()
{
    
    return 0;
}
