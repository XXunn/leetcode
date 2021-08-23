#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    string strWithout3a3b(int A, int B) {
        string s;
        int cnta = 0, cntb = 0;
        while(A>0 || B>0)
            if (A>B)
                if(cnta<2) {
                    s = s + 'a';
                    cnta++;
                    A--;
                    cntb = 0;
                }
                else {
                    s = s + 'b';
                    cntb++;
                    B--;
                    cnta = 0;
                }
            else
                if(cntb<2) {
                    s = s + 'b';
                    cntb++;
                    B--;
                    cnta = 0;
                }
                else {
                    s = s + 'a';
                    cnta++;
                    A--;
                    cntb = 0;
                }
        return s;
    }
};
int main()
{
    
    return 0;
}
