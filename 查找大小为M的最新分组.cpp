#include <iostream>
#include <vector>
#include <string>
#include <cstring>
using namespace std;

class Solution {
public:
    int findLatestStep(vector<int>& arr, int m) {
        int n = arr.size();
        int ans = -1;
        vector<int> count(n+2,0);
        vector<int> left(n+2,0);
        vector<int> right(n+2,0);
        for(int i = 0;i < n;i++) {
            int temp = arr[i];
            int l = left[temp-1] + 1 + right[temp+1];
            left[temp+right[temp+1]] = l;
            right[temp-left[temp-1]] = l;
            count[left[temp-1]]--;
            count[right[temp+1]]--;
            count[l]++;
            if(count[m] > 0) {
                ans = i + 1;
            }
        }
        return ans;
    }
};

int main()
{
    
    return 0;
}
