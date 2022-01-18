#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    int addDigits(int num) {
        if(num > 9) {
            return num%9==0?9:num%9;
        }
        return num;
    }
};

// class Solution {
// public:
//     int addDigits(int num) {
//         int temp;
//         while(num) {
//             temp += num%10;
//             num/10;
//         }
//         return (num/10==0?num:addDigits(temp));
//     }
// };

int main()
{
    
    return 0;
}
