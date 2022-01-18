#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    int lengthOfLastWord(string s) {
        stringstream ss(s);
        string temp;
        while(ss) {
            ss >> temp;
        }
        return temp.size();
    }
};

int main()
{
    
    return 0;
}
