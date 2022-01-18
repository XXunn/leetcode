#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool isLongPressedName(string name, string typed) {
        int lenName = name.size();
        int lenTyped = typed.size();
        int pn,pt;
        pn = pt = 0;
        while(pn < lenName) {
            if(name[pn] == typed[pt]) {
                pn++;
                pt++;
                continue;
            } else if(pt-1 >= 0 && typed[pt] == typed[pt-1]) {
                pt++;
            } else {
                return false;
            }
        }
        while(pt < lenTyped) {
            if(typed[pt] != name[lenName-1]) {
                return false;
            } else {
                pt++;
            }
        }
        return true;
    }
};
int main()
{
    
    return 0;
}
