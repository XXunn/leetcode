#include <bits/stdc++.h>

using namespace std;


class Solution {
public:
    void split(string s, string& s1, string& s2) {
        // s ---> s1+s2
        int n = s.size();
        int flag = 0;
        for (int i = 1; i < n-1; i++) {
            if(s[i] == ',') {
                flag = 1;
                continue;
            }
            if(!flag) {
                s1 += s[i];
            } else {
                s2 += s[i];
            }
        }
    }
    map<string, string> fa;
    vector<string> trulyMostPopular(vector<string>& names, vector<string>& synonyms) {
        string s1,s2;
        for (auto x : synonyms) {
            s1 = s2 = "";
            split(x, s1, s2);
            if(s1 < s2) {
                fa[s2] = s1;
            } else {
                fa[s1] = s2;
            }
        }
        
    }
};


int main()
{
    
    return 0;
}
