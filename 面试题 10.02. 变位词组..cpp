#include <bits/stdc++.h>

using namespace std;
class Solution {
public:
    map<string, int> mp;   // 判断string排序后是否存在 --> HASH
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        int cnt = 1;
        vector<vector<string>> ans;
        for(auto str : strs) {
            string s(str);
            sort(s.begin(), s.end());
            // cout << "s:" << s << endl;
            if(mp[s] == 0) {
                mp[s] = cnt;
                mp[str] = cnt++;
            } else {
                mp[str] = mp[s];
            }
            // cout << "str: " << str << endl;
            // cout << mp[str] << endl;
        }
        for(auto str : strs) {
            if(ans.size()  > mp[str]-1) {  // 有
                ans[mp[str]-1].emplace_back(str);
            } else {                        // 无
                vector<string> vec;
                // cout << str << "*" << endl;
                vec.emplace_back(str);
                ans.emplace_back(vec);
            }
        }
        return ans;
    }
};

// class Solution {
// public:
//     vector<vector<string>> groupAnagrams(vector<string>& strs) {
//         unordered_map<string, vector<string>> mp;
//         for (string& str: strs) {
//             string key = str;
//             sort(key.begin(), key.end());
//             mp[key].emplace_back(str);
//         }
//         vector<vector<string>> ans;
//         for (auto it = mp.begin(); it != mp.end(); ++it) {
//             ans.emplace_back(it->second);
//         }
//         return ans;
//     }
// };

int main()
{
    
    return 0;
}
