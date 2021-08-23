#include <iostream>
#include <string>
#include <vector>
using namespace std;
class Solution {
public:
    string restoreString(string s, vector<int>& indices) {
        string ans(s);  
        int len = indices.size();
        for(int i = 0;i < len;i++) {
            ans[indices[i]] = s[i];
        }
        return ans;
    }
};
int main()
{
    vector<int>vec;
    vec.push_back(4);
    vec.push_back(5);
    vec.push_back(6);
    vec.push_back(7);
    vec.push_back(0);
    vec.push_back(2);
    vec.push_back(1);
    vec.push_back(3);
    Solution slt;
    cout <<  slt.restoreString("codeleet",vec);
    return 0;
}
