#include <bits/stdc++.h>

using namespace std;
class Solution {
public:
    int furthestBuilding(vector<int>& heights, int bricks, int ladders) {
        int n = heights.size();
        int ans = 0;
        for(int i = 0; i < n - 1; i++) {
            if(heights[i] >= heights[i+1]) {
                ans = i;
            } else {
                if(bricks >= heights[i+1]-heights[i]) {
                    bricks -= (heights[i+1]-heights[i]);
                    ans = i;
                } else if (ladders > 0){
                    ladders--;
                    ans = i;
                } else {
                    if(i == 0)    return 0;
                    return ans + 1;
                }
            }
        }
        return n-1;
    }
};

int main()
{
    
    return 0;
}
