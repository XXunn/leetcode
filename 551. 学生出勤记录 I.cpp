#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool checkRecord(string s) {
        int len = s.length();
        int f1 = 0, f2 = 0; //f1:A 
        int cnt = 0;
        for(int i = 0; i < len; i++) {
            if(s[i] == 'A') {
                f1++;
                cnt = 0;
                if(f1 >= 2) return false;
                continue;
            } else if(s[i] == 'L') {
                cnt++;
                if(cnt >= 3) {
                    f2 = 1;
                }
            } else {
                cnt = 0;
            }
        }
        return !f2;
    }
};

int main()
{
    
    return 0;
}
