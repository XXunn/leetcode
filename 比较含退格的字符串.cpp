#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool backspaceCompare(string S, string T) {
        string ss="",tt="";
        int ns,nt;
        ns = S.size();
        nt = T.size();
        for(int i = 0; i < ns; i++) {
            if(S[i] != '#')    ss += S[i];
            else    if(!ss.empty()) ss.pop_back();
        }
        for(int i = 0; i < nt; i++) {
            if(T[i] != '#')    tt += T[i];
            else    if(!tt.empty()) tt.pop_back();
        }
        return ss==tt;
    }
};

int main()
{
    
    return 0;
}
