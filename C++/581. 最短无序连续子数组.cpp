#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    int findUnsortedSubarray(vector<int>& nums) {
        vector<int> num_t(nums);
        sort(num_t.begin(), num_t.end());
        int i,j;
        int n = num_t.size();
        for(i = 0; i < n; i++) {
            if(num_t[i] != nums[i])
                break;
        }
        for(j = n-1; j >= 0; j--) {
            if(num_t[j] != nums[j])
                break;
        }
        if(i >= j)  return 0;
        return  n-(n-j+i)+1;
    }
};

int main()
{
    
    return 0;
}
