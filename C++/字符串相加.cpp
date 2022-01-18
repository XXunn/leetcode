#include <iostream>
#include <string>
#include <vector>
using namespace std;
// 大数模板
class Solution {
public:
    string addStrings(string num1, string num2) {
        int sum = 0,i = num1.size() - 1,j = num2.size() - 1;
        string ans="";
        while(i >= 0 || j >= 0 || sum) {
            if(i >= 0)  sum += num1[i--] - '0';
            if(j >= 0)  sum += num2[j--] - '0';
            ans = (char)('0' + sum % 10) + ans;
            sum /= 10;
        }
        return ans;
    }
    int removeDuplicates(vector<int>& nums) {
        int i = 0;
        for(int k = 0;k < nums.size();k++) {
            if(i < 2 || nums[k] > nums[i-2])    nums[i++] = nums[k];
        }
        return i;
    }
};
int main()
{  
    vector<int>vec;
    vec.push_back(0);
    vec.push_back(0);
    vec.push_back(1);
    vec.push_back(1);
    vec.push_back(1);
    vec.push_back(1);
    // vec.push_back(2);
    // vec.push_back(2);
    // vec.push_back(2);
    // vec.push_back(3);

    Solution slt;
    cout << slt.removeDuplicates(vec) << endl;
    for(int i = 0;i < vec.size();i++)
        cout << vec[i] << " ";
    return 0;
}
