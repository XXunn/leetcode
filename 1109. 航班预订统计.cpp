#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> corpFlightBookings(vector<vector<int>>& bookings, int n) {
        vector<int> ans(n);
        for(auto book : bookings) {
            ans[book[0]-1] += book[2];
            if(book[1] < n)
                ans[book[1]] -= book[2];
        }
        for(int i = 1;i < n; i++)     ans[i] += ans[i-1];
        
        return ans;
    }
};

int main()
{
    
    return 0;
}
