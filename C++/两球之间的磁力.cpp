#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

class Solution {
public:
    int maxDistance(vector<int>& position, int m) {
        vector<int>temp;
        int minn;
        int len = position.size();
        int cnt = 0;int flag = 0;
        sort(position.begin(),position.end());
        for(int i = 1;i < len;i++) {
            if(position[i]==position[i-1]+1) {
                flag = 1;
                cnt++;
            } else {
                if(flag)
                    temp.push_back(cnt);
                else {
                    flag = 0;
                    temp.push_back(position[i]-position[i-1]);
                }
                //cout << cnt << endl;
                cnt = 0;
            }
        }
        for(auto x:temp) {
            cout << x << endl;
        }
        return minn;
    }
};

int main()
{
    Solution slt;
    vector<int> vec;
    vec.push_back(1);
    vec.push_back(2);
    vec.push_back(3);
    vec.push_back(4);
    vec.push_back(7);
    slt.maxDistance(vec,3);
    return 0;
}
