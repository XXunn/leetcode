#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    vector<int> mostVisited(int n, vector<int>& rounds) {
        vector<int>ans;
        int beg = rounds[0];
        int end = rounds[rounds.size()-1];
        if(beg==end) {
            ans.push_back(beg);
            return ans;
        }
        if(beg < end) {
            for(int i = beg;i <= end;i++)   
                ans.push_back(i);
        } else {
            for(int i = 1;i <= end;i++) 
                ans.push_back(i);
            for(int i = beg;i <= n;i++)
                ans.push_back(i);
        }
        return ans;
    }
};

int main()
{
    
    return 0;
}
