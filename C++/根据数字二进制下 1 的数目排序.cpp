#include <bits/stdc++.h>

using namespace std;


class Solution {
public:
    int countOne(int n) {
        int cnt = 0;
        while(n) {
            n = n & (n-1);
            cnt++;
        }
        return cnt;
    }
    vector<int> sortByBits(vector<int>& arr) {
        vector<int> bit(10001, 0);
        for (auto x: arr) {
            bit[x] = countOne(x);
        }
        sort(arr.begin(),arr.end(),[&](int x,int y){
            if (bit[x] < bit[y]) {
                return true;
            }
            if (bit[x] > bit[y]) {
                return false;
            }
            return x < y;
        });
        return arr;
    }
};

int main()
{
    
    return 0;
}
