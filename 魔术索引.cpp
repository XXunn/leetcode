#include<iostream>
#include<vector>
using namespace std;
class Solution {
public:
    void binary_Search(vector<int>& nums,int l,int r,int& ans) {
        if(l > r)   return;
        int mid = l + (r-l)/2;
        if(mid==nums[mid]) {
            ans=mid;
            return binary_Search(nums,l,mid-1,ans);
        } else {
            binary_Search(nums,l,mid-1,ans);
            if(ans==-1) {
                binary_Search(nums,mid+1,r,ans);
            }
        }
    }
    int findMagicIndex(vector<int>& nums) {
        int ans = -1;
        binary_Search(nums,0,nums.size()-1,ans);
        return ans;
    }
};

int main() {

}