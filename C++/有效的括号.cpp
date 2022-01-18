#include <iostream>
#include <stack>
using namespace std;

class Solution {
public:
    stack<char> st;
    bool isValid(string s) {
        for(int i = 0;i < s.length();i++) {
            switch (s[i]){
            case ')':
                if(st.empty() || st.top()!='(')   return false;
                else    st.pop();
                break;
            case ']':
                if(st.empty() || st.top()!='[')   return false;
                else    st.pop();
                break;
            case '}':
                if(st.empty() || st.top()!='{')   return false;
                else    st.pop();
                break;
            default:
                st.push(s[i]);
                break;
            }
        }
        return st.empty()?true:false;
    }
};

int main()
{
    
    return 0;
}
