#include <bits/stdc++.h>

using namespace std;
class Solution {
public:
    bool canFormArray(vector<int>& arr, vector<vector<int>>& pieces) {
        int La = arr.size();
        int Lp = pieces.size();
        for(int i = 0; i < La; ) {
            int flag = 0;
            for(int j = 0; j < Lp; j++) {
                if(pieces[j][0] == arr[i]) {
                    flag = 1;
                    int lenT = pieces[j].size();
                    for(int k = 0; k < lenT; k++) {
                        if(pieces[j][k] != arr[i])  return false;
                        i++;
                    }
                    break;
                }
            }
            if(!flag)   return false;
        }
        return true;
    }
};
int main()
{
    
    return 0;
}
