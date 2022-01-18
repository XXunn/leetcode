#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    int getRight(int x, int n, int f) {  // 数字和行号 
        if(n%2 == f) return x;
        int beg = pow(2,n-1);   //第n层开始数字为beg,且有beg个数字
        return (2*beg-x-1+beg);
    }
    vector<int> pathInZigZagTree(int label) {
        int n = -1; 
        vector<int> ans;                    //存放结果
        while(label >= (int)pow(2,++n));    //得到行号
        int last, now = label;
        while(n) {
            ans.emplace_back(now);
            if(n%2) {
                now = getRight(now, n, 0)/2;
            } else {
                now = getRight(now, n, 1)/2;
            }
            n--;
        }
        reverse(ans.begin(), ans.end());
        return ans;
    }
};

// class Solution {
// public:
//     int getRight(int x, int n) {  // 数字和行号
//         if(n%2) return x;
//         int beg = pow(2,n-1);   //第n层开始数字为beg
//         // int nums = beg;         //第n层有beg个数字
//         return (2*beg-x-1+beg);
//     }
//     vector<int> pathInZigZagTree(int label) {
//         int n = -1; //得到行号
//         vector<int> ans;
//         while(label >= (int)pow(2,++n));
//         stack<int> st;
//         int last, now = label;
//         while(n) {
//             st.push(now);
//             ans.emplace_back(now);
//             now = getRight(now, n)/2;
//             n--;
//         }
//         return ans;
//     }
// };

int main()
{
    
    return 0;
}
