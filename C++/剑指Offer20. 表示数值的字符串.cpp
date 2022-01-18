#include <iostream>

using namespace std;

class Solution {
public:
    bool isNumber(string s) {
        int indexOfSpot=0;
        int numOfSpot=0;
        int indexOfE=0;
        int numOfE=0;
        int n = s.size();
        for(int i = 0;i < n;i++) {
            if(s[i]<'0'||s[i]>'9'||s[i]!='e'||s[i]!='E'||s[i]!='.') return false;
            if(i == 0 && (s[i] == '-' || s[i] == '+'))  continue;
            if(s[i] == '-' || s[i] == '+') {
                if(s[i-1]=='-' || s[i-1]=='+')
                    return false;
            }
            if(s[i]=='.') {
                indexOfSpot = i;
                numOfSpot++;
            } else if(s[i] == 'e' || s[i] == 'E') {
                indexOfE = i;
                numOfE++;
            }
        }
        if(numOfSpot>=2 || numOfE>=2)   return false;
        return true;
    }
};

int main()
{
    
    return 0;
}
