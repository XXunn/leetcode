#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

class Solution {
public:
    int findContentChildren(vector<int>& g, vector<int>& s) {
        sort(g.begin(),g.end());
        sort(s.begin(),s.end());
        if(s.size()>g.size() && s[s.size()-1]>=g[g.size()-1])   return g.size();
        int g_p,s_p;g_p=s_p=0;
        while(g_p<g.size()&&s_p<s.size()) {
            if(g[g_p]<=s[s_p]) {
                g_p++;s_p++;
            } else {
                s_p++;
            }
        }
        return g_p;
    }
};

int main()
{
    
    return 0;
}
