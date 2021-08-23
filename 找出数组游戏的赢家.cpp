#include <iostream>
#include <vector>
#include <map>
using namespace std;

class Solution {
public:
    map<int,int>mp;
    int getWinner(vector<int>& arr, int k) {
        int prev = max(arr[0],arr[1]);
        if(k == 1)  return prev;
        int cnt = 1;
        int maxn = prev;
        int len = arr.size();
        for(int i = 2;i < len;i++) {
            if(prev > arr[i]) {
                cnt++;
                if(cnt == k)    
                    return prev;
            } else {
                prev = arr[i];
                cnt = 1;
            }
            maxn = max(maxn,arr[i]);
        }
        return maxn;
    }
};

int main()
{
    
    return 0;
}
