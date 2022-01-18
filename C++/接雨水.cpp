#include <bits/stdc++.h>

using namespace std;
// // 暴力
// class Solution {
// public:
//     int trap(vector<int>& height) {
//         int n = height.size();
//         int ans = 0;
//         int maxL,maxR;
//         for(int i = 1; i < n - 1; i++) {
//             maxL = maxR = 0;
//             // L
//             for(int j = i-1; j >= 0; j--)     maxL = max(maxL,height[i]);
//             for(int j = i+1; j < n; j++)      maxR = max(maxR,height[i]);
//             ans += min(maxL,maxR)-height[i];
//         }
//         return ans;
//     }
// };


// class Solution {
// public:
//     int trap(vector<int>& height) {
//         int ans = 0;int ans2 = 0;
//         int n = height.size();
//         int flag;
//         int i, j, k;
//         // 从左往右
//         for(i = 0; i < n;) {
//             flag = 0;
//             for(j = i + 1; j < n; j++) {
//                 if(height[j] >= height[i]) {
//                     for(k = i + 1; k < j; k++) {
//                         ans += height[i]-height[k];
//                         // cout << height[i] << " " << height[k] << endl;
//                     }
//                     flag = 1;
//                     break;
//                 }
//             }
//             if(flag)    i = j;
//             else        i++;
//         }
//         // 从右往左
//         for(i = n-1; i >= 0; ) {
//             flag = 0;
//             for(j = i - 1; j >= 0;j--) {
//                 if(height[j] >= height[i]) {
//                     for(k = i - 1; k > j; k--) {
//                         ans2 += height[i] - height[k];
//                     }
//                     flag = 1;
//                     break;
//                 }
//             }
//             if(flag)    i = j;
//             else        i--;
//         }
//         return max(ans,ans2);
//     }
// };

int main()
{

    return 0;
}