#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    vector<int> diStringMatch(string S) {
        vector<int> v;
        int minn = 0,maxn = S.size();
        for(int i = 0;i < S.size();i++) 
            if(S[i]=='D')   v.push_back(maxn--);
            else    v.push_back(minn++); 
        v.push_back(maxn);
        return v;
    }
};

// class Solution {
// public:
//     vector<int> diStringMatch(string S) {
//         vector<int> v;
//         int minn = 0,maxn = S.size();
//         for(int i = 0;i < S.size();i++) {
//             if(S[i]=='D') {
//                 v.push_back(maxn);
//                 maxn--;
//             } else {
//                 v.push_back(minn);
//                 minn++;
//             }
//         } 
//         v.push_back(maxn);
//         return v;
//     }
// };

int main()
{
    
    return 0;
}
