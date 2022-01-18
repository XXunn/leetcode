#include <bits/stdc++.h>

using namespace std;

class Solution1 {
public:
    string reverseVowels(string s) {
        auto isVowel = [vowels = "aeiouAEIOU"s](char ch) {
            return vowels.find(ch) != string::npos;
        };

        int n = s.size();
        int i = 0, j = n - 1;
        while (i < j) {
            while (i < n && !isVowel(s[i])) {
                ++i;
            }
            while (j > 0 && !isVowel(s[j])) {
                --j;
            }
            if (i < j) {
                swap(s[i], s[j]);
                ++i;
                --j;
            }
        }
        return s;
    }
};

class Solution2 {
public:
    bool is(char s) {
        if(s == 'a' || s == 'e' || s == 'i' || s =='o' || s == 'u'
        || s == 'A' || s == 'E' || s == 'I' || s =='O' || s == 'U')
            return true;
        return false;
    }
    string reverseVowels(string s) {
        int i,j;
        int n = s.length();
        for(i = 0, j = n-1; i < j;) {
            if(!is(s[i]))     i++;            
            if(!is(s[j]))     j--;
            if(is(s[i]) && is(s[j])) {
                swap(s[i], s[j]);
                i++;
                j--;
            }
        }
        return s;
    }
};

int main()
{
    
    return 0;
}
