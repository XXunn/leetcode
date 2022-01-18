#include <iostream>

using namespace std;

class Solution {
public:
    int minOperations(int n) {
        int ans = 0;
        if(n&1) {
            for(int i = 2;i <= n-1;i+=2) {
                ans += i;
            }
        } else {
            for(int i = 1;i <= n-1;i+=2) {
                ans += i;
            }
        }
        return ans;
    }
};

int main()
{
    Solution slt;
    cout << slt.minOperations(3) << endl;
    return 0;
}
