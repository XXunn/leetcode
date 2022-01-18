#include <iostream>
#include <vector>
#include <map>
using namespace std;

class Solution {
public:
    bool checkIfExist(vector<int>& arr) {
        map<int,int> mp;
        for(auto x:arr)     mp[x]++;
        if(mp[0]>=2)    return true;
        for(auto x:arr)     if(mp[2*x]!=0 && x)    return true;
        return false;
    }
};

int main()
{
    
    return 0;
}
