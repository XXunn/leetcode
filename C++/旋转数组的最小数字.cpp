#include<iostream>
#include<vector>
#include<string>
using namespace std;
class Solution {
public:
    int minArray(vector<int>& numbers) {
        int minn = numbers[0];
        for(int i = 1;i < numbers.size();i++) {
            if(minn > numbers[i])
                minn = numbers[i];
        }
        return minn;
    }
    int minArray2(vector<int>& numbers) {
        int l = 0, r = numbers.size()-1;
        while(l <= r) {
            int mid = l + (r-l)/2;
            if(numbers[mid]>numbers[mid+1])
                return numbers[mid+1];
            r = mid;
        }
    }
};

int main() {
    Solution solution;
    
}