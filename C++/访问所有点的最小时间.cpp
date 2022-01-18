#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    int minTimeToVisitAllPoints(vector<vector<int>>& points) {
        int ans = 0;
        for(int i = 1;i < points.size();i++) {
            int tempx = abs(points[i][0]-points[i-1][0]);
            int tempy = abs(points[i][1]-points[i-1][1]);
            ans += max(tempx,tempy);
        }
        return ans;
    }
};

int main()
{
    
    return 0;
}
