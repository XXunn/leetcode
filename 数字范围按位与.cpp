#include <iostream>

using namespace std;

class Solution {
public:
    int rangeBitwiseAnd(int m, int n) {
        int cnt=0;
        while(m != n) {
            m>>1;
            n>>1;
            cnt++;
        }
        while(cnt--) {
            m<<1;
        }
        return m;
    }
};

int main()
{
    
    return 0;
}
