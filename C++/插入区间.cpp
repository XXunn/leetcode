#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<vector<int>> insert(vector<vector<int>>& intervals, vector<int>& newInterval) {
        int n = intervals.size();
        int indexst=0,indexed=n-1;
        int bg=intervals[0][0],ed=intervals[n-1][1];
        int i;
        for(i = 0; i < n; i++) {
            if(intervals[i][0] <= newInterval[0] && intervals[i][1] >= newInterval[0]) {
                indexst = i;
                bg = intervals[i][0];
                break;
            }
        }
        for(int j = i; j < n; j++) {
            if(intervals[j][0] <= newInterval[1] && intervals[j][1] >= newInterval[1]) {
                indexed = j;
                ed = intervals[j][1];
                break;
            }
        }
        intervals.erase(intervals.begin()+indexst, intervals.begin()+indexed);
        vector<int> vec;
        vec.emplace_back(bg);
        vec.emplace_back(ed);
        intervals.insert(intervals.begin()+indexst,vec);
        return intervals;
    }
};

int main()
{
    
    return 0;
}
