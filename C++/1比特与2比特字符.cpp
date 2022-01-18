#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    bool isOneBitCharacter(vector<int>& bits) {
        int len = bits.size();
        int index = 0;
        int flag = 1;
        while(index < len) {
            if(bits[index]==1) {
                index+=2;
                if(index>=len)  return 0;
            } else {
                index++;
            }
            if(index==len-1) {
                if(bits[index]==0)  return 1;
                return 0;
            }
        }
    }
};

int main()
{
    
    return 0;
}
