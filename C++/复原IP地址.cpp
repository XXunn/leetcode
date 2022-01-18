#include <iostream>
#include <cstdio>
#include <vector>
#include <cstdlib>
using namespace std;
class Solution {
public:
    vector<string>ans;
    vector<string> restoreIpAddresses(string s) {
        if(s.size()<4)  return ans;
        vector<string>path;
        dfs(s,0,path);
        return ans;
    }
    void dfs(string s,int pos,vector<string>&path) {
        int maxsize = (4-path.size()) * 3;
        if(s.size() - pos > maxsize)    return;
        if(path.size()==4 && pos == s.size()) {
            string str = path[0] + "." + path[1] + "." + path[2] + "." + path[3];
            ans.push_back(str);
            return;
        }
        for(int i = pos;i < s.size()&&i<=pos+2;i++) {
            string ip = s.substr(pos,i-pos+1);
            if(isValid(ip)) {
                path.push_back(ip);
                dfs(s,i+1,path);
                path.pop_back();
            }
        }
    }
    bool isValid(string ip) {
        int val = stoi(ip);
        if(val>255) return false;
        if(ip.size()>=2&&ip[0]=='0')    return false;
        return true;
    }
};
int main()
{
    
    return 0;
}
