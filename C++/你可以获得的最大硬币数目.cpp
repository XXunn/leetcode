#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

class Solution {
public:
    int maxCoins(vector<int>& piles) {
        int ans = 0;
        int len = piles.size();
        int cnt = len/3;
        sort(piles.begin(),piles.end());
        for(int i = len-1;i >= 0 && cnt > 0;i-=2) {
            ans += piles[i];
            cnt--;
        }
        return ans;
    }
};

int main()
{
    
    return 0;
}
