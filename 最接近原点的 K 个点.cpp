#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<vector<int>> kClosest(vector<vector<int>>& points, int K) {
        int n = points.size();
        vector<int> vec(n+1);
        vector<vector<int>> ans;
        sort(points.begin(), points.end(), [&](vector<int> x, vector<int> y){
            if(x[0]*x[0]+x[1]*x[1]<y[0]*y[0]+y[1]*y[1])
                return true;
            return false;
        });
        for(int i = 0; i < K; i++) {
           ans.emplace_back(points[i]);
        }
        return ans;
    }
};

int main()
{
    
    return 0;
}
