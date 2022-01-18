#include <bits/stdc++.h>
using namespace std;
// class Solution {
// public:
//     vector<pair<int,int> >p;
//     int cnt;
//     int countBinarySubstrings(string s) {
//         int ans = 0;
//         cnt=0;int l,r;
//         for(int i = 0;i < s.size();i++) {
//             if(s[i]=='1') {
//                 l = i;
//                 while(s[++i]=='1'); 
//                 r = i-1;      
//                 p.push_back(pair<int,int>(l,r));
//             }
//         }
//         /*
//         for(int i = 0;i < p.size();i++) {
//             cout << p[i].first << " " << p[i].second << endl;
//         }
//         */
//         for(int i = 0;i < p.size();i++) {
//             ans += judge(p[i].first,p[i].second,s);
//         }
//         return ans;
//     }
//     int judge(int l,int r,string s) {
//         int count = 0;
//         int ans = 0;
//         int max_len = r-l+1;    //1的个数
//         for(int i = l-1;i >= 0 && i >= 2*l-r-1;i--) {
//             if(s[i]=='1')   break;
//             count++;
//         }
//         //cout << "count:" << count << endl;
//         ans += count;
//         count = 0;
//         for(int i = r+1;i < s.size() && i <= 2*r-l+1;i++) {
//             if(s[i]=='1')   break;
//             count++;
//         }
//         //cout << "count2:" << count << endl;
//         ans += count;
//         //cout << "ans: " << ans << endl;
//         return ans;
//     }
// };

class Solution {
public:
    int countBinarySubstrings(string s) {
        int same = 1;int len = s.size();
        int ans = 0;
        vector<int> vec;
        for(int i = 0;i < len;i++) {
            while(i<len-1 && s[i]==s[i+1]) {
                i++;same++;
            }
            vec.push_back(same);
            same=1;
        }
        /*
        for(int i = 0;i < vec.size();i++) {
            cout << vec[i] << " ";
        }
        */
        //cout << endl;
        for(int i = 0;i < vec.size()-1;i++) {
            ans += min(vec[i],vec[i+1]);
        }
        return ans;
    }
};
int main()
{
    Solution slt;
    cout << slt.countBinarySubstrings("00110011") << endl;
    
    return 0;
}
