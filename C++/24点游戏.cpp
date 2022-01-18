#include <iostream>
#include <algorithm>
#include <cmath>
#include <vector>
using namespace std;

class Solution {
public:
    const double ex = 1e-6;
    const double target = 24;
    bool judgePoint24(vector<int>& nums) {
        vector<double> curNums;
        for(auto num:nums) 
            curNums.emplace_back(double(num));
        return dfs(curNums);
    }
    bool dfs(vector<double>& nums) {
        if(nums.size()==0)  return false;
        if(nums.size()==1)  return abs(target-nums[0])<ex;
        for(int i = 0;i < nums.size();i++) {
            for(int j = 0;j < nums.size();j++) {
                if(i != j) {
                    vector<double> subNums;
                    for(int k = 0;k < nums.size();k++) {
                        if(k != i && k != j) {
                            subNums.emplace_back(nums[k]);
                        }
                    }
                    //a+b
                    subNums.emplace_back(nums[i]+nums[j]);
                    bool isOk = dfs(subNums);
                    subNums.pop_back();
                    if(isOk)    return true;
                    //a-b
                    subNums.emplace_back(nums[i]-nums[j]);
                    isOk = dfs(subNums);
                    subNums.pop_back();
                    if(isOk)    return true;
                    //b-a
                    subNums.emplace_back(nums[j]-nums[i]);
                    isOk = dfs(subNums);
                    subNums.pop_back();
                    if(isOk)    return true;
                    //a*b
                    subNums.emplace_back(nums[i]*nums[j]);
                    isOk = dfs(subNums);
                    subNums.pop_back();
                    if(isOk)    return true;
                    //a/b
                    if(nums[j]!=0) {
                        subNums.emplace_back(nums[i]/nums[j]);
                        isOk = dfs(subNums);
                        subNums.pop_back();
                        if(isOk)    return true;
                    }
                    //b/a
                    if(nums[i]!=0) {
                        subNums.emplace_back(nums[j]/nums[i]);
                        isOk = dfs(subNums);
                        subNums.pop_back();
                        if(isOk)    return true;
                    }
                }
            }
        }
        return false;
    }
};

int main()
{
    
    return 0;
}
