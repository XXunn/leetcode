#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    int getLastMoment(int n, vector<int>& left, vector<int>& right) {
        int left_max = 0;
        int right_max = 0;
        for(int i = 0;i < left.size();i++)
            if(left_max<left[i])    left_max = left[i];
        for(int i = 0;i < right.size();i++) 
            if(n-right[i]>right_max)    right_max = n-right[i];
        return max(left_max,right_max);
    }
};

int main()
{
    
    return 0;
}
