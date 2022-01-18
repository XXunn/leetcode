#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool uniqueOccurrences(vector<int>& arr) {
        map<int, int> mp1;
        map<int, int> mp2;
        for(auto x:arr) mp1[x]++;   // 1:3 2:2 3:1
        for(auto x:mp1) {
            if(mp2[x->second] != 0) {
                return false;
            } else {
                mp2[x->second] = x->first;
            }
        }
        return true;
    }
};

int main()
{
    
    return 0;
}
