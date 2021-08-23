#include <bits/stdc++.h>
#define swap_test(a,b) a^=b^=a^=b
using namespace std;

class Solution {
public:
    void reverseString(vector<char>& s) {
        int n = s.size();
        for(int i = 0;i < n/2;i++) {
            s[i] += s[n-i-1];
            s[n-i-1] = s[i] - s[n-i-1];
            s[i] = s[i] - s[n-i-1];
        }
    }
};

int main()
{
    int a = 10,b = 20;
    swap_test(a,b);
    cout << a << endl << b << endl;
    return 0;
}
