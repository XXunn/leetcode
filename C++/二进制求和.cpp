#include <iostream>
#include <algorithm>
#include <bitset>
using namespace std;

class Solution {
public:
    string addBinary(string a, string b) {
        int carry = 0;
        string res = "";
        for (int i = a.size() - 1, j = b.size() - 1; i >= 0 || j >= 0; i--, j--)
        {
            int sum = carry;
            sum += i >= 0 ? a[i] - '0' : 0;
            sum += j >= 0 ? b[j] - '0' : 0;
            res += (sum % 2) + '0';
            carry = sum / 2;
        }
        if (carry == 1) res += '1';
        reverse(res.begin(), res.end());
        return res;
        
    }
};

int main()
{
    string a,b;
    cin >> a >> b;
    

    return 0;
}
