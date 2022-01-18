#include <iostream>
#include <vector>
#include <map>
using namespace std;

class Solution {
public:
    map<int,int>mp;
    int minCost(string s, vector<int>& cost) {
        int ans = 0;
        int n = s.length();
        for(int i = 0;i < n-1;i++) {
            if(s[i]==s[i+1]) {
                int prev = i;
                while(s[i]==s[i+1] && i < n) {
                    i++;
                }
                mp[prev] = i;
            }
        }
        for(auto &it:mp) {
            int sum = 0;
            int min = 0;
            for(int i = it.first;i <= it.second;i++) {
                sum += cost[i];
                if(cost[i]>min) min = cost[i];
            }
            //cout << min << endl;
            ans += (sum - min);
            //cout << it.first << " " << it.second << endl;
        }
        return ans;
    }
};

int main()
{
    
    return 0;
}
