#include <bits/stdc++.h>

using namespace std;

class Solution1 {
public:
    int compress(vector<char>& chars) {
        int n = chars.size();
        int write = 0, left = 0;
        for (int read = 0; read < n; read++) {
            if (read == n - 1 || chars[read] != chars[read + 1]) {
                chars[write++] = chars[read];
                int num = read - left + 1;
                if (num > 1) {
                    int anchor = write;
                    while (num > 0) {
                        chars[write++] = num % 10 + '0';
                        num /= 10;
                    }
                    reverse(&chars[anchor], &chars[write]);
                }
                left = read + 1;
            }
        }
        return write;
    }
};

class Solution2 {
public:
    int compress(vector<char>& chars) {
        chars.emplace_back(' ');
        int p = 0;
        int n = chars.size();
        for(int i = 0,j = 0; j < n; ) {
            if(chars[i] == chars[j]) {
                j++;
            } else {
                int num = j - i;
                chars[p] = chars[i];
                p++;
                if(num == 1) {
                    i = j;j++;
                    continue;
                }
                stack<char> v;
                while(num) {
                    char temp = num%10 + '0';
                    num /= 10;
                    v.push(temp);
                }
                while(!v.empty()) {
                    chars[p++] = v.top();
                    v.pop();
                }
                i = j;
                j++;
            }
        }
        return p;
    }
};

int main()
{
    
    return 0;
}
