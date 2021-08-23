#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

class Solution {
public:
    string getPermutation(int n, int k) {
        vector<int> factorial(n);
        factorial[0] = 1;
        for (int i = 1; i < n; i++) {
            factorial[i] = i * factorial[i - 1];
        }
        k--;
        string ans;
        vector<int> nums;
        for (int i = 1; i <= n; i++) {
            nums.push_back(i);
        }
        for (int i = 1; i <= n; i++) {
            int order = k / factorial[n - i];
            ans.push_back(nums[order] + '0');
            for (int j = order; j < n - i; j++) {
                nums[j] = nums[j + 1];
            }
            k %= factorial[n - i];
        }
        return ans;
    }
};

// class Solution {
// public:
//     string getPermutation(int n, int k) {
//         string s = "";
//         int cnt = 1;
//         for(int i = 1;i <= n;i++)
//             s += to_string(i);
//         while(next_permutation(s.begin(),s.end())) {
//             cnt++;
//             cout << s << endl;
//             // if(cnt == k) {
//             //     return s;
//             // }
//         }
//     }
// };

int main()
{
    Solution slt;
    slt.getPermutation(3,5);
    return 0;
}
