#include <iostream>
#include <vector>
using namespace std;
class Solution {
public:
    bool threeConsecutiveOdds(vector<int>& arr) {
        bool flag = false;
        int len = arr.size();
        int cnt = 0;
        for(int i = 0;i < len;i++) {
            if(arr[i]&1) {
                cnt++;
            } else {
                cnt=0;
            }
            if(cnt==3)  return true;
        }
        return false;
    }
};
int main()
{
    Solution slt;
    vector<int>vec;
    vec.push_back(1);
    vec.push_back(1);
    vec.push_back(1);
    cout << slt.threeConsecutiveOdds(vec);
    return 0;
}
