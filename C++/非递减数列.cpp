#include<iostream>
#include<vector>
using namespace std;

class Solution {
public:
    bool checkPossibility(vector<int>& nums) {
        if(nums.size() == 1)    return true;    
        int cnt = 0;
        int flag1 = 0;
        int flag2 = 0;
        int index = -1;
        int num;
        for(int i = 0; i < nums.size()-1; i++) {
            if(nums[i] > nums[i+1]) {
                index = i;
                num = nums[i];
                nums[i] = nums[i+1];
                break;
            }
        }
        if(index == -1) return true;
        for(int i = 0;i < nums.size()-1;i++) {
            if(nums[i] > nums[i+1]) {
                flag1 = 1;
            }
        }
        nums[index] = num;
        nums[index+1] = num;
        for(int i = 0;i < nums.size()-1;i++) {
            if(nums[i] > nums[i+1]) {
                flag2 = 1;
            }
        }
        return (flag1==0||flag2==0);
    }
};

int main()
{

    return 0;
}