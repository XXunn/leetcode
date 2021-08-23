#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    int countVowelStrings(int n) {
        int a,e,i,o,u;
        a=e=i=o=u=1;
        while(--n) {
            a += (e+i+o+u);
            e += (i+o+u);
            i += (o+u);
            o += u;
        }
        return a+e+i+o+u;
    }
};

int main()
{
    
    return 0;
}
