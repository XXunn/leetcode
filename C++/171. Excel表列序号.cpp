#include <bits/stdc++.h>

using namespace std;


class Solution {
public:
    int titleToNumber(string columnTitle) {
        int number = 0;
        long multiple = 1;
        for (int i = columnTitle.size() - 1; i >= 0; i--) {
            int k = columnTitle[i] - 'A' + 1;
            number += k * multiple;
            multiple *= 26;
        }
        return number;
    }
};

// class Solution {
// public:
//     int titleToNumber(string columnTitle) {
//         long long ans = 0;
//         int f = 0;
//         for(int i = columnTitle.size()-1; i >= 0; i--) {
//             ans += (columnTitle[i]-'A'+1)*pow(26,f);
//             f++;
//         }
//         return ans;
//     }
// };

int main()
{
    
    return 0;
}
