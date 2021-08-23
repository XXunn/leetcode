#include<iostream>
#include<algorithm>
#include<vector>
using namespace std;

class Solution {
public:
    string s;
    vector<string>& wordDict;
    bool wordBreak(string s, vector<string>& wordDict) {
        this->s = s;
        this->wordDict = wordDict;
        int temp = 0;
        vector<int> dp(wordDict.size()+1, 0);
        for(int i = 1; i <= wordDict.size(); i++) {
            temp = 0;
            for(int j = 0; j <= i; j++) {
                temp = dp[j] + check(j,i);
                if(temp == 1) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[wordDict.size()];
    }
    bool check(int st, int ed) {
        string s(s,st,ed);
        return find(wordDict.begin(), wordDict.end(), s) != wordDict.end();
    }
};

int main()
{

    
    return 0;
}