#include <bits/stdc++.h>

using namespace std;
class Solution {
public:
    int countRangeSum(vector<int>& nums, int lower, int upper) {
        int size = nums.size();
        multiset<long long> preSums; // 储存前缀和 不能丢弃重复值

        long long preSum = 0;
        long long ans = 0;
        for (int i = 0; i < size; i++ ){
            preSum += nums[i];

            if(preSum >= lower && preSum <= upper )
                ans++;
            
            if(preSums.size() != 0){
                long long thresh1 = preSum - upper;
                long long thresh2 = preSum - lower;

                auto it1 = preSums.lower_bound(thresh1);
                auto it2 = preSums.upper_bound(thresh2);

                ans += (std::distance(it1, it2) );
            } 
            preSums.insert(preSum);
        }
        return ans;
    }
};

int main()
{
    
    return 0;
}
