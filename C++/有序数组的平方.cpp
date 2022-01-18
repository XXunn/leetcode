#include <bits/stdc++.h>

using namespace std;

class Solution {
public:
    vector<int> sortedSquares(vector<int>& A) {
        vector<int> ans;
        int index = -1;
        int n = A.size();
        for(int i = 0; i < n; i++) {
            if(A[i] < 0)    index = i;
            else    break;
        }
        if(index == -1) {
            for(auto x: A)
                ans.emplace_back(x*x);
            return ans;
        }
        cout << index << endl;
        int l = index;
        int r = index+1;
        while(l >= 0 && r < n) {
            if(abs(A[l]) > A[r]) {
                ans.emplace_back(A[r]*A[r]);
                r++;
            } else if(abs(A[l]) <= A[r]) {
                ans.emplace_back(A[l]*A[l]);
                l--;
            }
        }
        while(l >= 0) {
            ans.emplace_back(A[l]*A[l]);
            l--;
        }
        while(r < n) {
            ans.emplace_back(A[r]*A[r]);
            r++;
        }
        return ans;
    }
};

// vector<int> sortedSquares(vector<int>& A) {
//     int n = A.size();
//     for(int i = 0; i < n; i++) 
//         A[i] *= A[i];
//     sort(A.begin(), A.end());
//     return A;
// }

int main()
{
    
    return 0;
}
