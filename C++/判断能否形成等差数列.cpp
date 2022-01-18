#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

class Solution {
public:
    bool canMakeArithmeticProgression(vector<int>& arr) {
        sort(arr.begin(),arr.end());
        int n = arr.size();
        int temp = arr[1] - arr[0];
        for(int i = 2;i < n;i++) {
            if(arr[i]-arr[i-1]!=temp)
                return false;
        }
        return true;
    }
};

int main()
{
    
    return 0;
}
