#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    // int maxSatisfied(vector<int>& customers, vector<int>& grumpy, int X) {
    //     int ans = 0;
    //     int maxn = 0;
    //     int len = customers.size();
    //     for(int i = 0; i < len; i++) 
    //         if(grumpy[i] == 0)  ans += customers[i];
    //     for(int i = 0;i == 0 || i <= len - X; i++) {
    //         int temp = 0;
    //         for(int j = i; j < i+X && j < len; j++) {
    //             if(grumpy[j] == 1) {
    //                 temp += customers[j];
    //             }
    //         }
    //         maxn = max(maxn, temp);
    //     }
    //     return ans + maxn;
    // }
    int maxSatisfied(vector<int>& customers, vector<int>& grumpy, int X) {
        int ans = 0;
        int maxn = 0;
        int temp = 0;
        int len = customers.size();
        for(int i = 0; i < len; i++) 
            if(grumpy[i] == 0)  ans += customers[i];
        for(int i = 0; i < X; i++)
            temp += customers[i]*grumpy[i];
        maxn = temp;
        for(int i = X; i < len; i++) {
            temp = temp + customers[i]*grumpy[i] - customers[i-X]*grumpy[i-X];
        }
        return ans + maxn;
    }
};

int main()
{
    
    return 0;
}
