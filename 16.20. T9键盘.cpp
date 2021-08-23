#include <bits/stdc++.h>

using namespace std;


class Solution {
public:
    vector<string> getValidT9Words(string num, vector<string>& words) {
        vector<char> mp = { '2','2','2','3','3','3','4','4','4','5','5','5','6','6','6','7','7','7','7','8','8','8','9','9','9','9' };
        int n1 = num.size(), i;
        vector<string> ans;
        for (string& w : words) {
            for (i = 0; i < n1; ++i) if (mp[w[i] - 'a'] != num[i]) break;
            if (i == n1) ans.emplace_back(w);
        }
        return ans;
    }
};


// class Solution {
// public:
//     vector<vector<string>> vec[10];
//     //  = {
//     //     {"!","@","#"},
//     //     {"a","b","c"},
//     //     {"d","e","f"},
//     //     {"g","h","i"},
//     //     {"j","k","l"},
//     //     {"m","n","o"},
//     //     {"p","q","r","s"},
//     //     {"t","u","v"},
//     //     {"w","x","y","z"}
//     // };
//     void init() {
//         vec[0].emplace_back("!");
//         vec[0].emplace_back("@");
//         vec[0].emplace_back("#");
//         vec[1].emplace_back("a");
//         vec[1].emplace_back("b");
//         vec[1].emplace_back("c");
//         vec[2].emplace_back("d");
//         vec[2].emplace_back("e");
//         vec[2].emplace_back("f");
//         vec[3].emplace_back("g");
//         vec[3].emplace_back("h");
//         vec[3].emplace_back("i");
//         vec[4].emplace_back("j");
//         vec[4].emplace_back("k");
//         vec[4].emplace_back("l");
//         vec[5].emplace_back("m");
//         vec[5].emplace_back("n");
//         vec[5].emplace_back("o");
//         vec[6].emplace_back("p");
//         vec[6].emplace_back("q");
//         vec[6].emplace_back("r");
//         vec[6].emplace_back("s");
//         vec[7].emplace_back("t");
//         vec[7].emplace_back("u");
//         vec[7].emplace_back("v");
//         vec[8].emplace_back("w");
//         vec[8].emplace_back("x");
//         vec[8].emplace_back("y");
//         vec[8].emplace_back("z");
//     }
//     map<string, int> mp;
//     vector<string> getValidT9Words(string num, vector<string>& words) {
//         init();
//         vector<string> ans;
//         dfs("", 0, num);
//         for(auto word : words) {
//             if(mp.count(word)>0)
//                 ans.emplace_back(word);
//         }
//         return ans;
//     }
//     void dfs(string cur, int curIndex, string num) {
//         if(curIndex == num.size()) {
//             mp[cur] = 1;
//             return;
//         }
//         for(int i = 0; i < vec[num[curIndex]-1].size(); i++) {
//             dfs(cur+vec[num[curIndex]-1][i], curIndex+1, num);
//         }
//     }
// };
int main()
{
    
    return 0;
}
