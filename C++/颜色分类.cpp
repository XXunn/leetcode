#include <bits/stdc++.h>

using namespace std;
class Solution {
public:
    int a[3];
    void sortColors(vector<int>& nums) {
        memset(a,0,sizeof(a));
        for(int i = 0;i < nums.size();i++) {
            a[nums[i]]++;
        }
        int cnt = 0;
        for(int i = 0;i < 3;i++) {
            while(a[i]) {
                nums[cnt++] = i;
                a[i]--;
            }
        }
    }
};

int main()
{
    
    return 0;
}
