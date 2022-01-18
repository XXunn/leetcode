#include <iostream>

using namespace std;


class Solution {
public:
    string modifyString(string s) {
        for(int i = 0;i < s.length();i++) {
            if(s[i]=='?') {
                for(int j = 97;j < 97+26;j++) {
                    if(i>0&&i<s.length()-1) {
                        if(j!=s.at(i-1)&&j!=s.at(i+1)) {
                            s[i] = j;
                            break;
                        }
                    } else {
                        if(i==0) {
                            if(j!=s.at(i+1)) {
                                s[i] = j;
                                break;
                            }
                        }else {
                            if(j!=s.at(i-1)) {
                                s[i] = j;
                                break;
                            }
                        }
                    }
                }
            }
        }
        return s;
    }
};
int main()
{
    Solution slt;
    cout << slt.modifyString("?zs") << endl;
    return 0;
}
