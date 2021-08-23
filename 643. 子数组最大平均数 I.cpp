#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    double findMaxAverage(vector<int>& nums, int k) {
        double ans = -99999;
        double temp = 0;
        for(int i = 0; i < k; i++) {
            temp += nums[i];
        }
        if(k == nums.size())    return temp/k;
        ans = max(ans, temp/k);
        int index = 1;
        while(index + k -1 < nums.size()) {
            temp += nums[index+k-1];
            temp -= nums[index-1];
            ans = max(ans, temp/k);
            index++;
        }
        return ans;
    }
};
int main()
{
    
    return 0;
}
