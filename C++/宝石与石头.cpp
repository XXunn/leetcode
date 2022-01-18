#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    map<char,int> mp;
    int numJewelsInStones(string J, string S) {
        int ans = 0;
        int len = J.length();
        int i;
        for(i = 0;i < len;i++) {
            mp[J[i]]++;
        }
        len = S.length();
        for(int i = 0;i < len;i++) {
            ans += (mp[S[i]]>=1);
        }
        return ans;
    }
};

int main()
{
    
    return 0;
}


