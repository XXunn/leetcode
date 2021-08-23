#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<bool> checkArithmeticSubarrays(vector<int>& nums, vector<int>& l, vector<int>& r) {
        vector<int> temp;
        int m = l.size();
        for(int i = 0;i < m;i++) {
            temp.clear();
            long long sum = 0;
            for(int j = l[i]; j <= r[i]; j++) {
                temp.emplace_back(nums[j]);
                sum += nums[j];
            }
            sort(temp.begin(), temp.end());
            if()
        }
    }   
};

int main()
{
    
    return 0;
}
