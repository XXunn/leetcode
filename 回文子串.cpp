#include <iostream>
#include <vector>
#include <cstring>
using namespace std;

class Solution {
public:
    int countSubstrings(string s) {
        int n = s.size();
        string t = "$#";
        for(const char &c: s) {
            t += c;
            t+='#';
        }
        n = t.size();
        t+='!';
        auto f = vector<int>(n);
        int iMax = 0,rMax = 0,ans = 0;
        for(int i = 1;i < n;i++) {
            f[i] = (i<=rMax)?min(rMax-i+1,f[2*iMax-i]):1;
            while(t[i+f[i]] == t[i-f[i]])   f[i]++;
            if(i+f[i]-1>rMax) {
                iMax = i;
                rMax = i+f[i]-1;
            }
            ans += f[i]/2;
        }
        return ans;
    }
    // int countSubstrings(string s) {
    //     int n = s.size(), ans = 0;
    //     for (int i = 0; i <= 2 * n - 2; ++i) {
    //         int l = i / 2, r = i / 2 + i % 2;
    //         while (l >= 0 && r < n && s[l] == s[r]) {
    //             --l;
    //             ++r;
    //             ++ans;
    //         }
    //     }
    //     return ans;
    // }
    // int countSubstrings(string s) {
    //     int len = s.size();
    //     // bool **dp = new bool*[len];
    //     // for(int i=0; i < len; i++)
    //     //     dp[i] = new bool[len];
    //     bool dp[len][len];
    //     memset(dp,false,sizeof(dp));
    //     int cnt = 0;
    //     for(int j = 0;j < len;j++) {
    //         for(int i = 0;i <= j;i++) {
    //             if(s.at(j)==s.at(i)) {
    //                 if(dp[i][j] == i==j || j-i==1 || dp[i+1][j-1]) {
    //                     cnt++;
    //                 }
    //             }
    //         }
    //     }
    //     return cnt;
    // }
};

int main()
{
    
    return 0;
}
