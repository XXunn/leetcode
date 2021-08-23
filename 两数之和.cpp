#include <iostream>
#include <vector>
#include <map>
using namespace std;
class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        map<int,int>mp;
        vector<int>out;
        for(int i = 0;i < nums.size();i++) {
            if(mp.count(target-nums[i])>0) {
                out.push_back(mp[target-nums[i]]);
                out.push_back(i);
                break;
            } 
            mp[nums[i]] = i;
        }
        return out;
    }
};
int main()
{
    
    return 0;
}
