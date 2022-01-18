#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool escapeGhosts(vector<vector<int>>& ghosts, vector<int>& target) {
        int step = abs(target[0]) + abs(target[1]);
        int temp;
        for(auto& ghost: ghosts) {
            temp = abs(ghost[0]-target[0]) + abs(ghost[1]-target[1]);
            if(temp<=step)  return false;
        }
        return true;
    }
};

int main()
{
    
    return 0;
}
