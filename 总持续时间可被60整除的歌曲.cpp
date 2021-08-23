#include <iostream>
#include <vector>
#include <cstring>
using namespace std;

class Solution {
public:
    int cnt[501];
    int len;
    int numPairsDivisibleBy60(vector<int>& time) {
        len = time.size();
        memset(cnt,0,sizeof(cnt));
        int ans = 0;
        for(int i = 0;i < len;i++)
            cnt[time[i]]++;
        for(int i = 1;i <= 500;i++) {
            for(int j = i;j <= 500;j++) {
                if(i==j) {
                    if(time[i]==1 || time[i]==0)  continue;
                    else    ans += (1+time[i]-1)*(time[i]-1)/2;
                }
                if((i+j)%60==0) {
                    ans += cnt[i]*cnt[j];
                }
            }
        }
        return ans;
    }
};

// class Solution {
// public:
//     int numPairsDivisibleBy60(vector<int>& time) {
//         int len = time.size();
//         int ans = 0;
//         for(int i = 0;i < len;i++) {
//             for(int j = i + 1;j < len;j++) {
//                 if((time[i]+time[j])%60==0)
//                     ans++;
//             }
//         }
//         return ans;
//     }
// };

int main()
{
    
    return 0;
}
