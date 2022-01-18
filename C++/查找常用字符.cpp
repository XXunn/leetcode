#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<string> commonChars(vector<string>& A) {
        vector<string> ans;
        int n = A.size();
        vector<vector<int>> vec(n, vector<int> (26,0));
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < A[i].size(); j++) {
                vec[i][A[i][j]-'a']++;
            }
        }
        for(int i = 0; i < 26; i++) {
            int minn = 200;
            for(int j = 0; j < n; j++) {
                minn = min(vec[j][i],minn);
            }
            if(minn == 200 || minn == 0) 
                continue;
            char s = 'a'+i; 
            string str; str.push_back(s);
            for(int k = 0; k < minn; k++)
                ans.emplace_back(str);
        }
        return ans;
    }
};

int main()
{
    
    return 0;
}
