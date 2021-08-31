#include <bits/stdc++.h>

using namespace std;

// class Solution {
// public:
//     int numRescueBoats(vector<int>& people, int limit) {
//         sort(people.begin(), people.end());
//         int ans = 0;
//         int i = 0,j = people.size() - 1;
//         while(i<=j) {
//             if(people[i]+people[j] <= limit) {
//                 ans++; 
//                 i++,j--;
//             } else {
//                 j--;
//                 ans++;
//             }
//         }
//         return ans;
//     }
// };

class Solution {
public:
    int numRescueBoats(vector<int> &people, int limit) {
        int ans = 0;
        sort(people.begin(), people.end());
        int light = 0, heavy = people.size() - 1;
        while (light <= heavy) {
            if (people[light] + people[heavy] > limit) {
                --heavy;
            } else {
                ++light;
                --heavy;
            }
            ++ans;
        }
        return ans;
    }
};

int main()
{
    
    return 0;
}
