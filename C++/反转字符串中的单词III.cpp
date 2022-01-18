#include <iostream>
#include <string>
#include <algorithm>
#include <sstream>
using namespace std;

class Solution {
public:
    string reverseWords(string s) {
        string ans = "";
        istringstream is(s);
        string temp;
        int flag = 1;
        while(is>>temp) {
            reverse(temp.begin(),temp.end());
            if(!flag)   ans += " ";
            ans += temp;
            flag = 0;
        }
        return ans;
    }
};

int main()
{
    
    return 0;
}
