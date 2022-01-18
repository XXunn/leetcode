#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    int numTriplets(vector<int>& nums1, vector<int>& nums2) {
        map<long long,int> ma;
        for (int i=0;i<nums1.size();i++){
            for (int j=i+1;j<nums1.size();j++){
                ma[1LL*nums1[i]*nums1[j]]++;
            }
        }
        int res=0;
        for (int i=0;i<nums2.size();i++){
            res+=ma[1LL*nums2[i]*nums2[i]];
        }
        ma.clear();
        for (int i=0;i<nums2.size();i++){
            for (int j=i+1;j<nums2.size();j++){
                ma[1LL*nums2[i]*nums2[j]]++;
            }
        }
        for (int i=0;i<nums1.size();i++){
            res+=ma[1LL*nums1[i]*nums1[i]];
        }
        return res;
    }
};

int main()
{
    
    return 0;
}
