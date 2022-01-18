#include <iostream>

using namespace std;

class Solution {
public:
    string createString(int n) {
        string ans = "122";char temp;
        int i = 2,j = 1;
        for(;i < n;) {
            j++;
            temp = ans[i];
            if(ans[j] == '2') {
                if(temp=='1') {
                    ans += "22";
                } else {
                    ans += "11";
                }
                i+=2;
            } else {
                if(temp=='1') {
                    ans += "2";
                } else {
                    ans += "1";
                }
                i++;
            }
        }
        return ans;
    }
    int magicalString(int n) {
        int ans = 0;
        string s = createString(n);
        for(int i = 0;i < n;i++) {
            if(s[i] == '1') ans++;
        }
        return ans;
    }
};
int main()
{
    
    return 0;
}
