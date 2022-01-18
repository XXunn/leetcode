#include<iostream>
using namespace std;

class Solution {
public:
    string makeGood(string s) {
        string ret;
        for (char ch: s) {
            if (!ret.empty() && ((ch ^ ret.back()) == 32)) {
                ret.pop_back();
            } else {
                ret.push_back(ch);
            }
        }
        return ret;
    }
};

int main()
{

    return 0;
}