#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    bool containsPattern(vector<int>& arr, int m, int k) {
        int n = arr.size();
        for(int i = 0;i <= n-m*k;i++) {
            int pre = i,j = i + m;
            while(j < i + m*k) {
                if(arr[pre] != arr[j]) {
                    break;
                } else {
                    pre++;
                    j++;
                }
            }
            if(j == i + m*k)    return true;
        }
        return false;
    }
};

int main()
{
    
    return 0;
}
