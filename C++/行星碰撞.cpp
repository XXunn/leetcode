#include <bits/stdc++.h>

using namespace std;
class Solution {
public:
    vector<int> asteroidCollision(vector<int>& asteroids) {
        stack<int> st;
        for (auto x : asteroids) {
            if(st.empty()) {
                st.push(x);
                continue;
            } else {
                if(x < 0) {
                    int temp;
                    int flag = 0;
                    while(!st.empty() && st.top() > 0) {
                        temp = st.top();
                        if(temp > abs(x))   break;
                        else {
                            if(temp == abs(x))  flag = 1;
                            st.pop();
                            if(flag == 1)   break;
                        }
                    }
                    if(st.empty() && !flag) {
                        st.push(x);
                        continue;
                    }  
                    if(!st.empty() && st.top() < 0 && !flag) {
                        st.push(x);
                    }
                    // cout << st.top() << endl;
                } else {
                    st.push(x);
                }
            }
        }
        vector<int> vec;
        stack<int> tst;
        while(!st.empty()) {
            tst.push(st.top());
            st.pop();
        }
        while(!tst.empty()) {
            vec.emplace_back(tst.top());
            tst.pop();
        }
        return vec;
    }
};
int main()
{
    
    return 0;
}
